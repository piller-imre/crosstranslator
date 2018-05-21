package def;
import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.*;

public class Scanner implements java_cup.runtime.Scanner {
	private List<String> data;
	
	protected static int next_char;
	private SymbolFactory sf = new ComplexSymbolFactory();
	private static void advance() throws java.io.IOException { next_char = System.in.read();}
	public static void init() throws java.io.IOException { advance();}
	
	public Scanner(List<String> content) {
		this.data = content;
	}
	
	public Symbol next_token() throws java.io.IOException {
		for (String dataEntry : data) {
			String dataElements[] = dataEntry.split("-");
			switch (dataElements[0]) {
			case "class":
				return sf.newSymbol("create", sym.CREATE);
			case "identifier":
				return sf.newSymbol("identifier", sym.IDENTIFIER);
			case "end":
				return sf.newSymbol("end", sym.END);
/*			case "variable":
				return sf.newSymbol(dataElements[1], sym.VARIABLE);
			case "comma":
				return sf.newSymbol(dataElements[1], sym.COMMA);
			case "lParen":
				return sf.newSymbol(dataElements[1], sym.LPAREN);
			case "rParen":
				return sf.newSymbol(dataElements[1], sym.RPAREN);
			case "lBrace":
				return sf.newSymbol(dataElements[1], sym.LBRACE);
			case "rBrace":
				return sf.newSymbol(dataElements[1], sym.RBRACE);
			case "lBrack":
				return sf.newSymbol(dataElements[1], sym.LBRACK);
			case "rBrack":
				return sf.newSymbol(dataElements[1], sym.RBRACK);
			case "colon":
				return sf.newSymbol(dataElements[1], sym.COLON);
			case "variableType":
				switch (dataElements[1]) {
					case "int":
						return sf.newSymbol(dataElements[1], sym.INT);
					case "string":
						return sf.newSymbol(dataElements[1], sym.STRING);
					case "double":
						return sf.newSymbol(dataElements[1], sym.DOUBLE);
					case "boolean":
						return sf.newSymbol(dataElements[1], sym.BOOLEAN);
					case "void":
						return sf.newSymbol(dataElements[1], sym.VOID);
					case "array":
						return sf.newSymbol(dataElements[1], sym.ARRAY);
					case "dict":
						return sf.newSymbol(dataElements[1], sym.DICTIONARY);
				}
			case "this":
				return sf.newSymbol(dataElements[1], sym.THIS);
			case "operator":
				switch (dataElements[1]) {
					case "+":
						return sf.newSymbol(dataElements[1], sym.PLUS);
					case "-":
						return sf.newSymbol(dataElements[1], sym.MINUS);
					case "*":
						return sf.newSymbol(dataElements[1], sym.MULT);
					case "/":
						return sf.newSymbol(dataElements[1], sym.DIV);
					case "++":
						return sf.newSymbol(dataElements[1], sym.PLUSPLUS);
					case "--":
						return sf.newSymbol(dataElements[1], sym.MINUSMINUS);
					case "&&":
						return sf.newSymbol(dataElements[1], sym.ANDAND);
					case "||":
						return sf.newSymbol(dataElements[1], sym.OROR);
					case "=":
						return sf.newSymbol(dataElements[1], sym.EQ);
					case "==":
						return sf.newSymbol(dataElements[1], sym.EQEQ);
					case "+=":
						return sf.newSymbol(dataElements[1], sym.PLUSEQ);
					case "-=":
						return sf.newSymbol(dataElements[1], sym.MINUSEQ);
					case "*=":
						return sf.newSymbol(dataElements[1], sym.MULTEQ);
					case "/=":
						return sf.newSymbol(dataElements[1], sym.DIVEQ);
					case "<":
						return sf.newSymbol(dataElements[1], sym.LT);
					case ">":
						return sf.newSymbol(dataElements[1], sym.GT);
					case "<=":
						return sf.newSymbol(dataElements[1], sym.LE);
					case ">=":
						return sf.newSymbol(dataElements[1], sym.GE);
				}
			case "if":
				return sf.newSymbol(dataElements[1], sym.IF);
			case "function":
				return sf.newSymbol(dataElements[1], sym.FUNCTION);
			case "switch":
				return sf.newSymbol(dataElements[1], sym.SWITCH);
			case "for":
				return sf.newSymbol(dataElements[1], sym.FOR);
			case "while":
				return sf.newSymbol(dataElements[1], sym.WHILE);
			case "modifier":
				switch (dataElements[1]) {
					case "public":
						return sf.newSymbol(dataElements[1], sym.PUBLIC);
					case "private":
						return sf.newSymbol(dataElements[1], sym.PRIVATE);
				}*/
			}
		}
		return null;
	}
}
