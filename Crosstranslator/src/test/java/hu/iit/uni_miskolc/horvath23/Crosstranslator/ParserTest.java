package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.io.StringReader;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.parser.Parser;
import hu.iit.uni_miskolc.horvath23.Crosstranslator.lexer.Scanner;

/**
 * Test the parsing process
 */
public class ParserTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParserTest(String testName)
    {
        super(testName);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(ParserTest.class);
    }
    
    public void testEmptyInput()
    {
    	StringReader reader = new StringReader("");
    	Scanner scanner = new Scanner(reader);
    	Parser parser = new Parser(scanner);
    	try {
    		parser.parse();
    	}
    	catch (Exception exception) {
    		System.out.println(exception);
    		fail("Unexpected exception in the test!");
    	}
    }
    
	// TODO: Test empty class!
	// TODO: Test single member!
	// TODO: Test single method!
}
