package def;
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
	/** @expr @?[a-z][a-zA-Z0-9_]+\.[a-zA-Z0-9_]+\([a-zA-Z0-9_,.]?\)                                         */ String createFunctionCall()    { return "functioncall"; }
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
     * Rules:           24                           *
     * Lookaheads:      0                            *
     * Alphabet length: 53                           *
     * NFA states:      173                          *
     * DFA states:      106                          *
     * Static size:     16 KB                        *
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
    "\1\t\23\1\3\1\0\1\2\1\4\1\1\22\22\1\1\5\7\1\1\1\17\1\21\1\n\1" +
    "\5\1\30\1\6\1\20\1\13\1\33\n\1\2\f\1\t\1\r\1\1\1\16\1\31\2\34\1" +
    "\31\2\35\1\31\2\36\1\31\t\37\1\31\3\40\1\31\3\26\1\1\1\27\1" +
    "\1\1\33\1\1\1\43\1\57\1\'\1\63\1\"\1\50\1\62\1\53\1\52\1\32\2" +
    "\55\1\32\1\46\1\54\1\56\1\32\1\41\1\61\1\44\1\45\1\60\1\51\1" +
    "\32\1\64\1\32\1\24\1\b\1\25\1\1\7\0\1\1\u1fa2\0\2");
    
    /**
     * The transition table of the DFA.
     */
    private static final byte[][] TRANSITION_TABLE = createTransitionTable(
    "\0\31\34\34\0\31\74\34\0\31\74\34\0\31\74\34\0\31\74\34\0\31\74\34\0\31" +
    "\74\34\0\31\26\34\0\31\26\34\0\65\0\31\74\22\5\1\74\t\0\65\0\2\r\1\0\17" +
    "\r\1\0\"\0\3\16\2\0\60\0\23\17\1\0\41\0\65\0\65\0\65\0\65\0\65\0\65" +
    "\0\31\26\34\0\33\27\1\0\31\0\65\0\65\31\2\r\1\16\2\103\1\102\1\101\1" +
    "\100\1\76\1\77\2\76\2\51\1\20\1\31\1\21\1\r\1\17\1\22\1\23\1\24\1\25\1" +
    "\30\1\54\1\'\1\27\1\73\1\63\1\52\1\60\1\67\1\'\2\120\1\'\6\45\1\'\3" +
    "\144\1\133\1\41\1\125\1\'\1\115\1\'\1\0\20\33\1\f\1\0\43\0\17\33\1\0\45" +
    "\0\17\33\1\0\t\26\n\146\1\26\21\0\17\33\1\0\t\26\34\0\31\147\32\36\1" +
    "\147\1\0\1\1\1\0\3\1\24\"\21\37\1\"\n\0\31\151\23\40\1\151\b\0\31\147\34" +
    "\0\31\147\34\0\1\1\1\0\3\1\24\"\13\43\1\"\20\0\31\151\r\44\1\151\16" +
    "\0\1\1\1\0\3\1\24\"\21\150\1\"\n\0\31\151\34\0\31\151\34\0\32\50\1\0\6" +
    "\50\24\0\31\74\17\4\1\74\f\0\31\74\16\13\1\74\r\0\31\74\34\0\31\74\13" +
    "\3\1\74\20\0\31\74\t\2\1\74\22\0\31\74\21\75\1\74\n\0\31\74\20\57\1" +
    "\74\13\0\31\74\16\55\1\74\r\0\31\74\r\61\1\74\16\0\31\74\f\62\1\74\6" +
    "\64\1\74\b\0\31\74\b\6\1\74\23\0\31\74\24\152\1\74\7\0\31\74\21\65\1" +
    "\74\n\0\31\74\22\66\1\74\t\0\31\74\13\56\1\74\20\0\31\74\n\70\1\74\21" +
    "\0\31\74\t\71\1\74\22\0\31\74\b\72\1\74\23\0\31\74\34\0\31\74\13\53\1" +
    "\74\20\0\t\n\1\0\53\0\t\n\1\0\53\0\b\n\1\0\54\0\7\n\1\0\55\0\6\n\1\0\2" +
    "\n\1\0\53\0\5\n\1\0\3\n\1\0\53\0\17\33\1\0\t\26\33\t\1\0\31\26\33\t\1" +
    "\0\31\26\b\105\1\26\23\0\31\26\n\106\1\26\21\0\31\26\r\107\1\26\16\0\31" +
    "\26\23\110\1\26\b\0\17\33\1\0\t\26\21\111\1\26\n\0\31\147\13\112\1\147\20" +
    "\0\1\1\1\0\3\1\24\"\16\113\1\"\r\0\31\151\21\114\1\151\1\137\1\151\b" +
    "\0\31\147\n\104\1\147\21\0\1\1\1\0\3\1\24\"\b\116\1\"\23\0\31\151\b" +
    "\117\1\151\23\0\31\26\31\t\1\26\2\0\17\33\1\0\t\26\r\121\1\26\16\0\31" +
    "\147\21\122\1\147\n\0\1\1\1\0\3\1\24\"\b\123\1\"\23\0\31\151\13\124\1" +
    "\151\20\0\31\26\r\t\1\26\16\0\31\26\n\126\1\26\21\0\17\33\1\0\t\26\t" +
    "\127\1\26\22\0\31\147\24\130\1\147\7\0\1\1\1\0\3\1\24\"\23\131\1\"\b" +
    "\0\31\151\23\132\1\151\b\0\31\26\t\t\1\26\22\0\17\33\1\0\t\26\24\\\1" +
    "\26\7\0\31\147\26\135\1\147\5\0\1\1\1\0\3\1\24\"\f\136\1\"\17\0\31\26\16" +
    "\b\1\26\r\0\17\33\1\0\t\26\21\140\1\26\n\0\31\147\24\141\1\147\7\0\1" +
    "\1\1\0\3\1\24\"\26\142\1\"\5\0\31\151\b\46\1\151\3\143\1\151\17\0\31" +
    "\26\t\b\1\26\22\0\31\26\13\145\1\26\20\0\17\33\1\0\t\26\34\0\31\147\27" +
    "\35\1\147\4\0\1\1\1\0\3\1\24\"\34\0\31\74\t\7\1\74\22");
    
    /**
     * Maps state numbers to action numbers.
     */
    private static final byte[] ACTION_MAP = createActionMap(
    "\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\b\1\t\1\n\1\13\1\f\1" +
    "\r\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1" +
    "\30\1\0\3\25\1\b\1\25\2\30\1\25\1\b\1\25\1\30\1\25\1\30\1" +
    "\0\1\30\2\n\1\30\1\n\3\30\1\n\2\30\1\n\3\30\1\n\3\30\1" +
    "\n\2\t\1\30\3\t\2\25\t\30\1\25\2\30\1\25\4\30\1\25\5\30\1" +
    "\25\b\30\1\25\5\n\1");
    
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
        byte[] characterMap = new byte[8234];
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
        byte[][] transitionTable = new byte[106][53];
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
        byte[] actionMap = new byte[106];
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
            int curState = 25;
            int iterator = dot;
            int matchState = -1;
            int matchPosition = 0;
            
            do {
                char curChar = string.charAt(iterator);
                
                curState = TRANSITION_TABLE[curState][curChar >= 8234 ?
                        1 : CHARACTER_MAP[curChar]];
                
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
                case 6: return createModifier();
                case 7: return createVarType();
                case 8: return createOperator();
                case 9: return createIdentifier();
                case 10: return createFunctionCall();
                case 11: return createWhitespace();
                case 12: return createLinebreak();
                case 13: return createTabulator();
                case 14: return createLeftpar();
                case 15: return createRightpar();
                case 16: return createLeftbrace();
                case 17: return createRightbrace();
                case 18: return createLeftbrack();
                case 19: return createRightbrack();
                case 20: return createVariable();
                case 21: return createNumber();
                case 22: return createComma();
                case 23: return createMisc();
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