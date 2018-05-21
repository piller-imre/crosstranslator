package def;
import java_cup.runtime.Symbol;
import main.*;
import main.ClassExpression;
/**
 * @option methodName = getNextToken
 * @option statistics = enabled
 */
public class Example_Annoflex {
	/** @expr Create                                                                       */ String createClass()       { return "class"; }
	/** @expr Funct                                                                         */ String createFunction()    { return "function"; }
	/** @expr If                                                                            */ String createIf()          { return "if"; }
	/** @expr Switch                                                                        */ String createSwitch()      { return "switch"; }
	/** @expr For                                                                           */ String createFor()         { return "for"; }
	/** @expr While                                                                           */ String createWhile()         { return "while"; }
	/** @expr End                                                                           */ String createEnd()         { return "end"; }
	/** @expr (public | private)                                                              */ String createModifier()    { return "modifier"; }
	/** @expr (int | string | boolean | void | array | dictionary | double)                   */ String createVarType()     { return "variableType"; }
	/** @expr [ \r\f]+                                                                        */ String createWhitespace()  { return "whitespace"; }
	/** @expr (\n | \r | \r\n)+                                                                       */ String createLinebreak()   { return "linebreak"; }
	/** @expr [\t]+                                                                         */ String createTabulator()   { return "tabulator"; }
	/** @expr (\+ | \- | \+\+ | \-\- | \&\& | \|\| | \= | \=\= | \+\= | \-\= | \*\= | \/\= | \< | \> | \<\= | \>\= )   */ String createOperator()         { return "operator"; }
	/** @expr [A-Z][a-zA-Z0-9_]+                                                          */ String createIdentifier()    { return "identifier"; }
	/** @expr @?[a-z][a-zA-Z0-9_]+\.[a-zA-Z0-9_]+\(\)    */ String createFunctionCall()    { return "functioncall"; }
	/** @expr \(                                                                             */ String createLeftpar()     { return "lParen"; }
	/** @expr \)                                                                             */ String createRightpar()    { return "rParen"; }
	/** @expr \{                                                                             */ String createLeftbrace()   { return "lBrace"; }
	/** @expr \}                                                                             */ String createRightbrace()  { return "rBrace"; }
	/** @expr \[                                                                             */ String createLeftbrack()   { return "lBrack"; }
	/** @expr \]                                                                             */ String createRightbrack()  { return "rBrack"; }
	/** @expr \:                                                                             */ String createColon()  { return "colon"; }
	/** @expr @?[a-z][a-zA-Z0-9_]+                                                          */ String createVariable()    { return "variable"; }
	/** @expr [0-9_]+                                                                       */ String createNumber()      { return "number"; }
	/** @expr @																	 */ String createThisParam() { return "this"; }
	/** @expr \,                                                                       */ String createComma()      { return "comma"; }
	/** @expr [^]                                                                           */ String createMisc()        { return "misc"; }
	
    //%%LEX-MAIN-START%%
    
    //================================================
    //     _                      _____ _             
    //    / \   _ __  _ __   ___ |  ___| | ___ _  __  
    //   / _ \ |  _ \|  _ \ / _ \| |_  | |/ _ \ \/ /  
    //  / ___ \| | | | | | | (_) |  _| | |  __/>  <   
    // /_/   \_\_| |_|_| |_|\___/|_|   |_|\___/_/\_\  
    //                                                
    //================================================
    
    /*************************************************
     *             Generation Statistics             *
     * * * * * * * * * * * * * * * * * * * * * * * * *
     *                                               *
     * Rules:           27                           *
     * Lookaheads:      0                            *
     * Alphabet length: 53                           *
     * NFA states:      182                          *
     * DFA states:      105                          *
     * Static size:     8 KB                         *
     * Instance size:   24 Bytes                     *
     *                                               *
     ************************************************/
    
    //=================
    // Table Constants
    //=================
    
    /**
     * Maps Unicode characters to DFA input symbols.
     */
    private static final byte[] CHARACTER_MAP = createCharacterMap(
    "\0\t\3\1\2\1\0\1\1\1\27\1\0\22\1\1\0\5\6\1\0\1\17\1\20\1\t\1" +
    "\4\1\26\1\5\1\16\1\n\1\32\n\25\1\0\1\13\1\b\1\f\1\0\1\r\1\30\2" +
    "\33\1\30\1\40\1\34\1\30\2\35\1\30\t\36\1\30\3\37\1\30\3\23\1" +
    "\0\1\24\1\0\1\32\1\0\1\43\1\60\1\'\1\56\1\"\1\50\1\63\1\53\1" +
    "\52\1\31\2\55\1\31\1\46\1\54\1\57\1\31\1\41\1\62\1\44\1\45\1" +
    "\61\1\51\1\31\1\64\1\31\1\21\1\7\1\22\1");
    
