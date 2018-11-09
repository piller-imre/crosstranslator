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
    		assertEquals(symbol.value, '(');
    	}
    	catch (Exception exception) {
    		fail("Unexpected exception!");
    	}
    }
    
    // TODO: Test the other symbols!
}
