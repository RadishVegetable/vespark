package com.veg.vespark.catalyst.codegen;// Generated from D:/JAVAWORK/BigData/vespark/vespark-catalyst/antlr4/VeSqlBase.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VeSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SELECT=5, FROM=6, ADD=7, AS=8, ALL=9, 
		ANY=10, DISTINCT=11, WHERE=12, GROUP=13, BY=14, GROUPING=15, SETS=16, 
		CUBE=17, ROLLUP=18, ORDER=19, HAVING=20, LIMIT=21, AT=22, OR=23, AND=24, 
		IN=25, NOT=26, NO=27, EXISTS=28, BETWEEN=29, LIKE=30, RLIKE=31, IS=32, 
		NULL=33, TRUE=34, FALSE=35, NULLS=36, ASC=37, DESC=38, FOR=39, INTERVAL=40, 
		CASE=41, WHEN=42, THEN=43, ELSE=44, END=45, JOIN=46, CROSS=47, OUTER=48, 
		INNER=49, LEFT=50, SEMI=51, RIGHT=52, FULL=53, NATURAL=54, ON=55, PIVOT=56, 
		LATERAL=57, WINDOW=58, OVER=59, PARTITION=60, RANGE=61, ROWS=62, UNBOUNDED=63, 
		PRECEDING=64, FOLLOWING=65, CURRENT=66, FIRST=67, AFTER=68, LAST=69, ROW=70, 
		WITH=71, VALUES=72, CREATE=73, TABLE=74, DIRECTORY=75, VIEW=76, REPLACE=77, 
		INSERT=78, DELETE=79, INTO=80, DESCRIBE=81, EXPLAIN=82, FORMAT=83, LOGICAL=84, 
		CODEGEN=85, COST=86, CAST=87, SHOW=88, TABLES=89, COLUMNS=90, COLUMN=91, 
		USE=92, PARTITIONS=93, FUNCTIONS=94, DROP=95, UNION=96, EXCEPT=97, SETMINUS=98, 
		INTERSECT=99, TO=100, TABLESAMPLE=101, STRATIFY=102, ALTER=103, RENAME=104, 
		ARRAY=105, MAP=106, STRUCT=107, COMMENT=108, SET=109, RESET=110, DATA=111, 
		START=112, TRANSACTION=113, COMMIT=114, ROLLBACK=115, MACRO=116, IGNORE=117, 
		BOTH=118, LEADING=119, TRAILING=120, IF=121, POSITION=122, EXTRACT=123, 
		EQ=124, NSEQ=125, NEQ=126, NEQJ=127, LT=128, LTE=129, GT=130, GTE=131, 
		PLUS=132, MINUS=133, ASTERISK=134, SLASH=135, PERCENT=136, DIV=137, TILDE=138, 
		AMPERSAND=139, PIPE=140, CONCAT_PIPE=141, HAT=142, PERCENTLIT=143, BUCKET=144, 
		OUT=145, OF=146, SORT=147, CLUSTER=148, DISTRIBUTE=149, OVERWRITE=150, 
		TRANSFORM=151, REDUCE=152, USING=153, SERDE=154, SERDEPROPERTIES=155, 
		RECORDREADER=156, RECORDWRITER=157, DELIMITED=158, FIELDS=159, TERMINATED=160, 
		COLLECTION=161, ITEMS=162, KEYS=163, ESCAPED=164, LINES=165, SEPARATED=166, 
		FUNCTION=167, EXTENDED=168, REFRESH=169, CLEAR=170, CACHE=171, UNCACHE=172, 
		LAZY=173, FORMATTED=174, GLOBAL=175, TEMPORARY=176, OPTIONS=177, UNSET=178, 
		TBLPROPERTIES=179, DBPROPERTIES=180, BUCKETS=181, SKEWED=182, STORED=183, 
		DIRECTORIES=184, LOCATION=185, EXCHANGE=186, ARCHIVE=187, UNARCHIVE=188, 
		FILEFORMAT=189, TOUCH=190, COMPACT=191, CONCATENATE=192, CHANGE=193, CASCADE=194, 
		RESTRICT=195, CLUSTERED=196, SORTED=197, PURGE=198, INPUTFORMAT=199, OUTPUTFORMAT=200, 
		DATABASE=201, DATABASES=202, DFS=203, TRUNCATE=204, ANALYZE=205, COMPUTE=206, 
		LIST=207, STATISTICS=208, PARTITIONED=209, EXTERNAL=210, DEFINED=211, 
		REVOKE=212, GRANT=213, LOCK=214, UNLOCK=215, MSCK=216, REPAIR=217, RECOVER=218, 
		EXPORT=219, IMPORT=220, LOAD=221, ROLE=222, ROLES=223, COMPACTIONS=224, 
		PRINCIPALS=225, TRANSACTIONS=226, INDEX=227, INDEXES=228, LOCKS=229, OPTION=230, 
		ANTI=231, LOCAL=232, INPATH=233, STRING=234, BIGINT_LITERAL=235, SMALLINT_LITERAL=236, 
		TINYINT_LITERAL=237, INTEGER_VALUE=238, DECIMAL_VALUE=239, DOUBLE_LITERAL=240, 
		BIGDECIMAL_LITERAL=241, IDENTIFIER=242, BACKQUOTED_IDENTIFIER=243, SIMPLE_COMMENT=244, 
		BRACKETED_EMPTY_COMMENT=245, BRACKETED_COMMENT=246, WS=247, UNRECOGNIZED=248;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_query = 2, RULE_queryNoWith = 3, 
		RULE_queryTerm = 4, RULE_queryPrimary = 5, RULE_sortItem = 6, RULE_querySpecification = 7, 
		RULE_fromClause = 8, RULE_relation = 9, RULE_relationPrimary = 10, RULE_tableIdentifier = 11, 
		RULE_tableAlias = 12, RULE_joinRelation = 13, RULE_joinCriteria = 14, 
		RULE_joinType = 15, RULE_setQuantifier = 16, RULE_namedExpressionSeq = 17, 
		RULE_namedExpression = 18, RULE_expression = 19, RULE_booleanExpression = 20, 
		RULE_predicate = 21, RULE_valueExpression = 22, RULE_primaryExpression = 23, 
		RULE_constant = 24, RULE_qualifiedName = 25, RULE_identifier = 26, RULE_strictIdentifier = 27, 
		RULE_quotedIdentifier = 28, RULE_comparisonOperator = 29, RULE_booleanValue = 30, 
		RULE_number = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "statement", "query", "queryNoWith", "queryTerm", 
			"queryPrimary", "sortItem", "querySpecification", "fromClause", "relation", 
			"relationPrimary", "tableIdentifier", "tableAlias", "joinRelation", "joinCriteria", 
			"joinType", "setQuantifier", "namedExpressionSeq", "namedExpression", 
			"expression", "booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"constant", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
			"comparisonOperator", "booleanValue", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'.'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", 
			"'ALL'", "'ANY'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", 
			"'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", 
			"'OR'", "'AND'", "'IN'", null, "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", 
			null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", "'DESC'", 
			"'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", 
			"'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", 
			"'FULL'", "'NATURAL'", "'ON'", "'PIVOT'", "'LATERAL'", "'WINDOW'", "'OVER'", 
			"'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", 
			"'CURRENT'", "'FIRST'", "'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", 
			"'CREATE'", "'TABLE'", "'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", 
			"'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", 
			"'CODEGEN'", "'COST'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", 
			"'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", 
			"'MINUS'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", 
			"'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", 
			"'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", 
			"'IGNORE'", "'BOTH'", "'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", 
			"'EXTRACT'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", 
			"'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", 
			"'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", "'USING'", 
			"'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", 
			"'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", 
			"'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", 
			"'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", 
			"'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", 
			"'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", 
			"'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
			"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
			"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
			"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", 
			"'EXTERNAL'", "'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", 
			"'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", 
			"'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", "'TRANSACTIONS'", 
			"'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", "'LOCAL'", "'INPATH'", 
			null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SELECT", "FROM", "ADD", "AS", "ALL", "ANY", 
			"DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", "ROLLUP", 
			"ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", 
			"BETWEEN", "LIKE", "RLIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", 
			"DESC", "FOR", "INTERVAL", "CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", 
			"CROSS", "OUTER", "INNER", "LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", 
			"ON", "PIVOT", "LATERAL", "WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", 
			"UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", 
			"ROW", "WITH", "VALUES", "CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", 
			"INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", 
			"CODEGEN", "COST", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", 
			"PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", 
			"TO", "TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", 
			"COMMENT", "SET", "RESET", "DATA", "START", "TRANSACTION", "COMMIT", 
			"ROLLBACK", "MACRO", "IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", 
			"EXTRACT", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", 
			"CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", 
			"SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", 
			"FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", 
			"SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", 
			"LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
			"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
			"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
			"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
			"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
			"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
			"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
			"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
			"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", 
			"ANTI", "LOCAL", "INPATH", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VeSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public VeSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VeSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			statement();
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new StatementDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryNoWithContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(VeSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(VeSqlBaseParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(VeSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(VeSqlBaseParser.INTEGER_VALUE, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			queryTerm();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(72);
				match(ORDER);
				setState(73);
				match(BY);
				setState(74);
				((QueryNoWithContext)_localctx).sortItem = sortItem();
				((QueryNoWithContext)_localctx).order.add(((QueryNoWithContext)_localctx).sortItem);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(75);
					match(T__0);
					setState(76);
					sortItem();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(84);
				match(LIMIT);
				setState(85);
				((QueryNoWithContext)_localctx).limit = match(INTEGER_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		QueryTermContext _localctx = new QueryTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryTerm);
		try {
			_localctx = new QueryTermDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			queryPrimary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(VeSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SebqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SebqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterSebquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitSebquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitSebquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryPrimary);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(TABLE);
				setState(92);
				qualifiedName();
				}
				break;
			case T__1:
				_localctx = new SebqueryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__1);
				setState(94);
				queryNoWith();
				setState(95);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(VeSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(VeSqlBaseParser.DESC, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expression();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(100);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public TerminalNode SELECT() { return getToken(VeSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(VeSqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(VeSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(VeSqlBaseParser.BY, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_querySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SELECT);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(104);
				setQuantifier();
				}
			}

			setState(107);
			namedExpressionSeq();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(108);
				fromClause();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(111);
				match(WHERE);
				setState(112);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(115);
				match(GROUP);
				setState(116);
				match(BY);
				setState(117);
				((QuerySpecificationContext)_localctx).expression = expression();
				((QuerySpecificationContext)_localctx).groupingExpressions.add(((QuerySpecificationContext)_localctx).expression);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(118);
					match(T__0);
					setState(119);
					((QuerySpecificationContext)_localctx).expression = expression();
					((QuerySpecificationContext)_localctx).groupingExpressions.add(((QuerySpecificationContext)_localctx).expression);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(VeSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FROM);
			setState(128);
			relation();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(129);
				match(T__0);
				setState(130);
				relation();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			relationPrimary();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33425153484390400L) != 0) || _la==ANTI) {
				{
				{
				setState(137);
				joinRelation();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationPrimary);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				tableIdentifier();
				setState(144);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__1);
				setState(147);
				queryNoWith();
				setState(148);
				match(T__2);
				setState(149);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__1);
				setState(152);
				relation();
				setState(153);
				match(T__2);
				setState(154);
				tableAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(158);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(159);
				match(T__3);
				}
				break;
			}
			setState(163);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(VeSqlBaseParser.AS, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) {
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(165);
					match(AS);
					}
				}

				setState(168);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(VeSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(VeSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_joinRelation);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(171);
				joinType();
				}
				setState(172);
				match(JOIN);
				setState(173);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(174);
					joinCriteria();
					}
				}

				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(NATURAL);
				setState(178);
				joinType();
				setState(179);
				match(JOIN);
				setState(180);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(VeSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ON);
			setState(185);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(VeSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(VeSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(VeSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(VeSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(VeSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(VeSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(VeSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(VeSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_joinType);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(187);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(LEFT);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(192);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(LEFT);
				setState(196);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(RIGHT);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(198);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(FULL);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(202);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(205);
					match(LEFT);
					}
				}

				setState(208);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(VeSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(VeSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_namedExpressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			namedExpression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(214);
				match(T__0);
				setState(215);
				namedExpression();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(VeSqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_namedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expression();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) {
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(222);
					match(AS);
					}
				}

				setState(225);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(VeSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(VeSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(VeSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				match(NOT);
				setState(232);
				booleanExpression(4);
				}
				break;
			case T__1:
			case NULL:
			case TRUE:
			case FALSE:
			case PLUS:
			case MINUS:
			case ASTERISK:
			case TILDE:
			case STRING:
			case BIGINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				valueExpression(0);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(234);
					predicate();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(241);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(242);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(243);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(244);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode AND() { return getToken(VeSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(VeSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(VeSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(VeSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IS() { return getToken(VeSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(VeSqlBaseParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_predicate);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(250);
					match(NOT);
					}
				}

				setState(253);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(254);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(255);
				match(AND);
				setState(256);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(258);
					match(NOT);
					}
				}

				setState(261);
				((PredicateContext)_localctx).kind = match(IN);
				setState(262);
				match(T__1);
				setState(263);
				expression();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(264);
					match(T__0);
					setState(265);
					expression();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(273);
					match(NOT);
					}
				}

				setState(276);
				((PredicateContext)_localctx).kind = match(IN);
				setState(277);
				match(T__1);
				setState(278);
				query();
				setState(279);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(IS);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(282);
					match(NOT);
					}
				}

				setState(285);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(VeSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(VeSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(VeSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(VeSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(VeSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(VeSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(VeSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(VeSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(VeSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(VeSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(VeSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(289);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 67L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(291);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(294);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(295);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 15L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(297);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(298);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 515L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(300);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(301);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(302);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(305);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(308);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(309);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(310);
						comparisonOperator();
						setState(311);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(VeSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(319);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(ASTERISK);
				}
				break;
			case 3:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				qualifiedName();
				setState(322);
				match(T__3);
				setState(323);
				match(ASTERISK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
					((DereferenceContext)_localctx).base = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
					setState(327);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(328);
					match(T__3);
					setState(329);
					((DereferenceContext)_localctx).fieldName = identifier();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(VeSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends ConstantContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(VeSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VeSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(VeSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant);
		int _la;
		try {
			int _alt;
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				identifier();
				setState(337);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				number();
				}
				break;
			case 4:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				booleanValue();
				}
				break;
			case 5:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(342); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(341);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(344); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new ColumnReferenceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				identifier();
				}
				break;
			case 7:
				_localctx = new RowConstructorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(T__1);
				setState(348);
				namedExpression();
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349);
					match(T__0);
					setState(350);
					namedExpression();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(355);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			identifier();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(T__3);
					setState(361);
					identifier();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			strictIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackQuotedIdentifierContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public BackQuotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(VeSqlBaseParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_strictIdentifier);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				quotedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(VeSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(VeSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VeSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(VeSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(VeSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(VeSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(VeSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(VeSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(VeSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(VeSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VeSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(VeSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(VeSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(VeSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(VeSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(VeSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VeSqlBaseListener) ((VeSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VeSqlBaseVisitor) return ((VeSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(379);
					match(MINUS);
					}
				}

				setState(382);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(383);
					match(MINUS);
					}
				}

				setState(386);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(387);
					match(MINUS);
					}
				}

				setState(390);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(391);
					match(MINUS);
					}
				}

				setState(394);
				match(DOUBLE_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 22:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 23:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00f8\u018e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003"+
		"\f\u0003Q\t\u0003\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"W\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007j\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t"+
		"\u0007\u0003\u0007~\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0084"+
		"\b\b\n\b\f\b\u0087\t\b\u0001\t\u0001\t\u0005\t\u008b\b\t\n\t\f\t\u008e"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009d\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0003\f\u00a7\b\f\u0001\f\u0003\f\u00aa\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00b0\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"\u00bd\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c2\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c8"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00cc\b\u000f\u0001\u000f"+
		"\u0003\u000f\u00cf\b\u000f\u0001\u000f\u0003\u000f\u00d2\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d9"+
		"\b\u0011\n\u0011\f\u0011\u00dc\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e0\b\u0012\u0001\u0012\u0003\u0012\u00e3\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00ec\b\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00f6\b\u0014"+
		"\n\u0014\f\u0014\u00f9\t\u0014\u0001\u0015\u0003\u0015\u00fc\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0104\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u010b\b\u0015\n\u0015\f\u0015\u010e\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0113\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u011c\b\u0015\u0001\u0015\u0003\u0015\u011f\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0125\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u013a\b\u0016\n\u0016\f\u0016\u013d\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0146\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u014b\b"+
		"\u0017\n\u0017\f\u0017\u014e\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0157\b\u0018"+
		"\u000b\u0018\f\u0018\u0158\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0004\u0018\u0160\b\u0018\u000b\u0018\f\u0018\u0161\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0166\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u016b\b\u0019\n\u0019\f\u0019\u016e\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0174\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0003\u001f\u017d\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0181\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0185\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0189\b\u001f\u0001\u001f\u0003\u001f\u018c\b\u001f"+
		"\u0001\u001f\u0000\u0003(,. \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0007"+
		"\u0001\u0000%&\u0002\u0000\t\t\u000b\u000b\u0002\u0000\u0084\u0085\u008a"+
		"\u008a\u0001\u0000\u0086\u0089\u0002\u0000\u0084\u0085\u008d\u008d\u0001"+
		"\u0000|\u0083\u0001\u0000\"#\u01b6\u0000@\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006G\u0001"+
		"\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000\u0000\u0010\u007f"+
		"\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u009c"+
		"\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00a9"+
		"\u0001\u0000\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00b8"+
		"\u0001\u0000\u0000\u0000\u001e\u00d1\u0001\u0000\u0000\u0000 \u00d3\u0001"+
		"\u0000\u0000\u0000\"\u00d5\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000"+
		"\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000\u0000"+
		"*\u011e\u0001\u0000\u0000\u0000,\u0124\u0001\u0000\u0000\u0000.\u0145"+
		"\u0001\u0000\u0000\u00000\u0165\u0001\u0000\u0000\u00002\u0167\u0001\u0000"+
		"\u0000\u00004\u016f\u0001\u0000\u0000\u00006\u0173\u0001\u0000\u0000\u0000"+
		"8\u0175\u0001\u0000\u0000\u0000:\u0177\u0001\u0000\u0000\u0000<\u0179"+
		"\u0001\u0000\u0000\u0000>\u018b\u0001\u0000\u0000\u0000@A\u0003\u0002"+
		"\u0001\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000\u0000\u0000"+
		"CD\u0003\u0004\u0002\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0003\u0006"+
		"\u0003\u0000F\u0005\u0001\u0000\u0000\u0000GR\u0003\b\u0004\u0000HI\u0005"+
		"\u0013\u0000\u0000IJ\u0005\u000e\u0000\u0000JO\u0003\f\u0006\u0000KL\u0005"+
		"\u0001\u0000\u0000LN\u0003\f\u0006\u0000MK\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TU\u0005\u0015"+
		"\u0000\u0000UW\u0005\u00ee\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0003\n\u0005\u0000"+
		"Y\t\u0001\u0000\u0000\u0000Zb\u0003\u000e\u0007\u0000[\\\u0005J\u0000"+
		"\u0000\\b\u00032\u0019\u0000]^\u0005\u0002\u0000\u0000^_\u0003\u0006\u0003"+
		"\u0000_`\u0005\u0003\u0000\u0000`b\u0001\u0000\u0000\u0000aZ\u0001\u0000"+
		"\u0000\u0000a[\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000b\u000b"+
		"\u0001\u0000\u0000\u0000ce\u0003&\u0013\u0000df\u0007\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000"+
		"\u0000gi\u0005\u0005\u0000\u0000hj\u0003 \u0010\u0000ih\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0003\"\u0011"+
		"\u0000ln\u0003\u0010\b\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000op\u0005\f\u0000\u0000pr\u0003(\u0014"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r}\u0001\u0000"+
		"\u0000\u0000st\u0005\r\u0000\u0000tu\u0005\u000e\u0000\u0000uz\u0003&"+
		"\u0013\u0000vw\u0005\u0001\u0000\u0000wy\u0003&\u0013\u0000xv\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}s\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0085\u0003\u0012"+
		"\t\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u0084\u0003\u0012\t"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0011\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0003\u0014\n\u0000\u0089\u008b\u0003\u001a\r\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0003\u0016\u000b\u0000\u0090\u0091\u0003\u0018\f\u0000\u0091"+
		"\u009d\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093"+
		"\u0094\u0003\u0006\u0003\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095"+
		"\u0096\u0003\u0018\f\u0000\u0096\u009d\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0002\u0000\u0000\u0098\u0099\u0003\u0012\t\u0000\u0099\u009a\u0005"+
		"\u0003\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u008f\u0001\u0000\u0000\u0000\u009c\u0092\u0001\u0000"+
		"\u0000\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009d\u0015\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u00034\u001a\u0000\u009f\u00a0\u0005\u0004\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u00034\u001a\u0000\u00a4\u0017\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0005\b\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u00034\u001a\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0003\u001e\u000f\u0000\u00ac\u00ad\u0005.\u0000\u0000\u00ad\u00af\u0003"+
		"\u0014\n\u0000\u00ae\u00b0\u0003\u001c\u000e\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u00056\u0000\u0000\u00b2\u00b3\u0003\u001e\u000f"+
		"\u0000\u00b3\u00b4\u0005.\u0000\u0000\u00b4\u00b5\u0003\u0014\n\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u00057\u0000\u0000\u00b9\u00ba\u0003(\u0014\u0000\u00ba\u001d"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u00051\u0000\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00d2\u0001"+
		"\u0000\u0000\u0000\u00be\u00d2\u0005/\u0000\u0000\u00bf\u00c1\u00052\u0000"+
		"\u0000\u00c0\u00c2\u00050\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00d2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u00052\u0000\u0000\u00c4\u00d2\u00053\u0000\u0000\u00c5\u00c7"+
		"\u00054\u0000\u0000\u00c6\u00c8\u00050\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d2\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u00055\u0000\u0000\u00ca\u00cc\u00050\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00d2\u0001\u0000\u0000\u0000\u00cd\u00cf\u00052\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u00e7\u0000\u0000\u00d1"+
		"\u00bc\u0001\u0000\u0000\u0000\u00d1\u00be\u0001\u0000\u0000\u0000\u00d1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d1\u00c3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d2\u001f\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0007\u0001\u0000\u0000\u00d4!\u0001\u0000\u0000\u0000\u00d5\u00da"+
		"\u0003$\u0012\u0000\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7\u00d9\u0003"+
		"$\u0012\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e2\u0003&\u0013\u0000\u00de\u00e0\u0005\b\u0000\u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u00034\u001a\u0000\u00e2"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"%\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003(\u0014\u0000\u00e5\'\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0006\u0014\uffff\uffff\u0000\u00e7\u00e8"+
		"\u0005\u001a\u0000\u0000\u00e8\u00ee\u0003(\u0014\u0004\u00e9\u00eb\u0003"+
		",\u0016\u0000\u00ea\u00ec\u0003*\u0015\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f7\u0001\u0000\u0000\u0000\u00ef\u00f0\n\u0002\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0018\u0000\u0000\u00f1\u00f6\u0003(\u0014\u0003\u00f2"+
		"\u00f3\n\u0001\u0000\u0000\u00f3\u00f4\u0005\u0017\u0000\u0000\u00f4\u00f6"+
		"\u0003(\u0014\u0002\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8)\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u001a"+
		"\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001d"+
		"\u0000\u0000\u00fe\u00ff\u0003,\u0016\u0000\u00ff\u0100\u0005\u0018\u0000"+
		"\u0000\u0100\u0101\u0003,\u0016\u0000\u0101\u011f\u0001\u0000\u0000\u0000"+
		"\u0102\u0104\u0005\u001a\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005\u0019\u0000\u0000\u0106\u0107\u0005\u0002\u0000\u0000"+
		"\u0107\u010c\u0003&\u0013\u0000\u0108\u0109\u0005\u0001\u0000\u0000\u0109"+
		"\u010b\u0003&\u0013\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0003\u0000\u0000\u0110\u011f"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\u0005\u001a\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0019\u0000\u0000\u0115\u0116"+
		"\u0005\u0002\u0000\u0000\u0116\u0117\u0003\u0004\u0002\u0000\u0117\u0118"+
		"\u0005\u0003\u0000\u0000\u0118\u011f\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0005 \u0000\u0000\u011a\u011c\u0005\u001a\u0000\u0000\u011b\u011a\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011f\u0005!\u0000\u0000\u011e\u00fb\u0001\u0000"+
		"\u0000\u0000\u011e\u0103\u0001\u0000\u0000\u0000\u011e\u0112\u0001\u0000"+
		"\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011f+\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0006\u0016\uffff\uffff\u0000\u0121\u0125\u0003.\u0017"+
		"\u0000\u0122\u0123\u0007\u0002\u0000\u0000\u0123\u0125\u0003,\u0016\u0007"+
		"\u0124\u0120\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u013b\u0001\u0000\u0000\u0000\u0126\u0127\n\u0006\u0000\u0000\u0127"+
		"\u0128\u0007\u0003\u0000\u0000\u0128\u013a\u0003,\u0016\u0007\u0129\u012a"+
		"\n\u0005\u0000\u0000\u012a\u012b\u0007\u0004\u0000\u0000\u012b\u013a\u0003"+
		",\u0016\u0006\u012c\u012d\n\u0004\u0000\u0000\u012d\u012e\u0005\u008b"+
		"\u0000\u0000\u012e\u013a\u0003,\u0016\u0005\u012f\u0130\n\u0003\u0000"+
		"\u0000\u0130\u0131\u0005\u008e\u0000\u0000\u0131\u013a\u0003,\u0016\u0004"+
		"\u0132\u0133\n\u0002\u0000\u0000\u0133\u0134\u0005\u008c\u0000\u0000\u0134"+
		"\u013a\u0003,\u0016\u0003\u0135\u0136\n\u0001\u0000\u0000\u0136\u0137"+
		"\u0003:\u001d\u0000\u0137\u0138\u0003,\u0016\u0002\u0138\u013a\u0001\u0000"+
		"\u0000\u0000\u0139\u0126\u0001\u0000\u0000\u0000\u0139\u0129\u0001\u0000"+
		"\u0000\u0000\u0139\u012c\u0001\u0000\u0000\u0000\u0139\u012f\u0001\u0000"+
		"\u0000\u0000\u0139\u0132\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c-\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u0017\uffff"+
		"\uffff\u0000\u013f\u0146\u00030\u0018\u0000\u0140\u0146\u0005\u0086\u0000"+
		"\u0000\u0141\u0142\u00032\u0019\u0000\u0142\u0143\u0005\u0004\u0000\u0000"+
		"\u0143\u0144\u0005\u0086\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000"+
		"\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u0140\u0001\u0000\u0000\u0000"+
		"\u0145\u0141\u0001\u0000\u0000\u0000\u0146\u014c\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\n\u0001\u0000\u0000\u0148\u0149\u0005\u0004\u0000\u0000\u0149"+
		"\u014b\u00034\u001a\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b\u014e"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d/\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014f\u0166\u0005!\u0000\u0000\u0150\u0151\u00034\u001a"+
		"\u0000\u0151\u0152\u0005\u00ea\u0000\u0000\u0152\u0166\u0001\u0000\u0000"+
		"\u0000\u0153\u0166\u0003>\u001f\u0000\u0154\u0166\u0003<\u001e\u0000\u0155"+
		"\u0157\u0005\u00ea\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u0166\u0001\u0000\u0000\u0000\u015a"+
		"\u0166\u00034\u001a\u0000\u015b\u015c\u0005\u0002\u0000\u0000\u015c\u015f"+
		"\u0003$\u0012\u0000\u015d\u015e\u0005\u0001\u0000\u0000\u015e\u0160\u0003"+
		"$\u0012\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0003"+
		"\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u014f\u0001\u0000"+
		"\u0000\u0000\u0165\u0150\u0001\u0000\u0000\u0000\u0165\u0153\u0001\u0000"+
		"\u0000\u0000\u0165\u0154\u0001\u0000\u0000\u0000\u0165\u0156\u0001\u0000"+
		"\u0000\u0000\u0165\u015a\u0001\u0000\u0000\u0000\u0165\u015b\u0001\u0000"+
		"\u0000\u0000\u01661\u0001\u0000\u0000\u0000\u0167\u016c\u00034\u001a\u0000"+
		"\u0168\u0169\u0005\u0004\u0000\u0000\u0169\u016b\u00034\u001a\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"3\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u00036\u001b\u0000\u01705\u0001\u0000\u0000\u0000\u0171\u0174\u0005\u00f2"+
		"\u0000\u0000\u0172\u0174\u00038\u001c\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u01747\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0005\u00f3\u0000\u0000\u01769\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0007\u0005\u0000\u0000\u0178;\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0007\u0006\u0000\u0000\u017a=\u0001\u0000\u0000\u0000\u017b\u017d\u0005"+
		"\u0085\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u018c\u0005"+
		"\u00ef\u0000\u0000\u017f\u0181\u0005\u0085\u0000\u0000\u0180\u017f\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u018c\u0005\u00ee\u0000\u0000\u0183\u0185\u0005"+
		"\u0085\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u018c\u0005"+
		"\u00eb\u0000\u0000\u0187\u0189\u0005\u0085\u0000\u0000\u0188\u0187\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0005\u00f0\u0000\u0000\u018b\u017c\u0001"+
		"\u0000\u0000\u0000\u018b\u0180\u0001\u0000\u0000\u0000\u018b\u0184\u0001"+
		"\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c?\u0001\u0000"+
		"\u0000\u00004ORVaeimqz}\u0085\u008c\u009c\u00a1\u00a6\u00a9\u00af\u00b6"+
		"\u00bc\u00c1\u00c7\u00cb\u00ce\u00d1\u00da\u00df\u00e2\u00eb\u00ed\u00f5"+
		"\u00f7\u00fb\u0103\u010c\u0112\u011b\u011e\u0124\u0139\u013b\u0145\u014c"+
		"\u0158\u0161\u0165\u016c\u0173\u017c\u0180\u0184\u0188\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}