package com.veg.vespark.catalyst.codegen;// Generated from D:/JAVAWORK/BigData/vespark/vespark-catalyst/antlr4/VeSqlBase.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VeSqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VeSqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(VeSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link VeSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(VeSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(VeSqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(VeSqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(VeSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(VeSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(VeSqlBaseParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sebquery}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSebquery(VeSqlBaseParser.SebqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(VeSqlBaseParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(VeSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(VeSqlBaseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(VeSqlBaseParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(VeSqlBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(VeSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(VeSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(VeSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(VeSqlBaseParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(VeSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(VeSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(VeSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(VeSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(VeSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(VeSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VeSqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(VeSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(VeSqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(VeSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(VeSqlBaseParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(VeSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(VeSqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(VeSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(VeSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(VeSqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(VeSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(VeSqlBaseParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(VeSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(VeSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(VeSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(VeSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(VeSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(VeSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(VeSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(VeSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VeSqlBaseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(VeSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(VeSqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(VeSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(VeSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VeSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(VeSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(VeSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(VeSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(VeSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(VeSqlBaseParser.DoubleLiteralContext ctx);
}