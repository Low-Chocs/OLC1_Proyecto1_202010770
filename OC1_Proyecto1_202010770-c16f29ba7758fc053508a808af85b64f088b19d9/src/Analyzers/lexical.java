/* The following code was generated by JFlex 1.7.0 */

package Analyzers;
import java_cup.runtime.*;
import java.util.ArrayList;
import Analyzers.Token;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/Analyzers/lexical.flex</tt>
 */
public class lexical implements java_cup.runtime.Scanner {

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
     0,  0,  0,  0,  0,  0,  0,  0,  0,  2,  1,  0,  0,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 44, 41,  0,  0,  0,  0,  0, 27, 28, 45,  0, 26, 24, 43,  0, 
     9,  9,  9,  9,  9,  9,  9,  9,  9,  9, 21, 25, 22, 34, 23,  0, 
    20,  6, 13, 16, 10, 15,  8, 40, 17, 33, 46,  8, 14, 31, 35, 11, 
    38,  8,  7, 30, 39, 12,  5,  8, 37, 47, 36, 18, 42, 19,  0,  8, 
     0,  6, 13, 16, 10, 15,  8, 40, 17, 33, 46,  8, 14, 31, 35, 11, 
    38,  8,  7, 30, 39, 12,  5,  8, 37, 47, 36,  0,  0,  0,  0,  0, 
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
    "\1\0\1\1\1\2\1\3\1\4\4\5\1\6\4\5"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\0\2\5\1\22\2\5\1\0"+
    "\1\23\3\5\1\0\1\5\1\0\7\5\2\0\5\5"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\2\0\1\24"+
    "\1\5\1\25\2\26\1\27\1\5\2\30\1\5\1\31"+
    "\5\5\1\0\2\32\1\33\1\34\1\35\1\5\2\36"+
    "\1\0\1\5\1\0\1\5\1\0\1\5\2\37\1\0"+
    "\4\5\1\40\1\41\1\42\1\5\1\0\2\5\1\0"+
    "\1\43\1\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\1\5\1\0\3\5\1\44\1\5\1\0\1\5\1\0"+
    "\1\45\1\0\1\5\1\0\1\5\2\46\1\0\1\5"+
    "\1\0\1\5\2\47\1\50\1\51\1\0\1\5\1\52"+
    "\1\0\1\5\1\53\1\5\2\54\1\0\1\5\2\55"+
    "\2\56\1\57\1\60\1\61\1\60\1\61\2\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[162];
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
    "\0\0\0\60\0\60\0\60\0\60\0\140\0\220\0\300"+
    "\0\360\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\60\0\60"+
    "\0\60\0\60\0\u0210\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360"+
    "\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0"+
    "\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\360"+
    "\0\60\0\360\0\u0450\0\u0960\0\60\0\360\0\u0990\0\360"+
    "\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\60\0\360"+
    "\0\360\0\u0ae0\0\360\0\u0b10\0\60\0\360\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\60\0\u08a0\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\360\0\360\0\360\0\u0d50\0\u0d80"+
    "\0\u0db0\0\u0de0\0\u0e10\0\360\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0"+
    "\0\u0f00\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050"+
    "\0\360\0\u1080\0\u10b0\0\u10e0\0\u1110\0\60\0\u1140\0\u1170"+
    "\0\u11a0\0\u11d0\0\60\0\360\0\u1200\0\u1230\0\u1260\0\u1290"+
    "\0\60\0\360\0\360\0\360\0\u12c0\0\u12f0\0\60\0\u1320"+
    "\0\u1350\0\60\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u1440\0\60"+
    "\0\360\0\60\0\360\0\360\0\60\0\60\0\360\0\360"+
    "\0\60\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[162];
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
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\3\11\1\14\1\15\1\16\1\11"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\0\1\11"+
    "\1\35\3\11\1\36\1\37\1\11\1\40\2\0\1\41"+
    "\1\0\2\11\65\0\1\11\1\42\13\11\14\0\2\11"+
    "\1\0\1\11\1\0\6\11\5\0\2\11\5\0\2\11"+
    "\1\43\12\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\5\0\12\11\1\44\2\11\14\0\2\11"+
    "\1\0\1\11\1\0\6\11\5\0\2\11\5\0\15\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\11\0\1\12\41\0\1\45\11\0\6\11\1\46\6\11"+
    "\14\0\2\11\1\47\1\50\1\0\6\11\5\0\2\11"+
    "\5\0\1\11\1\51\13\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\15\11\14\0\2\11"+
    "\1\0\1\11\1\0\1\52\1\11\1\53\3\11\5\0"+
    "\1\54\1\11\5\0\6\11\1\55\5\11\1\56\14\0"+
    "\2\11\1\0\1\11\1\0\6\11\5\0\2\11\54\0"+
    "\1\57\17\0\1\60\50\0\7\11\1\61\5\11\14\0"+
    "\2\11\1\0\1\11\1\0\6\11\5\0\2\11\5\0"+
    "\1\11\1\62\4\11\1\63\1\64\2\11\1\65\2\11"+
    "\14\0\2\11\1\66\1\67\1\0\6\11\5\0\2\11"+
    "\37\0\1\70\25\0\2\11\1\71\12\11\14\0\2\11"+
    "\1\0\1\11\1\0\6\11\5\0\2\11\5\0\15\11"+
    "\14\0\2\11\1\72\1\73\1\0\6\11\5\0\2\11"+
    "\51\74\1\0\1\75\5\74\1\41\1\0\56\41\5\0"+
    "\2\11\1\76\6\11\1\77\3\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\5\0\2\11\1\100"+
    "\12\11\14\0\2\11\1\0\1\11\1\0\6\11\5\0"+
    "\2\11\5\0\15\11\13\0\1\101\1\102\1\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\11\0\1\103\53\0"+
    "\7\11\1\104\5\11\14\0\2\11\1\0\1\11\1\0"+
    "\6\11\5\0\2\11\5\0\1\105\57\0\1\106\14\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\10\11\1\107\4\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\5\11\1\110\7\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\12\11\1\111\2\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\12\11\1\112\2\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\11\11\1\113\3\11\14\0\2\11\1\0\1\11"+
    "\1\0\1\114\5\11\5\0\2\11\5\0\1\11\1\115"+
    "\13\11\14\0\2\11\1\0\1\11\1\0\6\11\5\0"+
    "\2\11\54\57\1\0\1\116\2\57\37\0\1\117\25\0"+
    "\15\11\14\0\1\11\1\120\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\5\0\15\11\14\0\2\11\1\0\1\11"+
    "\1\0\2\11\1\121\3\11\5\0\2\11\5\0\5\11"+
    "\1\122\7\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\5\0\11\11\1\123\3\11\14\0\2\11"+
    "\1\0\1\11\1\0\6\11\5\0\2\11\5\0\5\11"+
    "\1\124\7\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\43\0\1\125\21\0\15\11\14\0\2\11"+
    "\1\0\1\11\1\0\1\126\5\11\5\0\2\11\17\0"+
    "\1\127\45\0\6\11\1\130\6\11\14\0\2\11\1\131"+
    "\1\132\1\0\6\11\5\0\2\11\47\0\1\133\15\0"+
    "\15\11\14\0\2\11\1\0\1\11\1\0\4\11\1\134"+
    "\1\11\5\0\2\11\51\74\1\135\1\75\56\74\1\136"+
    "\1\75\5\74\5\0\15\11\14\0\2\11\1\137\1\140"+
    "\1\0\6\11\5\0\2\11\5\0\7\11\1\141\5\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\10\11\1\142\4\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\12\11\1\143\2\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\13\11\1\144\1\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\15\11\14\0\2\11"+
    "\1\0\1\11\1\0\2\11\1\145\3\11\5\0\1\11"+
    "\1\146\5\0\7\11\1\147\5\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\5\0\15\11\13\0"+
    "\1\150\1\151\1\11\1\0\1\11\1\0\6\11\5\0"+
    "\2\11\5\0\2\11\1\152\12\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\54\57\1\153\1\116"+
    "\2\57\5\0\1\11\1\154\13\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\5\0\15\11\14\0"+
    "\2\11\1\155\1\156\1\0\6\11\5\0\2\11\12\0"+
    "\1\157\52\0\15\11\14\0\2\11\1\0\1\11\1\0"+
    "\5\11\1\160\5\0\2\11\43\0\1\161\21\0\15\11"+
    "\14\0\2\11\1\0\1\11\1\0\1\162\5\11\5\0"+
    "\2\11\14\0\1\163\50\0\7\11\1\164\5\11\14\0"+
    "\2\11\1\0\1\11\1\0\6\11\5\0\2\11\6\0"+
    "\1\165\56\0\1\11\1\166\13\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\5\0\12\11\1\167"+
    "\2\11\14\0\2\11\1\0\1\11\1\0\6\11\5\0"+
    "\2\11\5\0\11\11\1\170\3\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\5\0\11\11\1\171"+
    "\3\11\14\0\2\11\1\0\1\11\1\0\6\11\5\0"+
    "\2\11\5\0\15\11\14\0\1\11\1\172\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\13\0\1\173\51\0\6\11"+
    "\1\174\6\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\5\0\15\11\1\175\13\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\27\0\1\176\36\0"+
    "\1\177\56\0\1\11\1\200\13\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\40\0\2\201\23\0"+
    "\2\11\1\202\12\11\14\0\2\11\1\0\1\11\1\0"+
    "\6\11\5\0\2\11\47\0\1\203\15\0\15\11\14\0"+
    "\2\11\1\0\1\11\1\0\4\11\1\204\1\11\5\0"+
    "\2\11\16\0\1\205\46\0\11\11\1\206\3\11\14\0"+
    "\2\11\1\0\1\11\1\0\6\11\5\0\2\11\43\0"+
    "\1\207\21\0\15\11\14\0\2\11\1\0\1\11\1\0"+
    "\1\210\5\11\5\0\2\11\5\0\15\11\13\0\1\211"+
    "\1\212\1\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\5\0\12\11\1\213\2\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\5\0\15\11\14\0\2\11"+
    "\1\0\1\11\1\0\1\214\5\11\5\0\2\11\16\0"+
    "\1\215\46\0\11\11\1\216\3\11\14\0\2\11\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\23\0\1\217\77\0"+
    "\1\220\21\0\15\11\14\0\2\11\1\0\1\11\1\0"+
    "\1\221\5\11\5\0\2\11\6\0\1\222\56\0\1\11"+
    "\1\223\13\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\13\0\1\224\51\0\6\11\1\225\6\11"+
    "\14\0\2\11\1\0\1\11\1\0\6\11\5\0\2\11"+
    "\44\0\1\226\20\0\15\11\14\0\2\11\1\0\1\11"+
    "\1\0\1\11\1\227\4\11\5\0\2\11\17\0\1\230"+
    "\45\0\12\11\1\231\2\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11\6\0\1\232\56\0\1\11"+
    "\1\233\13\11\14\0\2\11\1\0\1\11\1\0\6\11"+
    "\5\0\2\11\5\0\15\11\14\0\1\11\1\234\1\0"+
    "\1\11\1\0\6\11\5\0\2\11\45\0\1\235\11\0"+
    "\1\236\5\0\15\11\14\0\2\11\1\0\1\11\1\0"+
    "\2\11\1\237\3\11\5\0\1\11\1\240\6\0\1\241"+
    "\56\0\1\11\1\242\13\11\14\0\2\11\1\0\1\11"+
    "\1\0\6\11\5\0\2\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5232];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\11\11\1\4\11\1\1\6\11\1\0\5\1"+
    "\1\0\4\1\1\0\1\1\1\0\7\1\2\0\5\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\2\0\3\1"+
    "\1\11\3\1\1\11\10\1\1\0\1\11\5\1\1\11"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\11"+
    "\1\1\1\0\10\1\1\0\2\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\5\1\1\0\1\1\1\0\1\11\1\0\1\1\1\0"+
    "\1\1\1\11\1\1\1\0\1\1\1\0\1\1\1\11"+
    "\3\1\1\0\1\1\1\11\1\0\1\1\1\11\3\1"+
    "\1\0\1\1\1\11\1\1\1\11\2\1\2\11\2\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[162];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexical(java.io.Reader in) {
      yyline = 0;
    yychar = 0;
   
    
    this.zzReader = in;
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println(yytext() + 1);
            } 
            // fall through
          case 51: break;
          case 2: 
            { System.out.println(yytext() + 2);
            } 
            // fall through
          case 52: break;
          case 3: 
            { System.out.println(yytext() + 3);
            } 
            // fall through
          case 53: break;
          case 4: 
            { System.out.println(yytext() + 4);
            } 
            // fall through
          case 54: break;
          case 5: 
            { System.out.println(yytext()+"faskjndasjkfadsf"); return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 55: break;
          case 6: 
            { System.out.println(yytext()); return new Symbol(sym.NUMERO_ENTERO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 56: break;
          case 7: 
            { System.out.println(yytext()); return new Symbol(sym.CORCHETE_ABIERTO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 57: break;
          case 8: 
            { System.out.println(yytext()); return new Symbol(sym.CORCHETE_CERRADO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 58: break;
          case 9: 
            { System.out.println(yytext()+11); return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 59: break;
          case 10: 
            { System.out.println(yytext()); return new Symbol(sym.DOS_PUNTOS, yycolumn, yyline, yytext());
            } 
            // fall through
          case 60: break;
          case 11: 
            { System.out.println(yytext()); return new Symbol(sym.SLASH_MENOR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 61: break;
          case 12: 
            { System.out.println(yytext()); return new Symbol(sym.SLASH_MAYOR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 62: break;
          case 13: 
            { System.out.println(yytext()); return new Symbol(sym.DIAGONAL, yycolumn, yyline, yytext());
            } 
            // fall through
          case 63: break;
          case 14: 
            { System.out.println(yytext()); return new Symbol(sym.PUNTO_Y_COMA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 64: break;
          case 15: 
            { System.out.println(yytext()); return new Symbol(sym.COMMA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 65: break;
          case 16: 
            { System.out.println(yytext()); return new Symbol(sym.PARENTESIS_ABIERTO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 66: break;
          case 17: 
            { System.out.println(yytext()); return new Symbol(sym.PARENTESIS_CERRADO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 67: break;
          case 18: 
            { System.out.println(yytext()); return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());
            } 
            // fall through
          case 68: break;
          case 19: 
            { System.out.println(yytext() + 5);
            } 
            // fall through
          case 69: break;
          case 20: 
            { System.out.println(yytext()+ "SI 2ESTOY ACA"); return new Symbol(sym.VAR, yycolumn, yyline, yytext());
            } 
            // fall through
          case 70: break;
          case 21: 
            { System.out.println(yytext()+10); return new Symbol(sym.ARREGLO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 71: break;
          case 22: 
            { System.out.println(yytext()); return new Symbol(sym.RESTA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 72: break;
          case 23: 
            { System.out.println(yytext()); return new Symbol(sym.NUMERO_FLOTANTE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 73: break;
          case 24: 
            { System.out.println(yytext()); return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 74: break;
          case 25: 
            { System.out.println(yytext()); return new Symbol(sym.END, yycolumn, yyline, yytext());
            } 
            // fall through
          case 75: break;
          case 26: 
            { System.out.println(yytext()); return new Symbol(sym.SUMA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 76: break;
          case 27: 
            { System.out.println(yytext()); return new Symbol(sym.MAX, yycolumn, yyline, yytext());
            } 
            // fall through
          case 77: break;
          case 28: 
            { System.out.println(yytext()); return new Symbol(sym.MODULO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 78: break;
          case 29: 
            { System.out.println(yytext()); return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext());
            } 
            // fall through
          case 79: break;
          case 30: 
            { System.out.println(yytext()); return new Symbol(sym.MIN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 80: break;
          case 31: 
            { System.out.println(yytext()); return new Symbol(sym.CADENAS, yycolumn, yyline, yytext());
            } 
            // fall through
          case 81: break;
          case 32: 
            { System.out.println(yytext()+13); return new Symbol(sym.EXEC, yycolumn, yyline, yytext());
            } 
            // fall through
          case 82: break;
          case 33: 
            { System.out.println(yytext()+15); return new Symbol(sym.EJE_X, yycolumn, yyline, yytext());
            } 
            // fall through
          case 83: break;
          case 34: 
            { System.out.println(yytext()+16); return new Symbol(sym.EJE_Y, yycolumn, yyline, yytext());
            } 
            // fall through
          case 84: break;
          case 35: 
            { System.out.println(yytext()); return new Symbol(sym.MODA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 85: break;
          case 36: 
            { System.out.println(yytext()+20); return new Symbol(sym.LABEL, yycolumn, yyline, yytext());
            } 
            // fall through
          case 86: break;
          case 37: 
            { System.out.println(yytext()+ 6);
            } 
            // fall through
          case 87: break;
          case 38: 
            { System.out.println(yytext()); return new Symbol(sym.PRINT, yycolumn, yyline, yytext());
            } 
            // fall through
          case 88: break;
          case 39: 
            { System.out.println(yytext()+19); return new Symbol(sym.VALUES, yycolumn, yyline, yytext());
            } 
            // fall through
          case 89: break;
          case 40: 
            { System.out.println(yytext()+8); return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 90: break;
          case 41: 
            { System.out.println(yytext()); return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());
            } 
            // fall through
          case 91: break;
          case 42: 
            { System.out.println(yytext()+9); return new Symbol(sym.CADENA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 92: break;
          case 43: 
            { System.out.println(yytext()); return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 93: break;
          case 44: 
            { System.out.println(yytext()+14); return new Symbol(sym.TITULO, yycolumn, yyline, yytext());
            } 
            // fall through
          case 94: break;
          case 45: 
            { System.out.println(yytext()); return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());
            } 
            // fall through
          case 95: break;
          case 46: 
            { System.out.println(yytext()); return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 96: break;
          case 47: 
            { System.out.println(yytext()); return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());
            } 
            // fall through
          case 97: break;
          case 48: 
            { System.out.println(yytext()+17); return new Symbol(sym.TITULO_X, yycolumn, yyline, yytext());
            } 
            // fall through
          case 98: break;
          case 49: 
            { System.out.println(yytext()+18); return new Symbol(sym.TITULO_Y, yycolumn, yyline, yytext());
            } 
            // fall through
          case 99: break;
          case 50: 
            { System.out.println(yytext()); return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());
            } 
            // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
