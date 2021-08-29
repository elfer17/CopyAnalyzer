/* The following code was generated by JFlex 1.4.3 on 24/08/21 23:32 */

package Analizador;
import Modelos.Token;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24/08/21 23:32 from the specification file
 * <tt>/home/ferand20/Documentos/Proyectos Personales/FiusacCopyAnalizer/src/main/java/Analizador/fcaflex.flex</tt>
 */
public class Fcalex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  3,  3,  6,  0,  3,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3,  0, 40,  4, 37,  0,  0, 41, 31, 32,  5,  0, 33, 42, 43,  0, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 35, 34,  0, 36,  0,  0, 
     0, 11, 20,  7, 14, 13, 15, 18, 28, 16, 24,  1, 19,  9, 17,  8, 
    10,  1, 12, 21, 22, 23, 26,  1, 25, 27,  1, 38,  0, 39,  0,  1, 
     0, 11, 20,  7, 14, 13, 15, 18, 28, 16, 24,  1, 19,  9, 17,  8, 
    10,  1, 12, 21, 22, 23, 26,  1, 25, 27,  1, 29,  0, 30,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\11\2\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\3\1\1\17\1\0\1\20\1\0\13\2"+
    "\1\0\1\21\1\0\1\22\1\0\1\17\1\0\13\2"+
    "\1\23\3\2\1\24\24\2\1\25\3\2\1\26\1\27"+
    "\1\2\1\30\1\2\1\31\3\2\1\32\1\33\1\34"+
    "\21\2\1\35\22\2\1\36\1\37\2\2\1\40\3\2"+
    "\1\41\3\2\1\42\10\2\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\u0294\0\u02c0\0\u02ec\0\204\0\u0318\0\u0344"+
    "\0\u0370\0\u039c\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4"+
    "\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0294\0\54\0\u02c0\0\54"+
    "\0\204\0\u0318\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\54\0\u0790"+
    "\0\u07bc\0\u07e8\0\130\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24"+
    "\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\130"+
    "\0\u0b84\0\u0bb0\0\u0bdc\0\130\0\u0c08\0\u0c34\0\130\0\u0c60"+
    "\0\130\0\u0c8c\0\u0cb8\0\u0ce4\0\130\0\130\0\130\0\u0d10"+
    "\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70"+
    "\0\u0e9c\0\u0ec8\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0"+
    "\0\130\0\u0ffc\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104"+
    "\0\u1130\0\u115c\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u1238\0\u1264"+
    "\0\u1290\0\u12bc\0\u12e8\0\130\0\130\0\u1314\0\u1340\0\130"+
    "\0\u136c\0\u1398\0\u13c4\0\130\0\u13f0\0\u141c\0\u1448\0\130"+
    "\0\u1474\0\u14a0\0\u14cc\0\u14f8\0\u1524\0\u1550\0\u157c\0\u15a8"+
    "\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\5\1\7"+
    "\2\3\1\10\1\11\1\3\1\12\1\13\3\3\1\14"+
    "\2\3\1\15\1\16\3\3\1\17\2\3\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\2\55\0\2\3\4\0"+
    "\26\3\21\0\1\36\50\0\1\37\3\0\1\5\2\0"+
    "\1\5\51\0\1\40\1\41\47\0\2\3\4\0\1\3"+
    "\1\42\24\3\20\0\2\3\4\0\20\3\1\43\5\3"+
    "\20\0\2\3\4\0\5\3\1\44\20\3\20\0\2\3"+
    "\4\0\21\3\1\45\4\3\20\0\2\3\4\0\1\3"+
    "\1\46\4\3\1\47\17\3\20\0\2\3\4\0\5\3"+
    "\1\50\1\51\17\3\20\0\2\3\4\0\17\3\1\52"+
    "\6\3\20\0\2\3\4\0\11\3\1\53\14\3\20\0"+
    "\2\3\4\0\4\3\1\54\21\3\17\0\50\55\1\56"+
    "\3\55\51\57\1\60\2\57\2\0\1\61\53\0\1\62"+
    "\51\0\6\40\1\0\45\40\5\41\1\63\46\41\1\0"+
    "\2\3\4\0\2\3\1\64\23\3\20\0\2\3\4\0"+
    "\12\3\1\65\13\3\20\0\2\3\4\0\1\66\25\3"+
    "\20\0\2\3\4\0\6\3\1\67\17\3\20\0\2\3"+
    "\4\0\20\3\1\70\5\3\20\0\2\3\4\0\10\3"+
    "\1\71\15\3\20\0\2\3\4\0\4\3\1\72\21\3"+
    "\20\0\2\3\4\0\12\3\1\73\13\3\20\0\2\3"+
    "\4\0\5\3\1\74\20\3\20\0\2\3\4\0\17\3"+
    "\1\75\6\3\20\0\2\3\4\0\14\3\1\76\11\3"+
    "\17\0\4\41\1\77\1\63\46\41\1\0\2\3\4\0"+
    "\3\3\1\100\22\3\20\0\2\3\4\0\17\3\1\101"+
    "\6\3\20\0\2\3\4\0\25\3\1\102\20\0\2\3"+
    "\4\0\22\3\1\103\3\3\20\0\2\3\4\0\15\3"+
    "\1\104\10\3\20\0\2\3\4\0\11\3\1\105\14\3"+
    "\20\0\2\3\4\0\10\3\1\106\15\3\20\0\2\3"+
    "\4\0\6\3\1\107\17\3\20\0\2\3\4\0\11\3"+
    "\1\110\14\3\20\0\2\3\4\0\20\3\1\111\5\3"+
    "\20\0\2\3\4\0\1\3\1\112\24\3\20\0\2\3"+
    "\4\0\4\3\1\113\21\3\20\0\2\3\4\0\4\3"+
    "\1\114\21\3\20\0\2\3\4\0\11\3\1\115\14\3"+
    "\20\0\2\3\4\0\14\3\1\116\11\3\20\0\2\3"+
    "\4\0\12\3\1\117\13\3\20\0\2\3\4\0\11\3"+
    "\1\120\14\3\20\0\2\3\4\0\5\3\1\121\20\3"+
    "\20\0\2\3\4\0\12\3\1\122\13\3\20\0\2\3"+
    "\4\0\14\3\1\123\11\3\20\0\2\3\4\0\5\3"+
    "\1\124\20\3\20\0\2\3\4\0\5\3\1\125\20\3"+
    "\20\0\2\3\4\0\21\3\1\126\4\3\20\0\2\3"+
    "\4\0\23\3\1\127\2\3\20\0\2\3\4\0\6\3"+
    "\1\130\17\3\20\0\2\3\4\0\11\3\1\131\14\3"+
    "\20\0\2\3\4\0\1\132\25\3\20\0\2\3\4\0"+
    "\4\3\1\133\21\3\20\0\2\3\4\0\13\3\1\134"+
    "\12\3\20\0\2\3\4\0\1\3\1\135\24\3\20\0"+
    "\2\3\4\0\6\3\1\136\17\3\20\0\2\3\4\0"+
    "\6\3\1\137\17\3\20\0\2\3\4\0\6\3\1\140"+
    "\17\3\20\0\2\3\4\0\1\3\1\141\24\3\20\0"+
    "\2\3\4\0\5\3\1\142\20\3\20\0\2\3\4\0"+
    "\4\3\1\143\21\3\20\0\2\3\4\0\5\3\1\144"+
    "\20\3\20\0\2\3\4\0\22\3\1\145\1\3\1\146"+
    "\1\3\20\0\2\3\4\0\16\3\1\147\7\3\20\0"+
    "\2\3\4\0\6\3\1\150\4\3\1\151\12\3\20\0"+
    "\2\3\4\0\13\3\1\152\12\3\20\0\2\3\4\0"+
    "\3\3\1\153\10\3\1\154\1\155\10\3\20\0\2\3"+
    "\4\0\5\3\1\156\20\3\20\0\2\3\4\0\16\3"+
    "\1\157\7\3\20\0\2\3\4\0\6\3\1\160\17\3"+
    "\20\0\2\3\4\0\14\3\1\161\11\3\20\0\2\3"+
    "\4\0\11\3\1\162\14\3\20\0\2\3\4\0\11\3"+
    "\1\163\14\3\20\0\2\3\4\0\4\3\1\164\21\3"+
    "\20\0\2\3\4\0\6\3\1\165\17\3\20\0\2\3"+
    "\4\0\3\3\1\166\22\3\20\0\2\3\4\0\12\3"+
    "\1\167\13\3\20\0\2\3\4\0\1\3\1\170\24\3"+
    "\20\0\2\3\4\0\6\3\1\171\17\3\20\0\2\3"+
    "\4\0\12\3\1\172\13\3\20\0\2\3\4\0\5\3"+
    "\1\173\20\3\20\0\2\3\4\0\3\3\1\174\22\3"+
    "\20\0\2\3\4\0\6\3\1\175\17\3\20\0\2\3"+
    "\4\0\6\3\1\176\17\3\20\0\2\3\4\0\15\3"+
    "\1\177\10\3\20\0\2\3\4\0\6\3\1\200\17\3"+
    "\20\0\2\3\4\0\5\3\1\201\20\3\20\0\2\3"+
    "\4\0\1\3\1\202\24\3\20\0\2\3\4\0\1\203"+
    "\25\3\20\0\2\3\4\0\5\3\1\204\20\3\20\0"+
    "\2\3\4\0\4\3\1\205\21\3\20\0\2\3\4\0"+
    "\4\3\1\206\21\3\20\0\2\3\4\0\4\3\1\207"+
    "\21\3\20\0\2\3\4\0\5\3\1\210\20\3\20\0"+
    "\2\3\4\0\11\3\1\211\14\3\20\0\2\3\4\0"+
    "\4\3\1\212\21\3\20\0\2\3\4\0\14\3\1\213"+
    "\11\3\20\0\2\3\4\0\16\3\1\214\7\3\20\0"+
    "\2\3\4\0\16\3\1\215\7\3\20\0\2\3\4\0"+
    "\17\3\1\216\6\3\20\0\2\3\4\0\10\3\1\217"+
    "\15\3\20\0\2\3\4\0\14\3\1\220\11\3\20\0"+
    "\2\3\4\0\6\3\1\221\17\3\20\0\2\3\4\0"+
    "\6\3\1\222\17\3\20\0\2\3\4\0\11\3\1\223"+
    "\14\3\20\0\2\3\4\0\16\3\1\224\7\3\20\0"+
    "\2\3\4\0\6\3\1\225\17\3\20\0\2\3\4\0"+
    "\1\226\25\3\20\0\2\3\4\0\16\3\1\227\7\3"+
    "\20\0\2\3\4\0\1\3\1\230\24\3\20\0\2\3"+
    "\4\0\17\3\1\231\6\3\20\0\2\3\4\0\4\3"+
    "\1\232\21\3\20\0\2\3\4\0\7\3\1\233\16\3"+
    "\20\0\2\3\4\0\11\3\1\234\14\3\20\0\2\3"+
    "\4\0\16\3\1\235\7\3\20\0\2\3\4\0\17\3"+
    "\1\236\6\3\20\0\2\3\4\0\11\3\1\237\14\3"+
    "\20\0\2\3\4\0\1\240\25\3\20\0\2\3\4\0"+
    "\1\3\1\241\24\3\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5588];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\15\1\13\11\4\1\1\0\1\1\1\0"+
    "\13\1\1\0\1\11\1\0\1\11\1\0\1\1\1\0"+
    "\13\1\1\11\142\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Fcalex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Fcalex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { return new Token(yytext(), "Numero","Lexico", yychar, yyline);
          }
        case 36: break;
        case 4: 
          { return new Token(yytext(), "LlaveA","Lexico", yychar, yyline);
          }
        case 37: break;
        case 2: 
          { return new Token(yytext(), "Identificador","Lexico", yychar, yyline);
          }
        case 38: break;
        case 30: 
          { return new Token(yytext(), "GraficaLineas","Lexico", yychar, yyline);
          }
        case 39: break;
        case 7: 
          { return new Token(yytext(), "ParenC","Lexico", yychar, yyline);
          }
        case 40: break;
        case 16: 
          { return new Token(yytext(), "Comentario","Lexico", yychar, yyline);
          }
        case 41: break;
        case 5: 
          { return new Token(yytext(), "LlaveC","Lexico", yychar, yyline);
          }
        case 42: break;
        case 24: 
          { return new Token(yytext(), "Compare","Lexico", yychar, yyline);
          }
        case 43: break;
        case 11: 
          { return new Token(yytext(), "Igual","Lexico", yychar, yyline);
          }
        case 44: break;
        case 20: 
          { return new Token(yytext(), "Ejex","Lexico", yychar, yyline);
          }
        case 45: break;
        case 29: 
          { return new Token(yytext(), "GraficaPie","Lexico", yychar, yyline);
          }
        case 46: break;
        case 21: 
          { return new Token(yytext(), "Double","Lexico", yychar, yyline);
          }
        case 47: break;
        case 35: 
          { return new Token(yytext(), "GenerarReporteEstadistico","Lexico", yychar, yyline);
          }
        case 48: break;
        case 22: 
          { return new Token(yytext(), "String","Lexico", yychar, yyline);
          }
        case 49: break;
        case 13: 
          { return new Token(yytext(), "CorcheA","Lexico", yychar, yyline);
          }
        case 50: break;
        case 32: 
          { return new Token(yytext(), "PuntajeGeneral","Lexico", yychar, yyline);
          }
        case 51: break;
        case 27: 
          { return new Token(yytext(), "TituloY","Lexico", yychar, yyline);
          }
        case 52: break;
        case 8: 
          { return new Token(yytext(), "Coma","Lexico", yychar, yyline);
          }
        case 53: break;
        case 18: 
          { return new Token(yytext(), "CadenaS","Lexico", yychar, yyline);
          }
        case 54: break;
        case 19: 
          { return new Token(yytext(), "ComentarioM","Lexico", yychar, yyline);
          }
        case 55: break;
        case 14: 
          { return new Token(yytext(), "CorcheC","Lexico", yychar, yyline);
          }
        case 56: break;
        case 9: 
          { return new Token(yytext(), "PuntoComa","Lexico", yychar, yyline);
          }
        case 57: break;
        case 28: 
          { return new Token(yytext(), "Valores","Lexico", yychar, yyline);
          }
        case 58: break;
        case 26: 
          { return new Token(yytext(), "TituloX","Lexico", yychar, yyline);
          }
        case 59: break;
        case 23: 
          { return new Token(yytext(), "Titulo","Lexico", yychar, yyline);
          }
        case 60: break;
        case 17: 
          { return new Token(yytext(), "Cadena","Lexico", yychar, yyline);
          }
        case 61: break;
        case 1: 
          { return new Token(yytext(), "Error","Lexico", yychar, yyline);
          }
        case 62: break;
        case 3: 
          { /*Ignore*/
          }
        case 63: break;
        case 33: 
          { return new Token(yytext(), "DefinirGlobales","Lexico", yychar, yyline);
          }
        case 64: break;
        case 31: 
          { return new Token(yytext(), "GraficaBarras","Lexico", yychar, yyline);
          }
        case 65: break;
        case 25: 
          { return new Token(yytext(), "Archivo","Lexico", yychar, yyline);
          }
        case 66: break;
        case 12: 
          { return new Token(yytext(), "Dollar","Lexico", yychar, yyline);
          }
        case 67: break;
        case 34: 
          { return new Token(yytext(), "PuntajeEspecifico","Lexico", yychar, yyline);
          }
        case 68: break;
        case 10: 
          { return new Token(yytext(), "DosPuntos","Lexico", yychar, yyline);
          }
        case 69: break;
        case 6: 
          { return new Token(yytext(), "ParenA","Lexico", yychar, yyline);
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
