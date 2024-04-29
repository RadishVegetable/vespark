package com.veg.vespark.catalyst.parser;


import com.sun.org.apache.bcel.internal.generic.RET;
import com.veg.vespark.catalyst.codegen.VeSqlBaseBaseVisitor;

import com.veg.vespark.catalyst.codegen.VeSqlBaseParser;
import com.veg.vespark.catalyst.codegen.VeSqlBaseParser.*;
import com.veg.vespark.catalyst.expressions.*;
import com.veg.vespark.catalyst.expressions.literal.Literal;
import com.veg.vespark.catalyst.plans.logical.*;

import com.veg.vespark.catalyst.storage.common.Type;
import com.veg.vespark.catalyst.trees.TreeNode;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AstBuilder extends VeSqlBaseBaseVisitor<TreeNode> {
    @Override
    public TreeNode visitSingleStatement(SingleStatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public TreeNode visitQuery(QueryContext ctx) {
        return visit(ctx.queryNoWith());
    }

    @Override
    public TreeNode visitQuerySpecification(QuerySpecificationContext ctx) {
        TreeNode from = new OneRowRelation();
        if (ctx.fromClause() != null) {
            from = visitFromClause(ctx.fromClause());
        }
        return withQuerySpecification(ctx, from);

    }

    @Override
    public TreeNode visitFromClause(FromClauseContext ctx) {
        // TODO: join实现，目前仅针对一个表
        TreeNode left = null;
        List<RelationContext> relations = ctx.relation();
        for (RelationContext relation : relations) {
            left = visit(relation);
        }

        return left;
    }

    private TreeNode withQuerySpecification(QuerySpecificationContext ctx, TreeNode from) {
        TreeNode plan = from;
        // Expressions
        List<Expression> namedExpressions = ctx.namedExpressionSeq().namedExpression().stream().map(expression -> (Expression) visit(expression)).collect(Collectors.toList());

        // 仅实现select
        if (ctx.where != null) {
            plan = new Filter((Expression) visit(ctx.where), (LogicalPlan) plan);
        }

        // Project
         plan = new Project(namedExpressions, (LogicalPlan) plan);

        // Distinct

        return plan;
    }

    @Override
    public TreeNode visitTableName(TableNameContext ctx) {

        LogicalPlan tableId = new Relation(new TableIdentifier(ctx.tableIdentifier().table.getText(), Optional.ofNullable(ctx.tableIdentifier().db).map(RuleContext::getText)));
        // Alias
        LogicalPlan table = mayApplyAliasPlan(ctx.tableAlias(), tableId);
        return table;
    }

    private LogicalPlan mayApplyAliasPlan(TableAliasContext tableAlias, LogicalPlan plan) {
        if (tableAlias.identifier() != null) {
            return new SubqueryAlias(new AliasIdentifier(tableAlias.identifier().getText()), plan);
        } else
            return plan;
    }

    @Override
    public TreeNode visitLogicalNot(LogicalNotContext ctx) {
        return new Not((Expression) visit(ctx.booleanExpression()));
    }

    @Override
    public TreeNode visitPredicated(PredicatedContext ctx) {
        Expression e = (Expression) visit(ctx.valueExpression());
        if (ctx.predicate() != null) {
            return withPredicate(e, ctx.predicate());
        } else {
            return e;
        }
    }

    private Expression withPredicate(Expression e, PredicateContext ctx) {
        // TODO
        switch (ctx.kind.getType()) {
            case VeSqlBaseParser.BETWEEN:
                return invertIfNotDefined(new And(
                        new GreaterThanOrEqual(e, (Expression) visit(ctx.lower)),
                        new LessThanOrEqual(e, (Expression) visit(ctx.lower))), ctx);
            default:
                return null;
        }
    }

    @Override
    public TreeNode visitComparison(ComparisonContext ctx) {
        Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        TerminalNode operator = (TerminalNode) ctx.comparisonOperator().getChild(0);
        switch (operator.getSymbol().getType()) {
            case VeSqlBaseParser.EQ:
                return new EqualTo(left,right);
            case VeSqlBaseParser.NSEQ:
                return new EqualNullSafe(left,right);
            case VeSqlBaseParser.NEQ | VeSqlBaseParser.NEQJ:
                return new Not(new EqualTo(left,right));
            case VeSqlBaseParser.LT:
                return new LessThan(left,right);
            case VeSqlBaseParser.LTE:
                return new LessThanOrEqual(left,right);
            case VeSqlBaseParser.GT:
                return new GreaterThan(left,right);
            case VeSqlBaseParser.GTE:
                return new GreaterThanOrEqual(left,right);
            default:
                return null;
        }
    }

    @Override
    public TreeNode visitIntegerLiteral(IntegerLiteralContext ctx) {
        String number = ctx.getText();
        if(number.length() <= String.valueOf(Integer.MAX_VALUE).length()) {
            return new Literal(number, Type.INT_TYPE);
        } else {
            return new Literal(number,Type.LONG_TYPE);
        }
    }

    @Override
    public TreeNode visitStringLiteral(StringLiteralContext ctx) {
        return new Literal(ctx.getText(),Type.STRING_TYPE);
    }

    @Override
    public TreeNode visitBooleanLiteral(BooleanLiteralContext ctx) {
        return new Literal(ctx.getText(),Type.BOOLEAN_TYPE);
    }

    @Override
    public TreeNode visitColumnReference(ColumnReferenceContext ctx) {
        String text = ctx.getText();
        // TODO regex
        return new AttributeReference(text);
    }

    @Override
    public TreeNode visitDereference(DereferenceContext ctx) {
        // TODO 仅实现了 table.column
        String attr = ctx.fieldName.getText();
        TreeNode visited = visit(ctx.base);
        if(visited instanceof AttributeReference) {
            return new AttributeReference(((AttributeReference) visited).getName() + '.'+ attr);
        } else {
            return null;
        }
    }

    @Override
    public TreeNode visitBackQuotedIdentifier(BackQuotedIdentifierContext ctx) {
        return super.visitBackQuotedIdentifier(ctx);
    }

    private Expression invertIfNotDefined(Expression e, PredicateContext ctx) {
        if (ctx.NOT() != null) {
            return new Not(e);
        } else {
            return e;
        }
    }

}
