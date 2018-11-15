package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.io.StringReader;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.lexer.Scanner;
import hu.iit.uni_miskolc.horvath23.Crosstranslator.parser.sym;
import java_cup.runtime.Symbol;

/**
 * Test the scanning process
 */
public class LexerTest extends TestCase {
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LexerTest(String testName)
    {
        super(testName);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(LexerTest.class);
    }
    
    public void testEmptyInput()
    {
    	StringReader reader = new StringReader("");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.EOF);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testStringLiteral()
    {
    	StringReader reader = new StringReader("\"literal\"");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.STRING_LITERAL);
    		assertEquals(symbol.value, "literal");
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testInteger()
    {
    	StringReader reader = new StringReader("1234");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.INTEGER_LITERAL);
    		assertEquals(symbol.value, 1234);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testLparen()
    {
    	StringReader reader = new StringReader("(");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.LPAREN);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testRparen()
    {
    	StringReader reader = new StringReader(")");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.RPAREN);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testDiv()
    {
    	StringReader reader = new StringReader("/");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.DIV);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMult()
    {
    	StringReader reader = new StringReader("*");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MULT);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testIdentifier()
    {
    	StringReader reader = new StringReader("identifier");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.IDENTIFIER);
    		assertEquals(symbol.value, "identifier");
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testDot()
    {
    	StringReader reader = new StringReader(".");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.DOT);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMinus()
    {
    	StringReader reader = new StringReader("-");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MINUS);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testString()
    {
    	StringReader reader = new StringReader("\"string\"");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.STRING);
    		assertEquals(symbol.value, "string");
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testCharLiteral()
    {
    	StringReader reader = new StringReader("\"c\"");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.CHARACTER_LITERAL);
    		assertEquals(symbol.value, "c");
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMemberTag()
    {
    	StringReader reader = new StringReader("@");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MEMBER_TAG);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testLbrace()
    {
    	StringReader reader = new StringReader("{");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.LBRACE);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testRbrace()
    {
    	StringReader reader = new StringReader("}");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.RBRACE);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testLbrack()
    {
    	StringReader reader = new StringReader("[");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.LBRACK);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testRbrack()
    {
    	StringReader reader = new StringReader("]");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.RBRACK);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testComma()
    {
    	StringReader reader = new StringReader(",");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.COMMA);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testEq()
    {
    	StringReader reader = new StringReader("=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.EQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testGt()
    {
    	StringReader reader = new StringReader(">");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.GT);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testLt()
    {
    	StringReader reader = new StringReader("<");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.LT);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testPlus()
    {
    	StringReader reader = new StringReader("+");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.PLUS);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testDivEq()
    {
    	StringReader reader = new StringReader("/=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.DIVEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMultEq()
    {
    	StringReader reader = new StringReader("*=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MULTEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMinusEq()
    {
    	StringReader reader = new StringReader("-=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MINUSEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testIf()
    {
    	StringReader reader = new StringReader("If");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.IF);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testEqEq()
    {
    	StringReader reader = new StringReader("==");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.EQEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testGtEq()
    {
    	StringReader reader = new StringReader(">=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.GTEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testLtEq()
    {
    	StringReader reader = new StringReader("<=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.LTEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testAndAnd()
    {
    	StringReader reader = new StringReader("&&");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.ANDAND);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testOrOr()
    {
    	StringReader reader = new StringReader("||");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.OROR);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testPlusEq()
    {
    	StringReader reader = new StringReader("+=");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.PLUSEQ);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testPlusPlus()
    {
    	StringReader reader = new StringReader("++");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.PLUSPLUS);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testMinusMinus()
    {
    	StringReader reader = new StringReader("--");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.MINUSMINUS);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testFor()
    {
    	StringReader reader = new StringReader("For");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.FOR);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testEnd()
    {
    	StringReader reader = new StringReader("End");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.END);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testEif()
    {
    	StringReader reader = new StringReader("Eif");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.EIF);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testElse()
    {
    	StringReader reader = new StringReader("Else");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.ELSE);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testBooleanLiteral()
    {
    	StringReader reader = new StringReader("true");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.BOOLEAN_LITERAL);
    		assertEquals(symbol.value, true);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    public void testBooleanLiteralFalse()
    {
    	StringReader reader = new StringReader("false");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.BOOLEAN_LITERAL);
    		assertEquals(symbol.value, false);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testCreate()
    {
    	StringReader reader = new StringReader("Create");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.CREATE);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testSwitch()
    {
    	StringReader reader = new StringReader("Switch");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.SWITCH);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testFunct()
    {
    	StringReader reader = new StringReader("Funct");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.FUNCT);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    public void testNull()
    {
    	StringReader reader = new StringReader("null");
    	Scanner scanner = new Scanner(reader);
    	try { 
    		Symbol symbol = scanner.next_token();
    		assertEquals(symbol.sym, sym.NULL_LITERAL);
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    
    // TODO: Test the other symbols!
}
