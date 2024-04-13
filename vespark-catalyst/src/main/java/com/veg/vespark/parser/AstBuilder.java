package com.veg.vespark.parser;


import com.veg.vespark.codegen.VeSqlBaseBaseVisitor;

import com.veg.vespark.codegen.VeSqlBaseParser.*;
import com.veg.vespark.expressions.Expression;
import com.veg.vespark.plans.logical.*;
import com.veg.vespark.trees.TreeNode;

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
        TreeNode left = null;
        List<RelationContext> relations = ctx.relation();
        for (RelationContext relation : relations) {
            TreeNode right = visit(relation);
            // TODO: join实现

        }
        // TODO: 输出Relation对象
        return new OneRowRelation();
    }
    private TreeNode withQuerySpecification(QuerySpecificationContext ctx, TreeNode from) {

        // Expressions
        List<Expression> namedExpressions = ctx.namedExpressionSeq().namedExpression().stream().map(expression -> (Expression) visit(expression)).collect(Collectors.toList());

        // 仅实现select
        Filter filter = new Filter((Expression) visit(ctx.where), (LogicalPlan) from);


        // Project
        Project project = new Project(namedExpressions, filter);

        // Distinct

        return project;
    }
}
