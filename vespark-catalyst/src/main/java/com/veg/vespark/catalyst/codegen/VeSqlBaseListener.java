package com.veg.vespark.catalyst.codegen;// Generated from D:/JAVAWORK/BigData/vespark/vespark-catalyst/antlr4/VeSqlBase.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VeSqlBaseParser}.
 */
public interface VeSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(VeSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(VeSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link VeSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(VeSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link VeSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(VeSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(VeSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(VeSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterQueryNoWith(VeSqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitQueryNoWith(VeSqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(VeSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(VeSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(VeSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(VeSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(VeSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(VeSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sebquery}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSebquery(VeSqlBaseParser.SebqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sebquery}
	 * labeled alternative in {@link VeSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSebquery(VeSqlBaseParser.SebqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(VeSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(VeSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(VeSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(VeSqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(VeSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(VeSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(VeSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(VeSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(VeSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(VeSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(VeSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(VeSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(VeSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link VeSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(VeSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(VeSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(VeSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(VeSqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(VeSqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(VeSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(VeSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(VeSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(VeSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(VeSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(VeSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(VeSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(VeSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(VeSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(VeSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(VeSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(VeSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VeSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VeSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(VeSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(VeSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(VeSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(VeSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(VeSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link VeSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(VeSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(VeSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(VeSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(VeSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(VeSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(VeSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(VeSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(VeSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(VeSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(VeSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link VeSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(VeSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(VeSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(VeSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(VeSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(VeSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(VeSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link VeSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(VeSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(VeSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(VeSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(VeSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(VeSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(VeSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(VeSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(VeSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(VeSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(VeSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(VeSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(VeSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(VeSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(VeSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link VeSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(VeSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(VeSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(VeSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VeSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VeSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(VeSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(VeSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(VeSqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link VeSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(VeSqlBaseParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(VeSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(VeSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VeSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VeSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VeSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(VeSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VeSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(VeSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(VeSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(VeSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(VeSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(VeSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(VeSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(VeSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(VeSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link VeSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(VeSqlBaseParser.DoubleLiteralContext ctx);
}