    /**
     * The transition table of the DFA.
     */
    private static final byte[][] TRANSITION_TABLE = createTransitionTable(
    "\0\30\30\35\0\30\65\35\0\30\65\35\0\30\65\35\0\30\65\35\0\30\65\35\0\30" +
    "\65\35\0\30\65\35\0\16\40\1\0\t\30\35\0\16\40\1\0\t\30\35\0\1\13\1\0\25" +
    "\13\1\0\35\0\2\f\1\0\24\f\1\0\35\0\3\r\1\0\61\0\65\0\30\65\26\b\1\65\6" +
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\65\0\65\0\16\40\1\0\t\30\35\0\32\31\1" +
    "\0\32\0\31\1\1\0\7\1\24\0\65\0\65\34\1\13\1\f\1\r\1\74\1\73\1\72\1\71\1" +
    "\67\1\70\2\67\2\32\1\34\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\33\1\75\1" +
    "\46\1\150\1\31\1\64\1\54\1\41\1\51\1\60\1\44\1\150\2\101\1\150\6\131\1" +
    "\150\3\111\1\142\1\127\1\121\1\116\1\150\2\0\20\20\1\0\44\0\17\36\1" +
    "\0\b\37\35\0\30\37\35\0\30\65\20\4\1\65\f\0\30\65\23\5\1\65\t\0\30\65\17" +
    "\"\1\65\r\0\30\65\16\17\1\65\16\0\30\65\f\3\1\65\20\0\30\65\35\0\30" +
    "\65\n\2\1\65\22\0\30\65\22\66\1\65\n\0\30\65\21\50\1\65\13\0\30\65\17" +
    "\45\1\65\r\0\30\65\16\52\1\65\16\0\30\65\r\53\1\65\6\55\1\65\b\0\30" +
    "\65\t\6\1\65\23\0\30\65\25\151\1\65\7\0\30\65\22\56\1\65\n\0\30\65\23" +
    "\57\1\65\t\0\30\65\f\'\1\65\20\0\30\65\13\61\1\65\21\0\30\65\n\62\1" +
    "\65\22\0\30\65\t\63\1\65\23\0\30\65\35\0\30\65\f\43\1\65\20\0\b\16\1" +
    "\0\54\0\b\16\1\0\54\0\7\16\1\0\55\0\6\16\1\0\56\0\5\16\1\0\2\16\1\0\54" +
    "\0\4\16\1\0\3\16\1\0\54\0\1\13\1\f\1\0\24\75\1\0\35\0\16\40\1\0\t\30\34" +
    "\n\1\0\16\40\1\0\t\30\13\76\1\30\21\0\16\40\1\0\t\30\t\77\1\30\23\0\30" +
    "\30\t\100\1\30\23\0\16\40\1\0\t\30\t\76\1\30\23\0\16\40\1\0\t\30\13" +
    "\102\1\30\21\0\16\40\1\0\t\30\16\103\1\30\16\0\16\40\1\0\t\30\24\104\1" +
    "\30\b\0\16\40\1\0\t\30\22\105\1\30\n\0\16\40\1\0\t\30\f\106\1\30\20" +
    "\0\16\40\1\0\t\30\17\107\1\30\r\0\30\30\22\110\1\30\1\135\1\30\b\0\16" +
    "\40\1\0\t\30\33\n\1\30\1\0\16\40\1\0\t\30\16\112\1\30\16\0\16\40\1\0\t" +
    "\30\22\113\1\30\n\0\16\40\1\0\t\30\t\114\1\30\23\0\30\30\f\115\1\30\20" +
    "\0\16\40\1\0\t\30\26\n\1\30\6\0\16\40\1\0\t\30\22\117\1\30\n\0\30\30\24" +
    "\120\1\30\b\0\16\40\1\0\t\30\16\n\1\30\16\0\16\40\1\0\t\30\13\122\1" +
    "\30\21\0\16\40\1\0\t\30\n\123\1\30\22\0\16\40\1\0\t\30\25\124\1\30\7" +
    "\0\16\40\1\0\t\30\24\125\1\30\b\0\30\30\24\126\1\30\b\0\16\40\1\0\t" +
    "\30\f\n\1\30\20\0\30\30\16\130\1\30\16\0\16\40\1\0\t\30\n\n\1\30\22" +
    "\0\16\40\1\0\t\30\25\132\1\30\7\0\16\40\1\0\t\30\30\133\1\30\4\0\16" +
    "\40\1\0\t\30\r\\\1\30\17\0\16\40\1\0\t\30\17\t\1\30\r\0\16\40\1\0\t" +
    "\30\22\136\1\30\n\0\16\40\1\0\t\30\25\137\1\30\7\0\16\40\1\0\t\30\30" +
    "\140\1\30\4\0\30\30\t\147\1\30\3\141\1\30\17\0\16\40\1\0\t\30\n\t\1" +
    "\30\22\0\16\40\1\0\t\30\f\143\1\30\20\0\16\40\1\0\t\30\13\144\1\30\21" +
    "\0\16\40\1\0\t\30\31\145\1\30\3\0\16\40\1\0\t\30\22\146\1\30\n\0\30" +
    "\30\35\0\30\65\n\7\1\65\22");
    
