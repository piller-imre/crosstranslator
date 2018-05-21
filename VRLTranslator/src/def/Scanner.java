package def;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.DataLine;

import java_cup.runtime.*;

public class Scanner implements java_cup.runtime.Scanner {
	private ArrayList<String> data;
	private String dataElement;
	private int i = 0;
	
	protected static int next_char;
	private SymbolFactory sf = new ComplexSymbolFactory();
	private void advance() throws java.io.IOException {
		i++;
		if (i >= data.size()) {
			dataElement = "EOF-EOF";
			return;
		}
		dataElement = data.get(i);
	}
	
	public Scanner(ArrayList<String> content) {
		this.data = content;
		this.dataElement = data.get(i);
	}
	
	public Symbol next_token() throws java.io.IOException {
		for (;;) {
			String dataElements[] = dataElement.split("-");
			System.out.println(dataElements[0]);
			switch (dataElements[0]) {
			case "class":
				System.out.println("Class found");
				advance(); return new Symbol(sym.CREATE);
			case "identifier":
				System.out.println("identifier found");
				advance(); return new Symbol(sym.IDENTIFIER);
			case "end":
				System.out.println("end found");
				advance(); return new Symbol(sym.END);
			case "number":
				System.out.println("int found");
				advance(); return new Symbol(sym.INTEGER_LITERAL, new Integer(Integer.parseInt(dataElements[1])));
			case "variable":
				System.out.println("variable found");
				advance(); return new Symbol(sym.VARIABLE);
			case "comma":
				System.out.println("comma found");
				advance(); return new Symbol(sym.COMMA);
			case "lParen":
				System.out.println("( found");
				advance(); return new Symbol(sym.LPAREN);
			case "rParen":
				System.out.println(") found");
				advance(); return new Symbol(sym.RPAREN);
			case "lBrace":
				System.out.println("{ found");
				advance(); return new Symbol(sym.LBRACE);
			case "rBrace":
				System.out.println("} found");
				advance(); return new Symbol(sym.RBRACE);
			case "lBrack":
				System.out.println("[ found");
				advance(); return new Symbol(sym.LBRACK);
			case "rBrack":
				System.out.println("] found");
				advance(); return new Symbol(sym.RBRACK);
			case "colon":
				System.out.println(": found");
				advance(); return new Symbol(sym.COLON);
			case "variableType":
				switch (dataElements[1]) {
					case "int":
						System.out.println("int found");
						advance(); return new Symbol(sym.INT);
					case "string":
						System.out.println("string found");
						advance(); return new Symbol(sym.STRING);
					case "double":
						System.out.println("double found");
						advance(); return new Symbol(sym.DOUBLE);
					case "boolean":
						System.out.println("bool found");
						advance(); return new Symbol(sym.BOOLEAN);
					case "void":
						System.out.println("void found");
						advance(); return new Symbol(sym.VOID);
					case "array":
						System.out.println("array found");
						advance(); return new Symbol(sym.ARRAY);
					case "dict":
						System.out.println("dict found");
						advance(); return new Symbol(sym.DICTIONARY);
				}
			case "this":
				System.out.println("@ found");
				advance(); return new Symbol(sym.THIS);
			case "operator":
				switch (dataElements[1]) {
					case "+":
						System.out.println("+ found");
						advance(); return new Symbol(sym.PLUS);
					case "-":
						System.out.println("- found");
						advance(); return new Symbol(sym.MINUS);
					case "*":
						System.out.println("* found");
						advance(); return new Symbol(sym.MULT);
					case "/":
						System.out.println("/ found");
						advance(); return new Symbol(sym.DIV);
					case "++":
						System.out.println("++ found");
						advance(); return new Symbol(sym.PLUSPLUS);
					case "--":
						System.out.println("-- found");
						advance(); return new Symbol(sym.MINUSMINUS);
					case "&&":
						System.out.println("&& found");
						advance(); return new Symbol(sym.ANDAND);
					case "||":
						System.out.println("|| found");
						advance(); return new Symbol(sym.OROR);
					case "=":
						System.out.println("= found");
						advance(); return new Symbol(sym.EQ);
					case "==":
						System.out.println("== found");
						advance(); return new Symbol(sym.EQEQ);
					case "+=":
						System.out.println("+= found");
						advance(); return new Symbol(sym.PLUSEQ);
					case "-=":
						System.out.println("-= found");
						advance(); return new Symbol(sym.MINUSEQ);
					case "*=":
						System.out.println("*= found");
						advance(); return new Symbol(sym.MULTEQ);
					case "/=":
						System.out.println("/= found");
						advance(); return new Symbol(sym.DIVEQ);
					case "<":
						System.out.println("< found");
						advance(); return new Symbol(sym.LT);
					case ">":
						System.out.println("> found");
						advance(); return new Symbol(sym.GT);
					case "<=":
						System.out.println("<= found");
						advance(); return new Symbol(sym.LE);
					case ">=":
						System.out.println(">= found");
						advance(); return new Symbol(sym.GE);
				}
			case "if":
				System.out.println("if found");
				advance(); return new Symbol(sym.IF);
			case "function":
				System.out.println("Funct found");
				advance(); return new Symbol(sym.FUNCTION);
			case "switch":
				System.out.println("switch found");
				advance(); return new Symbol(sym.SWITCH);
			case "for":
				System.out.println("for found");
				advance(); return new Symbol(sym.FOR);
			case "while":
				System.out.println("while found");
				advance(); return new Symbol(sym.WHILE);
			case "modifier":
				switch (dataElements[1]) {
				case "public":
					System.out.println("public found");
					advance(); return new Symbol(sym.PUBLIC);
				case "private":
					System.out.println("private found");
					advance(); return new Symbol(sym.PRIVATE);
				}
			case "EOF": return new Symbol(sym.EOF);
			
			default:
				System.out.println(dataElements[0] + "found");
				advance();
			}
		}
	}
}
