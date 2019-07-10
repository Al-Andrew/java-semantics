// Generated from /home/alex/work/java-semantics/script/../src/main/java/grammar/parts/alk.g4 by ANTLR 4.7.1

    package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, TO=4, IF=5, ELSE=6, WHILE=7, DO=8, FOR=9, 
		FORALL=10, IN=11, FROM=12, OUT=13, CHOOSE=14, UNIFORM=15, REPEAT=16, RETURN=17, 
		SUCCESS=18, UNTIL=19, FAILURE=20, CONTINUE=21, BREAK=22, EMPTYSET=23, 
		EMPTYLIST=24, MODIFIES=25, INCLDUE=26, XOR=27, ABS=28, ACOS=29, ASIN=30, 
		ATAN=31, COS=32, LOG=33, PI=34, POW=35, SIN=36, SQRT=37, TAN=38, LEN=39, 
		AT=40, BELONGSTO=41, DELETE=42, EMPTY=43, END=44, FIRST=45, FLOAT=46, 
		INSERT=47, INTEGER=48, PRINT=49, POPBACK=50, POPFRONT=51, PUSHBACK=52, 
		PUSHFRONT=53, REMOVE=54, REMOVEALLEQTO=55, REMOVEAT=56, SINGLETONSET=57, 
		SIZE=58, SPLIT=59, TOPBACK=60, TOPFRONT=61, UPDATE=62, RANDOM=63, SOTHAT=64, 
		ARROW=65, NUMSIGN=66, UNION=67, INTERSECT=68, SUBTRACT=69, INT=70, DOUBLE=71, 
		BOOL=72, ID=73, PLUSPLUS=74, MINUSMINUS=75, BITWISE_AND=76, PLUSMOD=77, 
		MINUSMOD=78, PLUSPLUSMOD=79, MINUSMINUSMOD=80, LOWER=81, GREATER=82, LOWEREQ=83, 
		GREATEREQ=84, ISEQUAL=85, NOTEQUAL=86, ASSIGNMENT_OPERATOR=87, MINUS=88, 
		PLUS=89, MUL=90, DIV=91, MOD=92, LPAR=93, RPAR=94, LEFTSHIFT=95, RIGHTSHIFT=96, 
		OR=97, AND=98, NOT=99, SEMICOLON=100, DPOINT=101, VBAR=102, LCB=103, RCB=104, 
		COMMA=105, POINT=106, LBRA=107, RBRA=108, QUOTE=109, QUESTION=110, STRING=111;
	public static final int
		RULE_main = 0, RULE_statement_sequence = 1, RULE_statement = 2, RULE_directive = 3, 
		RULE_repeat_struct = 4, RULE_statement_block = 5, RULE_uniform = 6, RULE_choose = 7, 
		RULE_increase_decrease = 8, RULE_assignment = 9, RULE_while_struct = 10, 
		RULE_do_while_struct = 11, RULE_if_struct = 12, RULE_for_struct = 13, 
		RULE_start_assignment = 14, RULE_forall_struct = 15, RULE_function_decl = 16, 
		RULE_param = 17, RULE_expression = 18, RULE_logical_or_expression = 19, 
		RULE_logical_and_expression = 20, RULE_in_expression = 21, RULE_equality_expression = 22, 
		RULE_relational_expression = 23, RULE_set_expression = 24, RULE_bitwise_or = 25, 
		RULE_bitwise_and = 26, RULE_shift_expression = 27, RULE_additive_expression = 28, 
		RULE_multiplicative_expression = 29, RULE_unary_expression = 30, RULE_postfix_expression = 31, 
		RULE_factor = 32, RULE_value = 33, RULE_scalar_value = 34, RULE_ref_name = 35, 
		RULE_ref_name_chunk = 36, RULE_data_structure = 37, RULE_interval = 38, 
		RULE_spec = 39, RULE_array = 40, RULE_list = 41, RULE_structure = 42, 
		RULE_component = 43, RULE_set = 44, RULE_function_call = 45, RULE_builtin_method = 46, 
		RULE_method_name = 47, RULE_configuration = 48, RULE_variable = 49;
	public static final String[] ruleNames = {
		"main", "statement_sequence", "statement", "directive", "repeat_struct", 
		"statement_block", "uniform", "choose", "increase_decrease", "assignment", 
		"while_struct", "do_while_struct", "if_struct", "for_struct", "start_assignment", 
		"forall_struct", "function_decl", "param", "expression", "logical_or_expression", 
		"logical_and_expression", "in_expression", "equality_expression", "relational_expression", 
		"set_expression", "bitwise_or", "bitwise_and", "shift_expression", "additive_expression", 
		"multiplicative_expression", "unary_expression", "postfix_expression", 
		"factor", "value", "scalar_value", "ref_name", "ref_name_chunk", "data_structure", 
		"interval", "spec", "array", "list", "structure", "component", "set", 
		"function_call", "builtin_method", "method_name", "configuration", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'|->'", "'if'", "'else'", "'while'", "'do'", 
		"'for'", "'forall'", "'in'", "'from'", "'out'", "'choose'", "'uniform'", 
		"'repeat'", "'return'", "'success'", "'until'", "'failure'", "'continue'", 
		"'break'", "'emptySet'", "'emptyList'", "'modifies'", "'include'", "'xor'", 
		"'abs'", "'acos'", "'asin'", "'atan'", "'cos'", "'log'", "'pi'", "'pow'", 
		"'sin'", "'sqrt'", "'tan'", "'len'", "'at'", "'belongsTo'", "'delete'", 
		"'empty'", "'end'", "'first'", "'float'", "'insert'", "'int'", "'print'", 
		"'popBack'", "'popFront'", "'pushBack'", "'pushFront'", "'remove'", "'removeAllEqTo'", 
		"'removeAt'", "'singletonSet'", "'size'", "'split'", "'topBack'", "'topFront'", 
		"'update'", "'random'", "'s.t.'", "'->'", "'#'", "'U'", "'^'", "'\\'", 
		null, null, null, null, "'++'", "'--'", "'&'", "'+%'", "'-%'", "'++%'", 
		"'--%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", null, "'-'", "'+'", 
		"'*'", "'/'", "'%'", "'('", "')'", "'<<'", "'>>'", "'||'", "'&&'", "'!'", 
		"';'", "':'", "'|'", "'{'", "'}'", "','", "'.'", "'['", "']'", "'\"'", 
		"'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "TO", "IF", "ELSE", "WHILE", "DO", 
		"FOR", "FORALL", "IN", "FROM", "OUT", "CHOOSE", "UNIFORM", "REPEAT", "RETURN", 
		"SUCCESS", "UNTIL", "FAILURE", "CONTINUE", "BREAK", "EMPTYSET", "EMPTYLIST", 
		"MODIFIES", "INCLDUE", "XOR", "ABS", "ACOS", "ASIN", "ATAN", "COS", "LOG", 
		"PI", "POW", "SIN", "SQRT", "TAN", "LEN", "AT", "BELONGSTO", "DELETE", 
		"EMPTY", "END", "FIRST", "FLOAT", "INSERT", "INTEGER", "PRINT", "POPBACK", 
		"POPFRONT", "PUSHBACK", "PUSHFRONT", "REMOVE", "REMOVEALLEQTO", "REMOVEAT", 
		"SINGLETONSET", "SIZE", "SPLIT", "TOPBACK", "TOPFRONT", "UPDATE", "RANDOM", 
		"SOTHAT", "ARROW", "NUMSIGN", "UNION", "INTERSECT", "SUBTRACT", "INT", 
		"DOUBLE", "BOOL", "ID", "PLUSPLUS", "MINUSMINUS", "BITWISE_AND", "PLUSMOD", 
		"MINUSMOD", "PLUSPLUSMOD", "MINUSMINUSMOD", "LOWER", "GREATER", "LOWEREQ", 
		"GREATEREQ", "ISEQUAL", "NOTEQUAL", "ASSIGNMENT_OPERATOR", "MINUS", "PLUS", 
		"MUL", "DIV", "MOD", "LPAR", "RPAR", "LEFTSHIFT", "RIGHTSHIFT", "OR", 
		"AND", "NOT", "SEMICOLON", "DPOINT", "VBAR", "LCB", "RCB", "COMMA", "POINT", 
		"LBRA", "RBRA", "QUOTE", "QUESTION", "STRING"
	};
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
	public String getGrammarFileName() { return "alk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartPointContext extends MainContext {
		public TerminalNode EOF() { return getToken(alkParser.EOF, 0); }
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public StartPointContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStartPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			_localctx = new StartPointContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FORALL) | (1L << CHOOSE) | (1L << UNIFORM) | (1L << REPEAT) | (1L << RETURN) | (1L << SUCCESS) | (1L << FAILURE) | (1L << CONTINUE) | (1L << BREAK) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NUMSIGN - 66)) | (1L << (ID - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (PLUSPLUSMOD - 66)) | (1L << (MINUSMINUSMOD - 66)) | (1L << (LCB - 66)))) != 0)) {
				{
				setState(100);
				statement_sequence();
				}
			}

			setState(103);
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

	public static class Statement_sequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public Statement_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_sequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStatement_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_sequenceContext statement_sequence() throws RecognitionException {
		Statement_sequenceContext _localctx = new Statement_sequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_sequence);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				statement();
				setState(107);
				statement_sequence();
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
	public static class ToDirectiveContext extends StatementContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public ToDirectiveContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToWhileContext extends StatementContext {
		public While_structContext while_struct() {
			return getRuleContext(While_structContext.class,0);
		}
		public ToWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToDoWhileContext extends StatementContext {
		public Do_while_structContext do_while_struct() {
			return getRuleContext(Do_while_structContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToForAllContext extends StatementContext {
		public Forall_structContext forall_struct() {
			return getRuleContext(Forall_structContext.class,0);
		}
		public ToForAllContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends StatementContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public Builtin_methodContext builtin_method() {
			return getRuleContext(Builtin_methodContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public TerminalNode POINT() { return getToken(alkParser.POINT, 0); }
		public TerminalNode ARROW() { return getToken(alkParser.ARROW, 0); }
		public MethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuccessContext extends StatementContext {
		public TerminalNode SUCCESS() { return getToken(alkParser.SUCCESS, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public SuccessContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSuccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(alkParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChooseStmContext extends StatementContext {
		public ChooseContext choose() {
			return getRuleContext(ChooseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ChooseStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitChooseStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToRepeatContext extends StatementContext {
		public Repeat_structContext repeat_struct() {
			return getRuleContext(Repeat_structContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToRepeatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIncreaseDecreaseContext extends StatementContext {
		public Increase_decreaseContext increase_decrease() {
			return getRuleContext(Increase_decreaseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToIncreaseDecreaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToIncreaseDecrease(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(alkParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToBlockContext extends StatementContext {
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public ToBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends StatementContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public FunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniformStmContext extends StatementContext {
		public UniformContext uniform() {
			return getRuleContext(UniformContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public UniformStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitUniformStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(alkParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToForContext extends StatementContext {
		public For_structContext for_struct() {
			return getRuleContext(For_structContext.class,0);
		}
		public ToForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToFunctionDeclContext extends StatementContext {
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public ToFunctionDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailureContext extends StatementContext {
		public TerminalNode FAILURE() { return getToken(alkParser.FAILURE, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public FailureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFailure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToAssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIfContext extends StatementContext {
		public If_structContext if_struct() {
			return getRuleContext(If_structContext.class,0);
		}
		public ToIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				ref_name();
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==ARROW || _la==POINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				builtin_method();
				setState(114);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				function_call();
				setState(117);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ToFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				function_decl();
				}
				break;
			case 4:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(RETURN);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
					{
					setState(121);
					expression();
					}
				}

				setState(124);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new ChooseStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				choose();
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new UniformStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				uniform();
				setState(129);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new SuccessContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(SUCCESS);
				setState(132);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new FailureContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				match(FAILURE);
				setState(134);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(135);
				match(CONTINUE);
				setState(136);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				match(BREAK);
				setState(138);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new ToAssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				assignment();
				setState(140);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ToIncreaseDecreaseContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(142);
				increase_decrease();
				setState(143);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ToBlockContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				statement_block();
				}
				break;
			case 14:
				_localctx = new ToDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				directive();
				}
				break;
			case 15:
				_localctx = new ToRepeatContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(147);
				repeat_struct();
				setState(148);
				match(SEMICOLON);
				}
				break;
			case 16:
				_localctx = new ToWhileContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(150);
				while_struct();
				}
				break;
			case 17:
				_localctx = new ToDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(151);
				do_while_struct();
				setState(152);
				match(SEMICOLON);
				}
				break;
			case 18:
				_localctx = new ToIfContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(154);
				if_struct();
				}
				break;
			case 19:
				_localctx = new ToForContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(155);
				for_struct();
				}
				break;
			case 20:
				_localctx = new ToForAllContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(156);
				forall_struct();
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

	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncludeContext extends DirectiveContext {
		public TerminalNode NUMSIGN() { return getToken(alkParser.NUMSIGN, 0); }
		public TerminalNode INCLDUE() { return getToken(alkParser.INCLDUE, 0); }
		public TerminalNode STRING() { return getToken(alkParser.STRING, 0); }
		public IncludeContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directive);
		try {
			_localctx = new IncludeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(NUMSIGN);
			setState(160);
			match(INCLDUE);
			setState(161);
			match(STRING);
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

	public static class Repeat_structContext extends ParserRuleContext {
		public Repeat_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_struct; }
	 
		public Repeat_structContext() { }
		public void copyFrom(Repeat_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepeatStructureContext extends Repeat_structContext {
		public TerminalNode REPEAT() { return getToken(alkParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(alkParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public RepeatStructureContext(Repeat_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRepeatStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_structContext repeat_struct() throws RecognitionException {
		Repeat_structContext _localctx = new Repeat_structContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeat_struct);
		try {
			_localctx = new RepeatStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(REPEAT);
			setState(164);
			statement();
			setState(165);
			match(UNTIL);
			setState(166);
			match(LPAR);
			setState(167);
			expression();
			setState(168);
			match(RPAR);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	 
		public Statement_blockContext() { }
		public void copyFrom(Statement_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyBlockContext extends Statement_blockContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public EmptyBlockContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEmptyBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends Statement_blockContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public BlockContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement_block);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(LCB);
				setState(171);
				statement_sequence();
				setState(172);
				match(RCB);
				}
				break;
			case 2:
				_localctx = new EmptyBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(LCB);
				setState(175);
				match(RCB);
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

	public static class UniformContext extends ParserRuleContext {
		public UniformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniform; }
	 
		public UniformContext() { }
		public void copyFrom(UniformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UniformStmtContext extends UniformContext {
		public TerminalNode UNIFORM() { return getToken(alkParser.UNIFORM, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UniformStmtContext(UniformContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitUniformStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniformContext uniform() throws RecognitionException {
		UniformContext _localctx = new UniformContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_uniform);
		try {
			_localctx = new UniformStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(UNIFORM);
			setState(179);
			match(ID);
			setState(180);
			match(IN);
			setState(181);
			expression();
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

	public static class ChooseContext extends ParserRuleContext {
		public ChooseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose; }
	 
		public ChooseContext() { }
		public void copyFrom(ChooseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChooseStmtContext extends ChooseContext {
		public TerminalNode CHOOSE() { return getToken(alkParser.CHOOSE, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SOTHAT() { return getToken(alkParser.SOTHAT, 0); }
		public ChooseStmtContext(ChooseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitChooseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseContext choose() throws RecognitionException {
		ChooseContext _localctx = new ChooseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choose);
		int _la;
		try {
			_localctx = new ChooseStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CHOOSE);
			setState(184);
			match(ID);
			setState(185);
			match(IN);
			setState(186);
			expression();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOTHAT) {
				{
				setState(187);
				match(SOTHAT);
				setState(188);
				expression();
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

	public static class Increase_decreaseContext extends ParserRuleContext {
		public Increase_decreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_decrease; }
	 
		public Increase_decreaseContext() { }
		public void copyFrom(Increase_decreaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtMinusMinusContext extends Increase_decreaseContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public StmtMinusMinusContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStmtMinusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusStmtContext extends Increase_decreaseContext {
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public PlusPlusStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPlusPlusStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusModStmtContext extends Increase_decreaseContext {
		public TerminalNode PLUSPLUSMOD() { return getToken(alkParser.PLUSPLUSMOD, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public PlusPlusModStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPlusPlusModStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusMinusStmtContext extends Increase_decreaseContext {
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public MinusMinusStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMinusMinusStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPlusPlusContext extends Increase_decreaseContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public StmtPlusPlusContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStmtPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusMinusModStmtContext extends Increase_decreaseContext {
		public TerminalNode MINUSMINUSMOD() { return getToken(alkParser.MINUSMINUSMOD, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public MinusMinusModStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMinusMinusModStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_decreaseContext increase_decrease() throws RecognitionException {
		Increase_decreaseContext _localctx = new Increase_decreaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_increase_decrease);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PlusPlusStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(PLUSPLUS);
				setState(192);
				ref_name();
				}
				break;
			case 2:
				_localctx = new StmtPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				ref_name();
				setState(194);
				match(PLUSPLUS);
				}
				break;
			case 3:
				_localctx = new MinusMinusStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(MINUSMINUS);
				setState(197);
				ref_name();
				}
				break;
			case 4:
				_localctx = new StmtMinusMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				ref_name();
				setState(199);
				match(MINUSMINUS);
				}
				break;
			case 5:
				_localctx = new PlusPlusModStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(PLUSPLUSMOD);
				setState(202);
				ref_name();
				}
				break;
			case 6:
				_localctx = new MinusMinusModStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(MINUSMINUSMOD);
				setState(204);
				ref_name();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStmtContext extends AssignmentContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(alkParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			_localctx = new AssignmentStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			ref_name();
			setState(208);
			match(ASSIGNMENT_OPERATOR);
			setState(209);
			expression();
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

	public static class While_structContext extends ParserRuleContext {
		public While_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_struct; }
	 
		public While_structContext() { }
		public void copyFrom(While_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStructureContext extends While_structContext {
		public TerminalNode WHILE() { return getToken(alkParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStructureContext(While_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitWhileStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_structContext while_struct() throws RecognitionException {
		While_structContext _localctx = new While_structContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_struct);
		try {
			_localctx = new WhileStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			match(LPAR);
			setState(213);
			expression();
			setState(214);
			match(RPAR);
			setState(215);
			statement();
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

	public static class Do_while_structContext extends ParserRuleContext {
		public Do_while_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_struct; }
	 
		public Do_while_structContext() { }
		public void copyFrom(Do_while_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileStructureContext extends Do_while_structContext {
		public TerminalNode DO() { return getToken(alkParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(alkParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public DoWhileStructureContext(Do_while_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDoWhileStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_structContext do_while_struct() throws RecognitionException {
		Do_while_structContext _localctx = new Do_while_structContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_do_while_struct);
		try {
			_localctx = new DoWhileStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DO);
			setState(218);
			statement();
			setState(219);
			match(WHILE);
			setState(220);
			match(LPAR);
			setState(221);
			expression();
			setState(222);
			match(RPAR);
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

	public static class If_structContext extends ParserRuleContext {
		public If_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_struct; }
	 
		public If_structContext() { }
		public void copyFrom(If_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStructureContext extends If_structContext {
		public TerminalNode IF() { return getToken(alkParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(alkParser.ELSE, 0); }
		public IfStructureContext(If_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIfStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structContext if_struct() throws RecognitionException {
		If_structContext _localctx = new If_structContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_struct);
		try {
			_localctx = new IfStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IF);
			setState(225);
			match(LPAR);
			setState(226);
			expression();
			setState(227);
			match(RPAR);
			setState(228);
			statement();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(229);
				match(ELSE);
				setState(230);
				statement();
				}
				break;
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

	public static class For_structContext extends ParserRuleContext {
		public For_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_struct; }
	 
		public For_structContext() { }
		public void copyFrom(For_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStructureContext extends For_structContext {
		public TerminalNode FOR() { return getToken(alkParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(alkParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(alkParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Increase_decreaseContext increase_decrease() {
			return getRuleContext(Increase_decreaseContext.class,0);
		}
		public Start_assignmentContext start_assignment() {
			return getRuleContext(Start_assignmentContext.class,0);
		}
		public ForStructureContext(For_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_structContext for_struct() throws RecognitionException {
		For_structContext _localctx = new For_structContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_struct);
		int _la;
		try {
			_localctx = new ForStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(FOR);
			setState(234);
			match(LPAR);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (ABS - 28)) | (1L << (ACOS - 28)) | (1L << (ASIN - 28)) | (1L << (ATAN - 28)) | (1L << (COS - 28)) | (1L << (LOG - 28)) | (1L << (PI - 28)) | (1L << (POW - 28)) | (1L << (SIN - 28)) | (1L << (SQRT - 28)) | (1L << (TAN - 28)) | (1L << (LEN - 28)) | (1L << (AT - 28)) | (1L << (DELETE - 28)) | (1L << (END - 28)) | (1L << (FIRST - 28)) | (1L << (FLOAT - 28)) | (1L << (INSERT - 28)) | (1L << (INTEGER - 28)) | (1L << (PRINT - 28)) | (1L << (POPBACK - 28)) | (1L << (POPFRONT - 28)) | (1L << (PUSHBACK - 28)) | (1L << (PUSHFRONT - 28)) | (1L << (REMOVE - 28)) | (1L << (REMOVEALLEQTO - 28)) | (1L << (REMOVEAT - 28)) | (1L << (SINGLETONSET - 28)) | (1L << (SIZE - 28)) | (1L << (SPLIT - 28)) | (1L << (TOPBACK - 28)) | (1L << (TOPFRONT - 28)) | (1L << (UPDATE - 28)) | (1L << (RANDOM - 28)) | (1L << (ID - 28)))) != 0)) {
				{
				setState(235);
				start_assignment();
				}
			}

			setState(238);
			match(SEMICOLON);
			setState(239);
			expression();
			setState(240);
			match(SEMICOLON);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(241);
				assignment();
				}
				break;
			case 2:
				{
				setState(242);
				increase_decrease();
				}
				break;
			}
			setState(245);
			match(RPAR);
			setState(246);
			statement();
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

	public static class Start_assignmentContext extends ParserRuleContext {
		public Start_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_assignment; }
	 
		public Start_assignmentContext() { }
		public void copyFrom(Start_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStartContext extends Start_assignmentContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForStartContext(Start_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_assignmentContext start_assignment() throws RecognitionException {
		Start_assignmentContext _localctx = new Start_assignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start_assignment);
		try {
			_localctx = new ForStartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			assignment();
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

	public static class Forall_structContext extends ParserRuleContext {
		public Forall_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_struct; }
	 
		public Forall_structContext() { }
		public void copyFrom(Forall_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForAllStructureContext extends Forall_structContext {
		public TerminalNode FORALL() { return getToken(alkParser.FORALL, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForAllStructureContext(Forall_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForAllStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forall_structContext forall_struct() throws RecognitionException {
		Forall_structContext _localctx = new Forall_structContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forall_struct);
		try {
			_localctx = new ForAllStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FORALL);
			setState(251);
			match(ID);
			setState(252);
			match(IN);
			setState(253);
			expression();
			setState(254);
			statement();
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

	public static class Function_declContext extends ParserRuleContext {
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
	 
		public Function_declContext() { }
		public void copyFrom(Function_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclContext extends Function_declContext {
		public List<TerminalNode> ID() { return getTokens(alkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(alkParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode MODIFIES() { return getToken(alkParser.MODIFIES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public FunctionDeclContext(Function_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_decl);
		int _la;
		try {
			_localctx = new FunctionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(LPAR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==ID) {
				{
				setState(258);
				param();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(259);
					match(COMMA);
					setState(260);
					param();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(268);
			match(RPAR);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIES) {
				{
				setState(269);
				match(MODIFIES);
				setState(270);
				match(ID);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271);
					match(COMMA);
					setState(272);
					match(ID);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
			statement_block();
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

	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamDefinitionContext extends ParamContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode OUT() { return getToken(alkParser.OUT, 0); }
		public ParamDefinitionContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitParamDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		int _la;
		try {
			_localctx = new ParamDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT) {
				{
				setState(282);
				match(OUT);
				}
			}

			setState(285);
			match(ID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(alkParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DPOINT() { return getToken(alkParser.DPOINT, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			_localctx = new ConditionalExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			logical_or_expression();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(288);
				match(QUESTION);
				setState(289);
				expression();
				setState(290);
				match(DPOINT);
				setState(291);
				expression();
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	 
		public Logical_or_expressionContext() { }
		public void copyFrom(Logical_or_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpressionContext extends Logical_or_expressionContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(alkParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(alkParser.OR, i);
		}
		public LogicalOrExpressionContext(Logical_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logical_or_expression);
		int _la;
		try {
			_localctx = new LogicalOrExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			logical_and_expression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(296);
				match(OR);
				setState(297);
				logical_and_expression();
				}
				}
				setState(302);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	 
		public Logical_and_expressionContext() { }
		public void copyFrom(Logical_and_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpressionContext extends Logical_and_expressionContext {
		public List<In_expressionContext> in_expression() {
			return getRuleContexts(In_expressionContext.class);
		}
		public In_expressionContext in_expression(int i) {
			return getRuleContext(In_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(alkParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(alkParser.AND, i);
		}
		public LogicalAndExpressionContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logical_and_expression);
		int _la;
		try {
			_localctx = new LogicalAndExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			in_expression();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(304);
				match(AND);
				setState(305);
				in_expression();
				}
				}
				setState(310);
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

	public static class In_expressionContext extends ParserRuleContext {
		public In_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_expression; }
	 
		public In_expressionContext() { }
		public void copyFrom(In_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InExpressionContext extends In_expressionContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(alkParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(alkParser.IN, i);
		}
		public InExpressionContext(In_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_expressionContext in_expression() throws RecognitionException {
		In_expressionContext _localctx = new In_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_in_expression);
		int _la;
		try {
			_localctx = new InExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			equality_expression();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(312);
				match(IN);
				setState(313);
				equality_expression();
				}
				}
				setState(318);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	 
		public Equality_expressionContext() { }
		public void copyFrom(Equality_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpressionContext extends Equality_expressionContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> ISEQUAL() { return getTokens(alkParser.ISEQUAL); }
		public TerminalNode ISEQUAL(int i) {
			return getToken(alkParser.ISEQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(alkParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(alkParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(Equality_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equality_expression);
		int _la;
		try {
			_localctx = new EqualityExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			relational_expression();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ISEQUAL || _la==NOTEQUAL) {
				{
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==ISEQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				relational_expression();
				}
				}
				setState(326);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	 
		public Relational_expressionContext() { }
		public void copyFrom(Relational_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpressionContext extends Relational_expressionContext {
		public List<Set_expressionContext> set_expression() {
			return getRuleContexts(Set_expressionContext.class);
		}
		public Set_expressionContext set_expression(int i) {
			return getRuleContext(Set_expressionContext.class,i);
		}
		public List<TerminalNode> LOWER() { return getTokens(alkParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(alkParser.LOWER, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(alkParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(alkParser.GREATER, i);
		}
		public List<TerminalNode> LOWEREQ() { return getTokens(alkParser.LOWEREQ); }
		public TerminalNode LOWEREQ(int i) {
			return getToken(alkParser.LOWEREQ, i);
		}
		public List<TerminalNode> GREATEREQ() { return getTokens(alkParser.GREATEREQ); }
		public TerminalNode GREATEREQ(int i) {
			return getToken(alkParser.GREATEREQ, i);
		}
		public RelationalExpressionContext(Relational_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			_localctx = new RelationalExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			set_expression();
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					_la = _input.LA(1);
					if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LOWER - 81)) | (1L << (GREATER - 81)) | (1L << (LOWEREQ - 81)) | (1L << (GREATEREQ - 81)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(329);
					set_expression();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Set_expressionContext extends ParserRuleContext {
		public Set_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expression; }
	 
		public Set_expressionContext() { }
		public void copyFrom(Set_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetExpressionContext extends Set_expressionContext {
		public List<Bitwise_orContext> bitwise_or() {
			return getRuleContexts(Bitwise_orContext.class);
		}
		public Bitwise_orContext bitwise_or(int i) {
			return getRuleContext(Bitwise_orContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(alkParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(alkParser.UNION, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(alkParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(alkParser.INTERSECT, i);
		}
		public List<TerminalNode> SUBTRACT() { return getTokens(alkParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(alkParser.SUBTRACT, i);
		}
		public SetExpressionContext(Set_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_expressionContext set_expression() throws RecognitionException {
		Set_expressionContext _localctx = new Set_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_set_expression);
		int _la;
		try {
			_localctx = new SetExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			bitwise_or();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (UNION - 67)) | (1L << (INTERSECT - 67)) | (1L << (SUBTRACT - 67)))) != 0)) {
				{
				{
				setState(336);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (UNION - 67)) | (1L << (INTERSECT - 67)) | (1L << (SUBTRACT - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				bitwise_or();
				}
				}
				setState(342);
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

	public static class Bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
	 
		public Bitwise_orContext() { }
		public void copyFrom(Bitwise_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitwiseOrExpressionContext extends Bitwise_orContext {
		public List<Bitwise_andContext> bitwise_and() {
			return getRuleContexts(Bitwise_andContext.class);
		}
		public Bitwise_andContext bitwise_and(int i) {
			return getRuleContext(Bitwise_andContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(alkParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(alkParser.VBAR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(alkParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(alkParser.XOR, i);
		}
		public BitwiseOrExpressionContext(Bitwise_orContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bitwise_or);
		int _la;
		try {
			int _alt;
			_localctx = new BitwiseOrExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			bitwise_and();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					_la = _input.LA(1);
					if ( !(_la==XOR || _la==VBAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(345);
					bitwise_and();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Bitwise_andContext extends ParserRuleContext {
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
	 
		public Bitwise_andContext() { }
		public void copyFrom(Bitwise_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitwiseAndExpressionContext extends Bitwise_andContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_AND() { return getTokens(alkParser.BITWISE_AND); }
		public TerminalNode BITWISE_AND(int i) {
			return getToken(alkParser.BITWISE_AND, i);
		}
		public BitwiseAndExpressionContext(Bitwise_andContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bitwise_and);
		int _la;
		try {
			_localctx = new BitwiseAndExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			shift_expression();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_AND) {
				{
				{
				setState(352);
				match(BITWISE_AND);
				setState(353);
				shift_expression();
				}
				}
				setState(358);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	 
		public Shift_expressionContext() { }
		public void copyFrom(Shift_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpressionContext extends Shift_expressionContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> LEFTSHIFT() { return getTokens(alkParser.LEFTSHIFT); }
		public TerminalNode LEFTSHIFT(int i) {
			return getToken(alkParser.LEFTSHIFT, i);
		}
		public List<TerminalNode> RIGHTSHIFT() { return getTokens(alkParser.RIGHTSHIFT); }
		public TerminalNode RIGHTSHIFT(int i) {
			return getToken(alkParser.RIGHTSHIFT, i);
		}
		public ShiftExpressionContext(Shift_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shift_expression);
		int _la;
		try {
			_localctx = new ShiftExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			additive_expression();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTSHIFT || _la==RIGHTSHIFT) {
				{
				{
				setState(360);
				_la = _input.LA(1);
				if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				additive_expression();
				}
				}
				setState(366);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	 
		public Additive_expressionContext() { }
		public void copyFrom(Additive_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpressionContext extends Additive_expressionContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(alkParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(alkParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(alkParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(alkParser.MINUS, i);
		}
		public List<TerminalNode> PLUSMOD() { return getTokens(alkParser.PLUSMOD); }
		public TerminalNode PLUSMOD(int i) {
			return getToken(alkParser.PLUSMOD, i);
		}
		public List<TerminalNode> MINUSMOD() { return getTokens(alkParser.MINUSMOD); }
		public TerminalNode MINUSMOD(int i) {
			return getToken(alkParser.MINUSMOD, i);
		}
		public AdditiveExpressionContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additive_expression);
		int _la;
		try {
			_localctx = new AdditiveExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			multiplicative_expression();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (PLUSMOD - 77)) | (1L << (MINUSMOD - 77)) | (1L << (MINUS - 77)) | (1L << (PLUS - 77)))) != 0)) {
				{
				{
				setState(368);
				_la = _input.LA(1);
				if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (PLUSMOD - 77)) | (1L << (MINUSMOD - 77)) | (1L << (MINUS - 77)) | (1L << (PLUS - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				multiplicative_expression();
				}
				}
				setState(374);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	 
		public Multiplicative_expressionContext() { }
		public void copyFrom(Multiplicative_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpressionContext extends Multiplicative_expressionContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(alkParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(alkParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(alkParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(alkParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(alkParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(alkParser.MOD, i);
		}
		public MultiplicativeExpressionContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicative_expression);
		int _la;
		try {
			_localctx = new MultiplicativeExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			unary_expression();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) {
				{
				{
				setState(376);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				unary_expression();
				}
				}
				setState(382);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToPostfixExpressionContext extends Unary_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ToPostfixExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public TerminalNode PLUSPLUSMOD() { return getToken(alkParser.PLUSPLUSMOD, 0); }
		public TerminalNode MINUSMINUSMOD() { return getToken(alkParser.MINUSMINUSMOD, 0); }
		public PrefixExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(alkParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(alkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alkParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(alkParser.NOT, 0); }
		public UnaryExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unary_expression);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSPLUS:
			case MINUSMINUS:
			case PLUSPLUSMOD:
			case MINUSMINUSMOD:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				_la = _input.LA(1);
				if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PLUSPLUS - 74)) | (1L << (MINUSMINUS - 74)) | (1L << (PLUSPLUSMOD - 74)) | (1L << (MINUSMINUSMOD - 74)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(384);
				unary_expression();
				}
				break;
			case MINUS:
			case PLUS:
			case MUL:
			case NOT:
				_localctx = new UnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (MINUS - 88)) | (1L << (PLUS - 88)) | (1L << (MUL - 88)) | (1L << (NOT - 88)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				unary_expression();
				}
				break;
			case EMPTYSET:
			case EMPTYLIST:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case COS:
			case LOG:
			case PI:
			case POW:
			case SIN:
			case SQRT:
			case TAN:
			case LEN:
			case AT:
			case DELETE:
			case END:
			case FIRST:
			case FLOAT:
			case INSERT:
			case INTEGER:
			case PRINT:
			case POPBACK:
			case POPFRONT:
			case PUSHBACK:
			case PUSHFRONT:
			case REMOVE:
			case REMOVEALLEQTO:
			case REMOVEAT:
			case SINGLETONSET:
			case SIZE:
			case SPLIT:
			case TOPBACK:
			case TOPFRONT:
			case UPDATE:
			case RANDOM:
			case INT:
			case DOUBLE:
			case BOOL:
			case ID:
			case LOWER:
			case LPAR:
			case LCB:
			case LBRA:
			case STRING:
				_localctx = new ToPostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				postfix_expression();
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpressionContext extends Postfix_expressionContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> PLUSPLUS() { return getTokens(alkParser.PLUSPLUS); }
		public TerminalNode PLUSPLUS(int i) {
			return getToken(alkParser.PLUSPLUS, i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(alkParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(alkParser.MINUSMINUS, i);
		}
		public PostfixExpressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			_localctx = new PostfixExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			factor();
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					_la = _input.LA(1);
					if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallFactorContext extends FactorContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionCallFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefNameFactorContext extends FactorContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public RefNameFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRefNameFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesFactorContext extends FactorContext {
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public ParanthesesFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitParanthesesFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueFactorContext extends FactorContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitValueFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new FunctionCallFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				function_call();
				}
				break;
			case 2:
				_localctx = new RefNameFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				ref_name();
				}
				break;
			case 3:
				_localctx = new ValueFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				value();
				}
				break;
			case 4:
				_localctx = new ParanthesesFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(LPAR);
				setState(401);
				expression();
				setState(402);
				match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Scalar_valueContext scalar_value() {
			return getRuleContext(Scalar_valueContext.class,0);
		}
		public Data_structureContext data_structure() {
			return getRuleContext(Data_structureContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case BOOL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				scalar_value();
				}
				break;
			case EMPTYSET:
			case EMPTYLIST:
			case LOWER:
			case LCB:
			case LBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				data_structure();
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

	public static class Scalar_valueContext extends ParserRuleContext {
		public Scalar_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_value; }
	 
		public Scalar_valueContext() { }
		public void copyFrom(Scalar_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleValueContext extends Scalar_valueContext {
		public TerminalNode DOUBLE() { return getToken(alkParser.DOUBLE, 0); }
		public DoubleValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDoubleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends Scalar_valueContext {
		public TerminalNode BOOL() { return getToken(alkParser.BOOL, 0); }
		public BoolValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueContext extends Scalar_valueContext {
		public TerminalNode STRING() { return getToken(alkParser.STRING, 0); }
		public StringValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValueContext extends Scalar_valueContext {
		public TerminalNode INT() { return getToken(alkParser.INT, 0); }
		public IntValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_valueContext scalar_value() throws RecognitionException {
		Scalar_valueContext _localctx = new Scalar_valueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scalar_value);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(DOUBLE);
				}
				break;
			case BOOL:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(STRING);
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

	public static class Ref_nameContext extends ParserRuleContext {
		public Ref_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_name; }
	 
		public Ref_nameContext() { }
		public void copyFrom(Ref_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RefNameContext extends Ref_nameContext {
		public List<Ref_name_chunkContext> ref_name_chunk() {
			return getRuleContexts(Ref_name_chunkContext.class);
		}
		public Ref_name_chunkContext ref_name_chunk(int i) {
			return getRuleContext(Ref_name_chunkContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(alkParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(alkParser.POINT, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(alkParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(alkParser.ARROW, i);
		}
		public RefNameContext(Ref_nameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_nameContext ref_name() throws RecognitionException {
		Ref_nameContext _localctx = new Ref_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ref_name);
		int _la;
		try {
			int _alt;
			_localctx = new RefNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			ref_name_chunk();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					_la = _input.LA(1);
					if ( !(_la==ARROW || _la==POINT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(418);
					ref_name_chunk();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Ref_name_chunkContext extends ParserRuleContext {
		public Ref_name_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_name_chunk; }
	 
		public Ref_name_chunkContext() { }
		public void copyFrom(Ref_name_chunkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionChunkContext extends Ref_name_chunkContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<TerminalNode> LBRA() { return getTokens(alkParser.LBRA); }
		public TerminalNode LBRA(int i) {
			return getToken(alkParser.LBRA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRA() { return getTokens(alkParser.RBRA); }
		public TerminalNode RBRA(int i) {
			return getToken(alkParser.RBRA, i);
		}
		public FunctionChunkContext(Ref_name_chunkContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDChunkContext extends Ref_name_chunkContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public List<TerminalNode> LBRA() { return getTokens(alkParser.LBRA); }
		public TerminalNode LBRA(int i) {
			return getToken(alkParser.LBRA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRA() { return getTokens(alkParser.RBRA); }
		public TerminalNode RBRA(int i) {
			return getToken(alkParser.RBRA, i);
		}
		public IDChunkContext(Ref_name_chunkContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIDChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_name_chunkContext ref_name_chunk() throws RecognitionException {
		Ref_name_chunkContext _localctx = new Ref_name_chunkContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ref_name_chunk);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new FunctionChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				function_call();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRA) {
					{
					{
					setState(425);
					match(LBRA);
					setState(426);
					expression();
					setState(427);
					match(RBRA);
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IDChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(ID);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRA) {
					{
					{
					setState(435);
					match(LBRA);
					setState(436);
					expression();
					setState(437);
					match(RBRA);
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Data_structureContext extends ParserRuleContext {
		public Data_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_structure; }
	 
		public Data_structureContext() { }
		public void copyFrom(Data_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListValueContext extends Data_structureContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureValueContext extends Data_structureContext {
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public StructureValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStructureValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayValueContext extends Data_structureContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetValueContext extends Data_structureContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public SetValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_structureContext data_structure() throws RecognitionException {
		Data_structureContext _localctx = new Data_structureContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_data_structure);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				array();
				}
				break;
			case 2:
				_localctx = new ListValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				list();
				}
				break;
			case 3:
				_localctx = new SetValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				set();
				}
				break;
			case 4:
				_localctx = new StructureValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				structure();
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

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntervalDefinitionContext extends IntervalContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(alkParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(alkParser.POINT, i);
		}
		public IntervalDefinitionContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIntervalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interval);
		try {
			_localctx = new IntervalDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expression();
			setState(453);
			match(POINT);
			setState(454);
			match(POINT);
			setState(455);
			expression();
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

	public static class SpecContext extends ParserRuleContext {
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
	 
		public SpecContext() { }
		public void copyFrom(SpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterSpecDefinitionContext extends SpecContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode FROM() { return getToken(alkParser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VBAR() { return getToken(alkParser.VBAR, 0); }
		public FilterSpecDefinitionContext(SpecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFilterSpecDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeprecatedSpecDefinitionContext extends SpecContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VBAR() { return getToken(alkParser.VBAR, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public DeprecatedSpecDefinitionContext(SpecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDeprecatedSpecDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSpecDefinitionContext extends SpecContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VBAR() { return getToken(alkParser.VBAR, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode FROM() { return getToken(alkParser.FROM, 0); }
		public SelectSpecDefinitionContext(SpecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSelectSpecDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_spec);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new DeprecatedSpecDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				expression();
				setState(458);
				match(VBAR);
				setState(459);
				match(ID);
				setState(460);
				match(IN);
				setState(461);
				expression();
				}
				break;
			case 2:
				_localctx = new FilterSpecDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(ID);
				setState(464);
				match(FROM);
				setState(465);
				expression();
				setState(466);
				match(VBAR);
				setState(467);
				expression();
				}
				break;
			case 3:
				_localctx = new SelectSpecDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				expression();
				setState(470);
				match(VBAR);
				setState(471);
				match(ID);
				setState(472);
				match(FROM);
				setState(473);
				expression();
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayWithSpecContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public ArrayWithSpecContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayWithExpressionsContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public ArrayWithExpressionsContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayWithIntervalContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public ArrayWithIntervalContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_array);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new ArrayWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(LBRA);
				setState(478);
				spec();
				setState(479);
				match(RBRA);
				}
				break;
			case 2:
				_localctx = new ArrayWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(LBRA);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
					{
					setState(482);
					expression();
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(483);
						match(COMMA);
						setState(484);
						expression();
						}
						}
						setState(489);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(492);
				match(RBRA);
				}
				break;
			case 3:
				_localctx = new ArrayWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(LBRA);
				setState(494);
				interval();
				setState(495);
				match(RBRA);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyListContext extends ListContext {
		public TerminalNode EMPTYLIST() { return getToken(alkParser.EMPTYLIST, 0); }
		public EmptyListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithIntervalContext extends ListContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ListWithIntervalContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithExpressionsContext extends ListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public ListWithExpressionsContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithSpecContext extends ListContext {
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public ListWithSpecContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_list);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(EMPTYLIST);
				}
				break;
			case 2:
				_localctx = new ListWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(LOWER);
				setState(501);
				spec();
				setState(502);
				match(GREATER);
				}
				break;
			case 3:
				_localctx = new ListWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(LOWER);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
					{
					setState(505);
					expression();
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(506);
						match(COMMA);
						setState(507);
						expression();
						}
						}
						setState(512);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(515);
				match(GREATER);
				}
				break;
			case 4:
				_localctx = new ListWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				match(LOWER);
				setState(517);
				interval();
				setState(518);
				match(GREATER);
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

	public static class StructureContext extends ParserRuleContext {
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	 
		public StructureContext() { }
		public void copyFrom(StructureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructureWithComponentsContext extends StructureContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public StructureWithComponentsContext(StructureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStructureWithComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structure);
		int _la;
		try {
			_localctx = new StructureWithComponentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LCB);
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(523);
				component();
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(528);
			match(RCB);
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

	public static class ComponentContext extends ParserRuleContext {
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	 
		public ComponentContext() { }
		public void copyFrom(ComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComponentDefinitionContext extends ComponentContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(alkParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComponentDefinitionContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_component);
		try {
			_localctx = new ComponentDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(ID);
			setState(531);
			match(ARROW);
			setState(532);
			expression();
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

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	 
		public SetContext() { }
		public void copyFrom(SetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetWithIntervalContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public SetWithIntervalContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptySetContext extends SetContext {
		public TerminalNode EMPTYSET() { return getToken(alkParser.EMPTYSET, 0); }
		public EmptySetContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetWithSpecContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public SetWithSpecContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetWithExpressionsContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public SetWithExpressionsContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_set);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new EmptySetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(EMPTYSET);
				}
				break;
			case 2:
				_localctx = new SetWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(LCB);
				setState(536);
				spec();
				setState(537);
				match(RCB);
				}
				break;
			case 3:
				_localctx = new SetWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(LCB);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
					{
					setState(540);
					expression();
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(541);
						match(COMMA);
						setState(542);
						expression();
						}
						}
						setState(547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(550);
				match(RCB);
				}
				break;
			case 4:
				_localctx = new SetWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(LCB);
				setState(552);
				interval();
				setState(553);
				match(RCB);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToBuiltinMethodContext extends Function_callContext {
		public Builtin_methodContext builtin_method() {
			return getRuleContext(Builtin_methodContext.class,0);
		}
		public ToBuiltinMethodContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToBuiltinMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinedFunctionCallContext extends Function_callContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public DefinedFunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDefinedFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_call);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case COS:
			case LOG:
			case PI:
			case POW:
			case SIN:
			case SQRT:
			case TAN:
			case LEN:
			case AT:
			case DELETE:
			case END:
			case FIRST:
			case FLOAT:
			case INSERT:
			case INTEGER:
			case PRINT:
			case POPBACK:
			case POPFRONT:
			case PUSHBACK:
			case PUSHFRONT:
			case REMOVE:
			case REMOVEALLEQTO:
			case REMOVEAT:
			case SINGLETONSET:
			case SIZE:
			case SPLIT:
			case TOPBACK:
			case TOPFRONT:
			case UPDATE:
			case RANDOM:
				_localctx = new ToBuiltinMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				builtin_method();
				}
				break;
			case ID:
				_localctx = new DefinedFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(ID);
				setState(559);
				match(LPAR);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
					{
					setState(560);
					expression();
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(561);
						match(COMMA);
						setState(562);
						expression();
						}
						}
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(570);
				match(RPAR);
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

	public static class Builtin_methodContext extends ParserRuleContext {
		public Builtin_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_method; }
	 
		public Builtin_methodContext() { }
		public void copyFrom(Builtin_methodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuiltinMethodContext extends Builtin_methodContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public BuiltinMethodContext(Builtin_methodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBuiltinMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_methodContext builtin_method() throws RecognitionException {
		Builtin_methodContext _localctx = new Builtin_methodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_builtin_method);
		int _la;
		try {
			_localctx = new BuiltinMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			method_name();
			setState(574);
			match(LPAR);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT - 70)) | (1L << (DOUBLE - 70)) | (1L << (BOOL - 70)) | (1L << (ID - 70)) | (1L << (PLUSPLUS - 70)) | (1L << (MINUSMINUS - 70)) | (1L << (PLUSPLUSMOD - 70)) | (1L << (MINUSMINUSMOD - 70)) | (1L << (LOWER - 70)) | (1L << (MINUS - 70)) | (1L << (PLUS - 70)) | (1L << (MUL - 70)) | (1L << (LPAR - 70)) | (1L << (NOT - 70)) | (1L << (LCB - 70)) | (1L << (LBRA - 70)) | (1L << (STRING - 70)))) != 0)) {
				{
				setState(575);
				expression();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(576);
					match(COMMA);
					setState(577);
					expression();
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(585);
			match(RPAR);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(alkParser.ABS, 0); }
		public TerminalNode ASIN() { return getToken(alkParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(alkParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(alkParser.ATAN, 0); }
		public TerminalNode AT() { return getToken(alkParser.AT, 0); }
		public TerminalNode COS() { return getToken(alkParser.COS, 0); }
		public TerminalNode DELETE() { return getToken(alkParser.DELETE, 0); }
		public TerminalNode END() { return getToken(alkParser.END, 0); }
		public TerminalNode FIRST() { return getToken(alkParser.FIRST, 0); }
		public TerminalNode FLOAT() { return getToken(alkParser.FLOAT, 0); }
		public TerminalNode INSERT() { return getToken(alkParser.INSERT, 0); }
		public TerminalNode INTEGER() { return getToken(alkParser.INTEGER, 0); }
		public TerminalNode LEN() { return getToken(alkParser.LEN, 0); }
		public TerminalNode LOG() { return getToken(alkParser.LOG, 0); }
		public TerminalNode PI() { return getToken(alkParser.PI, 0); }
		public TerminalNode PRINT() { return getToken(alkParser.PRINT, 0); }
		public TerminalNode POPBACK() { return getToken(alkParser.POPBACK, 0); }
		public TerminalNode POPFRONT() { return getToken(alkParser.POPFRONT, 0); }
		public TerminalNode POW() { return getToken(alkParser.POW, 0); }
		public TerminalNode PUSHBACK() { return getToken(alkParser.PUSHBACK, 0); }
		public TerminalNode PUSHFRONT() { return getToken(alkParser.PUSHFRONT, 0); }
		public TerminalNode RANDOM() { return getToken(alkParser.RANDOM, 0); }
		public TerminalNode REMOVE() { return getToken(alkParser.REMOVE, 0); }
		public TerminalNode REMOVEALLEQTO() { return getToken(alkParser.REMOVEALLEQTO, 0); }
		public TerminalNode REMOVEAT() { return getToken(alkParser.REMOVEAT, 0); }
		public TerminalNode SIN() { return getToken(alkParser.SIN, 0); }
		public TerminalNode SINGLETONSET() { return getToken(alkParser.SINGLETONSET, 0); }
		public TerminalNode SIZE() { return getToken(alkParser.SIZE, 0); }
		public TerminalNode SPLIT() { return getToken(alkParser.SPLIT, 0); }
		public TerminalNode SQRT() { return getToken(alkParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(alkParser.TAN, 0); }
		public TerminalNode TOPBACK() { return getToken(alkParser.TOPBACK, 0); }
		public TerminalNode TOPFRONT() { return getToken(alkParser.TOPFRONT, 0); }
		public TerminalNode UPDATE() { return getToken(alkParser.UPDATE, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << COS) | (1L << LOG) | (1L << PI) | (1L << POW) | (1L << SIN) | (1L << SQRT) | (1L << TAN) | (1L << LEN) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << FLOAT) | (1L << INSERT) | (1L << INTEGER) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << SPLIT) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << RANDOM))) != 0)) ) {
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

	public static class ConfigurationContext extends ParserRuleContext {
		public ConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration; }
	 
		public ConfigurationContext() { }
		public void copyFrom(ConfigurationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConfigContext extends ConfigurationContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ConfigContext(ConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigurationContext configuration() throws RecognitionException {
		ConfigurationContext _localctx = new ConfigurationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_configuration);
		int _la;
		try {
			_localctx = new ConfigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(589);
				variable();
				}
				}
				setState(594);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends VariableContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode TO() { return getToken(alkParser.TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variable);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(ID);
			setState(596);
			match(TO);
			setState(597);
			expression();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\5\2"+
		"h\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4}\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00a0\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ea\n\16\3\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00f6\n\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0108\n\22\f\22\16\22\u010b\13\22\5\22"+
		"\u010d\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u0114\n\22\f\22\16\22\u0117"+
		"\13\22\5\22\u0119\n\22\3\22\3\22\3\23\5\23\u011e\n\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0128\n\24\3\25\3\25\3\25\7\25\u012d\n\25"+
		"\f\25\16\25\u0130\13\25\3\26\3\26\3\26\7\26\u0135\n\26\f\26\16\26\u0138"+
		"\13\26\3\27\3\27\3\27\7\27\u013d\n\27\f\27\16\27\u0140\13\27\3\30\3\30"+
		"\3\30\7\30\u0145\n\30\f\30\16\30\u0148\13\30\3\31\3\31\3\31\7\31\u014d"+
		"\n\31\f\31\16\31\u0150\13\31\3\32\3\32\3\32\7\32\u0155\n\32\f\32\16\32"+
		"\u0158\13\32\3\33\3\33\3\33\7\33\u015d\n\33\f\33\16\33\u0160\13\33\3\34"+
		"\3\34\3\34\7\34\u0165\n\34\f\34\16\34\u0168\13\34\3\35\3\35\3\35\7\35"+
		"\u016d\n\35\f\35\16\35\u0170\13\35\3\36\3\36\3\36\7\36\u0175\n\36\f\36"+
		"\16\36\u0178\13\36\3\37\3\37\3\37\7\37\u017d\n\37\f\37\16\37\u0180\13"+
		"\37\3 \3 \3 \3 \3 \5 \u0187\n \3!\3!\7!\u018b\n!\f!\16!\u018e\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0197\n\"\3#\3#\5#\u019b\n#\3$\3$\3$\3$\5"+
		"$\u01a1\n$\3%\3%\3%\7%\u01a6\n%\f%\16%\u01a9\13%\3&\3&\3&\3&\3&\7&\u01b0"+
		"\n&\f&\16&\u01b3\13&\3&\3&\3&\3&\3&\7&\u01ba\n&\f&\16&\u01bd\13&\5&\u01bf"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u01c5\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01de\n)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\7*\u01e8\n*\f*\16*\u01eb\13*\5*\u01ed\n*\3*\3*\3*\3*\3*\5*\u01f4\n*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u01ff\n+\f+\16+\u0202\13+\5+\u0204\n+\3+"+
		"\3+\3+\3+\3+\5+\u020b\n+\3,\3,\6,\u020f\n,\r,\16,\u0210\3,\3,\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0222\n.\f.\16.\u0225\13.\5.\u0227"+
		"\n.\3.\3.\3.\3.\3.\5.\u022e\n.\3/\3/\3/\3/\3/\3/\7/\u0236\n/\f/\16/\u0239"+
		"\13/\5/\u023b\n/\3/\5/\u023e\n/\3\60\3\60\3\60\3\60\3\60\7\60\u0245\n"+
		"\60\f\60\16\60\u0248\13\60\5\60\u024a\n\60\3\60\3\60\3\61\3\61\3\62\7"+
		"\62\u0251\n\62\f\62\16\62\u0254\13\62\3\63\3\63\3\63\3\63\3\63\2\2\64"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bd\2\16\4\2CCll\3\2WX\3\2SV\3\2EG\4\2\35\35hh\3\2ab\4\2O"+
		"PZ[\3\2\\^\4\2LMQR\4\2Z\\ee\3\2LM\5\2\36*,,.A\2\u0280\2g\3\2\2\2\4o\3"+
		"\2\2\2\6\u009f\3\2\2\2\b\u00a1\3\2\2\2\n\u00a5\3\2\2\2\f\u00b2\3\2\2\2"+
		"\16\u00b4\3\2\2\2\20\u00b9\3\2\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26"+
		"\u00d5\3\2\2\2\30\u00db\3\2\2\2\32\u00e2\3\2\2\2\34\u00eb\3\2\2\2\36\u00fa"+
		"\3\2\2\2 \u00fc\3\2\2\2\"\u0102\3\2\2\2$\u011d\3\2\2\2&\u0121\3\2\2\2"+
		"(\u0129\3\2\2\2*\u0131\3\2\2\2,\u0139\3\2\2\2.\u0141\3\2\2\2\60\u0149"+
		"\3\2\2\2\62\u0151\3\2\2\2\64\u0159\3\2\2\2\66\u0161\3\2\2\28\u0169\3\2"+
		"\2\2:\u0171\3\2\2\2<\u0179\3\2\2\2>\u0186\3\2\2\2@\u0188\3\2\2\2B\u0196"+
		"\3\2\2\2D\u019a\3\2\2\2F\u01a0\3\2\2\2H\u01a2\3\2\2\2J\u01be\3\2\2\2L"+
		"\u01c4\3\2\2\2N\u01c6\3\2\2\2P\u01dd\3\2\2\2R\u01f3\3\2\2\2T\u020a\3\2"+
		"\2\2V\u020c\3\2\2\2X\u0214\3\2\2\2Z\u022d\3\2\2\2\\\u023d\3\2\2\2^\u023f"+
		"\3\2\2\2`\u024d\3\2\2\2b\u0252\3\2\2\2d\u0255\3\2\2\2fh\5\4\3\2gf\3\2"+
		"\2\2gh\3\2\2\2hi\3\2\2\2ij\7\2\2\3j\3\3\2\2\2kp\5\6\4\2lm\5\6\4\2mn\5"+
		"\4\3\2np\3\2\2\2ok\3\2\2\2ol\3\2\2\2p\5\3\2\2\2qr\5H%\2rs\t\2\2\2st\5"+
		"^\60\2tu\7f\2\2u\u00a0\3\2\2\2vw\5\\/\2wx\7f\2\2x\u00a0\3\2\2\2y\u00a0"+
		"\5\"\22\2z|\7\23\2\2{}\5&\24\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u00a0\7"+
		"f\2\2\177\u0080\5\20\t\2\u0080\u0081\7f\2\2\u0081\u00a0\3\2\2\2\u0082"+
		"\u0083\5\16\b\2\u0083\u0084\7f\2\2\u0084\u00a0\3\2\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\u00a0\7f\2\2\u0087\u0088\7\26\2\2\u0088\u00a0\7f\2\2\u0089"+
		"\u008a\7\27\2\2\u008a\u00a0\7f\2\2\u008b\u008c\7\30\2\2\u008c\u00a0\7"+
		"f\2\2\u008d\u008e\5\24\13\2\u008e\u008f\7f\2\2\u008f\u00a0\3\2\2\2\u0090"+
		"\u0091\5\22\n\2\u0091\u0092\7f\2\2\u0092\u00a0\3\2\2\2\u0093\u00a0\5\f"+
		"\7\2\u0094\u00a0\5\b\5\2\u0095\u0096\5\n\6\2\u0096\u0097\7f\2\2\u0097"+
		"\u00a0\3\2\2\2\u0098\u00a0\5\26\f\2\u0099\u009a\5\30\r\2\u009a\u009b\7"+
		"f\2\2\u009b\u00a0\3\2\2\2\u009c\u00a0\5\32\16\2\u009d\u00a0\5\34\17\2"+
		"\u009e\u00a0\5 \21\2\u009fq\3\2\2\2\u009fv\3\2\2\2\u009fy\3\2\2\2\u009f"+
		"z\3\2\2\2\u009f\177\3\2\2\2\u009f\u0082\3\2\2\2\u009f\u0085\3\2\2\2\u009f"+
		"\u0087\3\2\2\2\u009f\u0089\3\2\2\2\u009f\u008b\3\2\2\2\u009f\u008d\3\2"+
		"\2\2\u009f\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0094\3\2\2\2\u009f"+
		"\u0095\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u00a2"+
		"\7D\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\7q\2\2\u00a4\t\3\2\2\2\u00a5"+
		"\u00a6\7\22\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\7"+
		"_\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7`\2\2\u00ab\13\3\2\2\2\u00ac\u00ad"+
		"\7i\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7j\2\2\u00af\u00b3\3\2\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b3\7j\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\r\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7"+
		"\7\r\2\2\u00b7\u00b8\5&\24\2\u00b8\17\3\2\2\2\u00b9\u00ba\7\20\2\2\u00ba"+
		"\u00bb\7K\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00bf\5&\24\2\u00bd\u00be\7B\2"+
		"\2\u00be\u00c0\5&\24\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\21"+
		"\3\2\2\2\u00c1\u00c2\7L\2\2\u00c2\u00d0\5H%\2\u00c3\u00c4\5H%\2\u00c4"+
		"\u00c5\7L\2\2\u00c5\u00d0\3\2\2\2\u00c6\u00c7\7M\2\2\u00c7\u00d0\5H%\2"+
		"\u00c8\u00c9\5H%\2\u00c9\u00ca\7M\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00cc"+
		"\7Q\2\2\u00cc\u00d0\5H%\2\u00cd\u00ce\7R\2\2\u00ce\u00d0\5H%\2\u00cf\u00c1"+
		"\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\5H%\2"+
		"\u00d2\u00d3\7Y\2\2\u00d3\u00d4\5&\24\2\u00d4\25\3\2\2\2\u00d5\u00d6\7"+
		"\t\2\2\u00d6\u00d7\7_\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7`\2\2\u00d9"+
		"\u00da\5\6\4\2\u00da\27\3\2\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\5\6\4"+
		"\2\u00dd\u00de\7\t\2\2\u00de\u00df\7_\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1"+
		"\7`\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\7_\2\2\u00e4"+
		"\u00e5\5&\24\2\u00e5\u00e6\7`\2\2\u00e6\u00e9\5\6\4\2\u00e7\u00e8\7\b"+
		"\2\2\u00e8\u00ea\5\6\4\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\33\3\2\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ee\7_\2\2\u00ed\u00ef\5\36\20"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7f\2\2\u00f1\u00f2\5&\24\2\u00f2\u00f5\7f\2\2\u00f3\u00f6\5\24\13\2\u00f4"+
		"\u00f6\5\22\n\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\7`\2\2\u00f8\u00f9\5\6\4\2\u00f9\35\3\2\2\2\u00fa\u00fb"+
		"\5\24\13\2\u00fb\37\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\7K\2\2\u00fe"+
		"\u00ff\7\r\2\2\u00ff\u0100\5&\24\2\u0100\u0101\5\6\4\2\u0101!\3\2\2\2"+
		"\u0102\u0103\7K\2\2\u0103\u010c\7_\2\2\u0104\u0109\5$\23\2\u0105\u0106"+
		"\7k\2\2\u0106\u0108\5$\23\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u0104\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0118\7`\2\2\u010f\u0110\7\33\2\2\u0110\u0115\7K\2\2\u0111\u0112\7k\2"+
		"\2\u0112\u0114\7K\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\f"+
		"\7\2\u011b#\3\2\2\2\u011c\u011e\7\17\2\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7K\2\2\u0120%\3\2\2\2\u0121\u0127"+
		"\5(\25\2\u0122\u0123\7p\2\2\u0123\u0124\5&\24\2\u0124\u0125\7g\2\2\u0125"+
		"\u0126\5&\24\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\'\3\2\2\2\u0129\u012e\5*\26\2\u012a\u012b\7c\2\2\u012b\u012d"+
		"\5*\26\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f)\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0136\5,\27\2"+
		"\u0132\u0133\7d\2\2\u0133\u0135\5,\27\2\u0134\u0132\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137+\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013e\5.\30\2\u013a\u013b\7\r\2\2\u013b\u013d\5."+
		"\30\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f-\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0146\5\60\31"+
		"\2\u0142\u0143\t\3\2\2\u0143\u0145\5\60\31\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147/\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0149\u014e\5\62\32\2\u014a\u014b\t\4\2\2\u014b\u014d"+
		"\5\62\32\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\61\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0156"+
		"\5\64\33\2\u0152\u0153\t\5\2\2\u0153\u0155\5\64\33\2\u0154\u0152\3\2\2"+
		"\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\63"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015e\5\66\34\2\u015a\u015b\t\6\2\2"+
		"\u015b\u015d\5\66\34\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\65\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0166\58\35\2\u0162\u0163\7N\2\2\u0163\u0165\58\35\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\67\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016e\5:\36\2\u016a\u016b\t\7\2"+
		"\2\u016b\u016d\5:\36\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f9\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0176\5<\37\2\u0172\u0173\t\b\2\2\u0173\u0175\5<\37\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		";\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017e\5> \2\u017a\u017b\t\t\2\2\u017b"+
		"\u017d\5> \2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f=\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182"+
		"\t\n\2\2\u0182\u0187\5> \2\u0183\u0184\t\13\2\2\u0184\u0187\5> \2\u0185"+
		"\u0187\5@!\2\u0186\u0181\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0185\3\2\2"+
		"\2\u0187?\3\2\2\2\u0188\u018c\5B\"\2\u0189\u018b\t\f\2\2\u018a\u0189\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"A\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0197\5\\/\2\u0190\u0197\5H%\2\u0191"+
		"\u0197\5D#\2\u0192\u0193\7_\2\2\u0193\u0194\5&\24\2\u0194\u0195\7`\2\2"+
		"\u0195\u0197\3\2\2\2\u0196\u018f\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191"+
		"\3\2\2\2\u0196\u0192\3\2\2\2\u0197C\3\2\2\2\u0198\u019b\5F$\2\u0199\u019b"+
		"\5L\'\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bE\3\2\2\2\u019c\u01a1"+
		"\7H\2\2\u019d\u01a1\7I\2\2\u019e\u01a1\7J\2\2\u019f\u01a1\7q\2\2\u01a0"+
		"\u019c\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1G\3\2\2\2\u01a2\u01a7\5J&\2\u01a3\u01a4\t\2\2\2\u01a4\u01a6"+
		"\5J&\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8I\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01b1\5\\/\2\u01ab"+
		"\u01ac\7m\2\2\u01ac\u01ad\5&\24\2\u01ad\u01ae\7n\2\2\u01ae\u01b0\3\2\2"+
		"\2\u01af\u01ab\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01bf\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01bb\7K\2\2\u01b5"+
		"\u01b6\7m\2\2\u01b6\u01b7\5&\24\2\u01b7\u01b8\7n\2\2\u01b8\u01ba\3\2\2"+
		"\2\u01b9\u01b5\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01aa\3\2\2\2\u01be"+
		"\u01b4\3\2\2\2\u01bfK\3\2\2\2\u01c0\u01c5\5R*\2\u01c1\u01c5\5T+\2\u01c2"+
		"\u01c5\5Z.\2\u01c3\u01c5\5V,\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2"+
		"\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5M\3\2\2\2\u01c6\u01c7\5"+
		"&\24\2\u01c7\u01c8\7l\2\2\u01c8\u01c9\7l\2\2\u01c9\u01ca\5&\24\2\u01ca"+
		"O\3\2\2\2\u01cb\u01cc\5&\24\2\u01cc\u01cd\7h\2\2\u01cd\u01ce\7K\2\2\u01ce"+
		"\u01cf\7\r\2\2\u01cf\u01d0\5&\24\2\u01d0\u01de\3\2\2\2\u01d1\u01d2\7K"+
		"\2\2\u01d2\u01d3\7\16\2\2\u01d3\u01d4\5&\24\2\u01d4\u01d5\7h\2\2\u01d5"+
		"\u01d6\5&\24\2\u01d6\u01de\3\2\2\2\u01d7\u01d8\5&\24\2\u01d8\u01d9\7h"+
		"\2\2\u01d9\u01da\7K\2\2\u01da\u01db\7\16\2\2\u01db\u01dc\5&\24\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01cb\3\2\2\2\u01dd\u01d1\3\2\2\2\u01dd\u01d7\3\2"+
		"\2\2\u01deQ\3\2\2\2\u01df\u01e0\7m\2\2\u01e0\u01e1\5P)\2\u01e1\u01e2\7"+
		"n\2\2\u01e2\u01f4\3\2\2\2\u01e3\u01ec\7m\2\2\u01e4\u01e9\5&\24\2\u01e5"+
		"\u01e6\7k\2\2\u01e6\u01e8\5&\24\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f4\7n\2\2\u01ef\u01f0\7m\2\2\u01f0\u01f1\5N(\2\u01f1\u01f2"+
		"\7n\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01df\3\2\2\2\u01f3\u01e3\3\2\2\2\u01f3"+
		"\u01ef\3\2\2\2\u01f4S\3\2\2\2\u01f5\u020b\7\32\2\2\u01f6\u01f7\7S\2\2"+
		"\u01f7\u01f8\5P)\2\u01f8\u01f9\7T\2\2\u01f9\u020b\3\2\2\2\u01fa\u0203"+
		"\7S\2\2\u01fb\u0200\5&\24\2\u01fc\u01fd\7k\2\2\u01fd\u01ff\5&\24\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u01fb\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020b\7T\2\2\u0206\u0207\7S\2"+
		"\2\u0207\u0208\5N(\2\u0208\u0209\7T\2\2\u0209\u020b\3\2\2\2\u020a\u01f5"+
		"\3\2\2\2\u020a\u01f6\3\2\2\2\u020a\u01fa\3\2\2\2\u020a\u0206\3\2\2\2\u020b"+
		"U\3\2\2\2\u020c\u020e\7i\2\2\u020d\u020f\5X-\2\u020e\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\7j\2\2\u0213W\3\2\2\2\u0214\u0215\7K\2\2\u0215\u0216"+
		"\7C\2\2\u0216\u0217\5&\24\2\u0217Y\3\2\2\2\u0218\u022e\7\31\2\2\u0219"+
		"\u021a\7i\2\2\u021a\u021b\5P)\2\u021b\u021c\7j\2\2\u021c\u022e\3\2\2\2"+
		"\u021d\u0226\7i\2\2\u021e\u0223\5&\24\2\u021f\u0220\7k\2\2\u0220\u0222"+
		"\5&\24\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u021e\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022e\7j\2\2\u0229"+
		"\u022a\7i\2\2\u022a\u022b\5N(\2\u022b\u022c\7j\2\2\u022c\u022e\3\2\2\2"+
		"\u022d\u0218\3\2\2\2\u022d\u0219\3\2\2\2\u022d\u021d\3\2\2\2\u022d\u0229"+
		"\3\2\2\2\u022e[\3\2\2\2\u022f\u023e\5^\60\2\u0230\u0231\7K\2\2\u0231\u023a"+
		"\7_\2\2\u0232\u0237\5&\24\2\u0233\u0234\7k\2\2\u0234\u0236\5&\24\2\u0235"+
		"\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u0232\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\7`\2\2\u023d\u022f\3\2"+
		"\2\2\u023d\u0230\3\2\2\2\u023e]\3\2\2\2\u023f\u0240\5`\61\2\u0240\u0249"+
		"\7_\2\2\u0241\u0246\5&\24\2\u0242\u0243\7k\2\2\u0243\u0245\5&\24\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u0241\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7`\2\2\u024c_\3\2\2\2\u024d"+
		"\u024e\t\r\2\2\u024ea\3\2\2\2\u024f\u0251\5d\63\2\u0250\u024f\3\2\2\2"+
		"\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253c\3"+
		"\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7K\2\2\u0256\u0257\7\6\2\2\u0257"+
		"\u0258\5&\24\2\u0258e\3\2\2\28go|\u009f\u00b2\u00bf\u00cf\u00e9\u00ee"+
		"\u00f5\u0109\u010c\u0115\u0118\u011d\u0127\u012e\u0136\u013e\u0146\u014e"+
		"\u0156\u015e\u0166\u016e\u0176\u017e\u0186\u018c\u0196\u019a\u01a0\u01a7"+
		"\u01b1\u01bb\u01be\u01c4\u01dd\u01e9\u01ec\u01f3\u0200\u0203\u020a\u0210"+
		"\u0223\u0226\u022d\u0237\u023a\u023d\u0246\u0249\u0252";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}