    /**
     * Maps state numbers to action numbers.
     */
    private static final byte[] ACTION_MAP = createActionMap(
    "\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\b\1\t\1\n\1\13\1\f\1" +
    "\r\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1" +
    "\30\1\31\1\32\1\33\1\0\4\33\1\16\2\33\1\16\1\33\1\16\2" +
    "\33\1\16\2\33\1\16\3\33\1\16\3\33\1\16\2\r\1\33\3\r\2" +
    "\n\1\27\3\33\1\27\7\33\1\27\4\33\1\27\2\33\1\27\5\33\1" +
    "\27\1\33\1\27\b\33\1\27\5\33\1\16\1");
    
    //===============
    // String Fields
    //===============
    
    /**
     * The current string to be scanned.
     */
    private String string = "";
    
    //===============
    // Region Fields
    //===============
    
    /**
     * The start of the scan region.
     */
    private int regionStart;
    
    /**
     * The end of the scan region.
     */
    private int regionEnd;
    
    //============
    // Dot Fields
    //============
    
    /**
     * The start position of the next scan.
     */
    private int dot;
    
    //==============
    // Match Fields
    //==============
    
    /**
     * The start of the last match.
     */
    private int matchStart;
    
    /**
     * The end of the last match.
     */
    private int matchEnd;
    
    //===============
    // Table Methods
    //===============
    
    /**
     * Creates the character map of the scanner.
     * 
     * @param characterMapData The compressed data of the character map.
     * @return The character map of the scanner.
     */
    private static byte[] createCharacterMap(String characterMapData) {
        byte[] characterMap = new byte[126];
        int length = characterMapData.length();
        int i = 0;
        int j = 0;
        
        while (i < length) {
            byte curValue = (byte)characterMapData.charAt(i++);
            
            for (int x=characterMapData.charAt(i++);x>0;x--) {
                characterMap[j++] = curValue;
            }
        }
        
        return characterMap;
    }
    
    /**
     * Creates the transition table of the scanner.
     * 
     * @param transitionTableData The compressed data of the transition table.
     * @return The transition table of the scanner.
     */
    private static byte[][] createTransitionTable(String transitionTableData) {
        byte[][] transitionTable = new byte[105][53];
        int length = transitionTableData.length();
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < length) {
            byte curValue = (byte)((short)transitionTableData.charAt(i++) - 1);
            
            for (int x=transitionTableData.charAt(i++);x>0;x--) {
                transitionTable[j][k++] = curValue;
            }
            
            if (k == 53) {
                k = 0;
                j++;
            }
        }
        
        return transitionTable;
    }
    
    /**
     * Creates the action map of the scanner.
     * 
     * @param actionMapData The compressed data of the action map.
     * @return The action map of the scanner.
     */
    private static byte[] createActionMap(String actionMapData) {
        byte[] actionMap = new byte[105];
        int length = actionMapData.length();
        int i = 0;
        int j = 0;
        
        while (i < length) {
            byte curValue = (byte)((short)actionMapData.charAt(i++) - 1);
            
            for (int x=actionMapData.charAt(i++);x>0;x--) {
                actionMap[j++] = curValue;
            }
        }
        
        return actionMap;
    }
    
    //================
    // String Methods
    //================
    
    /**
     * Sets the string to be scanned. The scan region is set to the entire
     * string.
     * 
     * @param string The new string to be scanned.
     */
    public void setString(String string) {
        this.string = string != null ? string : "";
        
        regionStart = 0;
        regionEnd = this.string.length();
        
        dot = 0;
        
        matchStart = 0;
        matchEnd = 0;
    }
    
    /**
     * Returns the current string to be scanned.
     * 
     * @return The current string to be scanned.
     */
    public String getString() {
        return string;
    }
    
    //================
    // Region Methods
    //================
    
    /**
     * Sets the scan region. The dot is clipped to the region if necessary.
     * 
     * @param start The start of the scan region (inclusive).
     * @param end The end of the scan region (exclusive).
     * @throws IllegalArgumentException If the region is out of range
     */
    public void setRegion(int start, int end) {
        if ((start < 0) || (end > string.length()) || (start > end)) {
            throw new IllegalArgumentException("region offsets out of range");
        }
        
        regionStart = start;
        regionEnd = end;
        
        if (dot < start) {
            dot = start;
        }
        
        if (dot > end) {
            dot = end;
        }
    }
    
    /**
     * Returns the start of the scan region.
     * 
     * @return The start of the scan region.
     */
    public int getRegionStart() {
        return regionStart;
    }
    
    /**
     * Returns the end of the scan region.
     * 
     * @return The end of the scan region.
     */
    public int getRegionEnd() {
        return regionEnd;
    }
    
    //=============
    // Dot Methods
    //=============
    
    /**
     * Sets the position at which the next scan starts.
     * 
     * @param dot The new position at which the next scan starts.
     * @throws IllegalArgumentException If the position is out of range
     */
    public void setDot(int dot) {
        if ((dot < regionStart) || (dot > regionEnd)) {
            throw new IllegalArgumentException("dot out of range");
        }
        
        this.dot = dot;
    }
    
    /**
     * Returns the position at which the next scan starts.
     * 
     * @return The position at which the next scan starts.
     */
    public int getDot() {
        return dot;
    }
    
    //===============
    // Match Methods
    //===============
    
    /**
     * Returns the start (inclusive) of the last match.
     * 
     * @return The start (inclusive) of the last match.
     */
    public int getMatchStart() {
        return matchStart;
    }
    
    /**
     * Returns the end (exclusive) of the last match.
     * 
     * @return The end (exclusive) of the last match.
     */
    public int getMatchEnd() {
        return matchEnd;
    }
    
    /**
     * Returns the length of the last match.
     * 
     * @return The length of the last match.
     */
    public int getMatchLength() {
        return matchEnd - matchStart;
    }
    
    /**
     * Returns the text of the last match.
     * 
     * @return The text of the last match.
     */
    public String getMatchText() {
        return string.substring(matchStart,matchEnd);
    }
    
    /**
     * Returns a character relative to the start of the last match.
     * 
     * @param index The index of the character relative to the last match.
     * @return The character at the specified position.
     * @throws IndexOutOfBoundsException If the specified index is invalid
     */
    public char getMatchChar(int index) {
        int stringIndex = matchStart + index;
        
        if ((stringIndex < regionStart) || (stringIndex >= regionEnd)) {
            throw new IndexOutOfBoundsException("match character not available");
        }
        
        return string.charAt(stringIndex);
    }
    
    //==============
    // Scan Methods
    //==============
    
    /**
     * Performs at the current position the next step of the lexical analysis
     * and returns the result.
     * 
     * @return The result of the next step of the lexical analysis.
     * @throws IllegalStateException If a lexical error occurs
     */
    public String getNextToken() {
        if (dot < regionEnd) {
            
            // find longest match
            int curState = 28;
            int iterator = dot;
            int matchState = -1;
            int matchPosition = 0;
            
            do {
                char curChar = string.charAt(iterator);
                
                curState = TRANSITION_TABLE[curState][curChar >= 126 ?
                        0 : CHARACTER_MAP[curChar]];
                
                if (curState == -1) {
                    break;
                }
                
                if (ACTION_MAP[curState] != -1) {
                    matchState = curState;
                    matchPosition = iterator;
                }
            } while (++iterator < regionEnd);
            
            // match found, perform action
            if (matchState != -1) {
                int endPosition = matchPosition + 1;
                
                matchStart = dot;
                matchEnd = endPosition;
                dot = endPosition;
                
                switch(ACTION_MAP[matchState]) {
                case 0: return createClass();
                case 1: return createFunction();
                case 2: return createIf();
                case 3: return createSwitch();
                case 4: return createFor();
                case 5: return createWhile();
                case 6: return createEnd();
                case 7: return createModifier();
                case 8: return createVarType();
                case 9: return createWhitespace();
                case 10: return createLinebreak();
                case 11: return createTabulator();
                case 12: return createOperator();
                case 13: return createIdentifier();
                case 14: return createFunctionCall();
                case 15: return createLeftpar();
                case 16: return createRightpar();
                case 17: return createLeftbrace();
                case 18: return createRightbrace();
                case 19: return createLeftbrack();
                case 20: return createRightbrack();
                case 21: return createColon();
                case 22: return createVariable();
                case 23: return createNumber();
                case 24: return createThisParam();
                case 25: return createComma();
                case 26: return createMisc();
                }
            }
            
            // no match found, set match values and report as error
            matchStart = dot;
            matchEnd = dot;
            
            throw new IllegalStateException("invalid input");
        }
        
        // no match found, set match values and return to caller
        matchStart = dot;
        matchEnd = dot;
        
        return null;
    }
    
    //%%LEX-MAIN-END%%

}