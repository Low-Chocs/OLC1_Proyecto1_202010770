
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analyzers;

import java_cup.runtime.*;
import java.util.ArrayList;
import proyecto1_oc1_202010770.tabla_de_simbolos;
import proyecto1_oc1_202010770.operaciones_aritmeticas;
import java.util.Scanner;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class sintactical extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public sintactical() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public sintactical(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintactical(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\005\015\000\002\010\020\000\002\006\003\000" +
    "\002\006\003\000\002\011\005\000\002\011\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\010\000\002\007\010\000\002\007\010" +
    "\000\002\007\010\000\002\007\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\004\043\005\001\002\000\004\002\115\001" +
    "\002\000\006\004\006\010\013\001\002\000\004\012\103" +
    "\001\002\000\004\042\101\001\002\000\010\004\006\010" +
    "\013\042\ufffe\001\002\000\010\004\ufffc\010\ufffc\042\ufffc" +
    "\001\002\000\010\004\ufffd\010\ufffd\042\ufffd\001\002\000" +
    "\004\012\014\001\002\000\006\006\015\007\017\001\002" +
    "\000\004\012\ufff9\001\002\000\004\012\020\001\002\000" +
    "\004\012\ufff8\001\002\000\004\012\021\001\002\000\004" +
    "\011\022\001\002\000\004\005\023\001\002\000\004\013" +
    "\024\001\002\000\004\015\025\001\002\000\004\021\026" +
    "\001\002\000\024\005\033\023\030\024\041\025\032\026" +
    "\036\027\035\044\027\045\034\046\031\001\002\000\012" +
    "\016\ufff5\020\ufff5\022\ufff5\042\ufff5\001\002\000\004\017" +
    "\073\001\002\000\012\016\ufff3\020\ufff3\022\ufff3\042\ufff3" +
    "\001\002\000\004\017\066\001\002\000\012\016\ufff2\020" +
    "\ufff2\022\ufff2\042\ufff2\001\002\000\012\016\ufff4\020\ufff4" +
    "\022\ufff4\042\ufff4\001\002\000\004\017\061\001\002\000" +
    "\004\017\054\001\002\000\006\016\050\022\047\001\002" +
    "\000\006\016\ufff6\022\ufff6\001\002\000\004\017\042\001" +
    "\002\000\024\005\033\023\030\024\041\025\032\026\036" +
    "\027\035\044\027\045\034\046\031\001\002\000\004\016" +
    "\044\001\002\000\024\005\033\023\030\024\041\025\032" +
    "\026\036\027\035\044\027\045\034\046\031\001\002\000" +
    "\004\020\046\001\002\000\012\016\ufff0\020\ufff0\022\ufff0" +
    "\042\ufff0\001\002\000\004\042\052\001\002\000\024\005" +
    "\033\023\030\024\041\025\032\026\036\027\035\044\027" +
    "\045\034\046\031\001\002\000\006\016\ufff7\022\ufff7\001" +
    "\002\000\004\047\053\001\002\000\010\004\ufffa\010\ufffa" +
    "\042\ufffa\001\002\000\024\005\033\023\030\024\041\025" +
    "\032\026\036\027\035\044\027\045\034\046\031\001\002" +
    "\000\004\016\056\001\002\000\024\005\033\023\030\024" +
    "\041\025\032\026\036\027\035\044\027\045\034\046\031" +
    "\001\002\000\004\020\060\001\002\000\012\016\uffee\020" +
    "\uffee\022\uffee\042\uffee\001\002\000\024\005\033\023\030" +
    "\024\041\025\032\026\036\027\035\044\027\045\034\046" +
    "\031\001\002\000\004\016\063\001\002\000\024\005\033" +
    "\023\030\024\041\025\032\026\036\027\035\044\027\045" +
    "\034\046\031\001\002\000\004\020\065\001\002\000\012" +
    "\016\uffed\020\uffed\022\uffed\042\uffed\001\002\000\024\005" +
    "\033\023\030\024\041\025\032\026\036\027\035\044\027" +
    "\045\034\046\031\001\002\000\004\016\070\001\002\000" +
    "\024\005\033\023\030\024\041\025\032\026\036\027\035" +
    "\044\027\045\034\046\031\001\002\000\004\020\072\001" +
    "\002\000\012\016\uffef\020\uffef\022\uffef\042\uffef\001\002" +
    "\000\024\005\033\023\030\024\041\025\032\026\036\027" +
    "\035\044\027\045\034\046\031\001\002\000\004\016\075" +
    "\001\002\000\024\005\033\023\030\024\041\025\032\026" +
    "\036\027\035\044\027\045\034\046\031\001\002\000\004" +
    "\020\077\001\002\000\012\016\ufff1\020\ufff1\022\ufff1\042" +
    "\ufff1\001\002\000\004\042\uffff\001\002\000\004\043\102" +
    "\001\002\000\004\002\000\001\002\000\006\006\015\007" +
    "\017\001\002\000\004\012\105\001\002\000\004\012\106" +
    "\001\002\000\004\005\107\001\002\000\004\013\110\001" +
    "\002\000\004\015\111\001\002\000\024\005\033\023\030" +
    "\024\041\025\032\026\036\027\035\044\027\045\034\046" +
    "\031\001\002\000\004\042\113\001\002\000\004\047\114" +
    "\001\002\000\010\004\ufffb\010\ufffb\042\ufffb\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\004\002\003\001\001\000\002\001\001\000" +
    "\012\003\006\004\007\005\011\010\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\003\077\004\007\005" +
    "\011\010\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\007\037\011\036" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\042\001\001" +
    "\000\002\001\001\000\004\007\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\054\001\001\000\002\001\001\000\004" +
    "\007\056\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\061\001\001\000\002\001\001\000\004\007\063" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\066\001\001\000\002\001\001\000\004\007\070\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\007\073\001" +
    "\001\000\002\001\001\000\004\007\075\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\103\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\111\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintactical$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintactical$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintactical$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public ArrayList<proyecto1_oc1_202010770.tabla_de_simbolos> tabla_simbolos = new ArrayList<>();
    public proyecto1_oc1_202010770.operaciones_aritmeticas operaciones = new operaciones_aritmeticas();
    public String datos_en_lista = "";
    public int num_global = 0;
    public void syntax_error(Symbol s){
        System.out.println("Error Sintactico: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1)+"\n"  );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error de sintaxis no se pudo terminar de analizar: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1)+"\n" );
        
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$sintactical$actions {
  private final sintactical parser;

  /** Constructor */
  CUP$sintactical$actions(sintactical parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$sintactical$do_action_part00000000(
    int                        CUP$sintactical$act_num,
    java_cup.runtime.lr_parser CUP$sintactical$parser,
    java.util.Stack            CUP$sintactical$stack,
    int                        CUP$sintactical$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintactical$result;

      /* select the action based on the action number */
      switch (CUP$sintactical$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		RESULT = start_val;
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintactical$parser.done_parsing();
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= PROGRAM instruccion END PROGRAM 
            {
              Object RESULT =null;

              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instruccion ::= lista_de_instrucciones instruccion 
            {
              Object RESULT =null;

              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instruccion ::= lista_de_instrucciones 
            {
              Object RESULT =null;

              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // lista_de_instrucciones ::= asignacion 
            {
              Object RESULT =null;

              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("lista_de_instrucciones",2, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // lista_de_instrucciones ::= lista 
            {
              Object RESULT =null;

              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("lista_de_instrucciones",2, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // asignacion ::= VAR DOS_PUNTOS tipo_de_dato DOS_PUNTOS DOS_PUNTOS VARIABLE SLASH_MENOR DIAGONAL dato END PUNTO_Y_COMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-8)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).value;
		
            System.out.println(b+"jkldajkds");
            tabla_simbolos.add(new proyecto1_oc1_202010770.tabla_de_simbolos(a.toString(),b.toString(),c.toString()));
            for (proyecto1_oc1_202010770.tabla_de_simbolos simbolo : tabla_simbolos) {
            System.out.println("Tipo: " + simbolo.tipo + ", Variable: " + simbolo.variable + ", Dato: " + simbolo.dato);
        }
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("asignacion",3, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-10)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // lista ::= ARREGLO DOS_PUNTOS tipo_de_dato DOS_PUNTOS DOS_PUNTOS ARROBA VARIABLE SLASH_MENOR DIAGONAL CORCHETE_ABIERTO datos_de_lista CORCHETE_CERRADO END PUNTO_Y_COMA 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-7)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-7)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-7)).value;
		
         Scanner scanner = new Scanner(datos_en_lista);
        while (scanner.hasNext()) {
            // Leer el próximo número como String
            String numeroStr = scanner.next();
            
            // Convertir el String a Double y agregarlo al ArrayList
            double numero = Double.parseDouble(numeroStr);
            System.out.println(var +": "+numero);
        }


              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("lista",6, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-13)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tipo_de_dato ::= DOUBLE 
            {
              Object RESULT =null;
		RESULT = "double"; 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("tipo_de_dato",4, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // tipo_de_dato ::= CADENA 
            {
              Object RESULT =null;
		RESULT = "cadena"; 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("tipo_de_dato",4, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // datos_de_lista ::= datos_de_lista COMMA dato 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		 datos_en_lista += " "+b.toString(); RESULT = b;System.out.println(datos_en_lista);
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("datos_de_lista",7, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-2)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // datos_de_lista ::= dato 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		datos_en_lista += " "+a.toString();  RESULT = a;
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("datos_de_lista",7, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // dato ::= CADENAS 
            {
              Object RESULT =null;
		int datosleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int datosright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		String datos = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		RESULT = datos.toString(); ; 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // dato ::= NUMERO_FLOTANTE 
            {
              Object RESULT =null;
		int datosleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int datosright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		String datos = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		RESULT = datos.toString(); 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // dato ::= NUMERO_ENTERO 
            {
              Object RESULT =null;
		int datosleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int datosright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		String datos = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		RESULT = datos.toString(); 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // dato ::= VARIABLE 
            {
              Object RESULT =null;
		int datosleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).left;
		int datosright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()).right;
		String datos = (String)((java_cup.runtime.Symbol) CUP$sintactical$stack.peek()).value;
		
        String variable_a_buscar = datos.toString();
        for (proyecto1_oc1_202010770.tabla_de_simbolos simbolo : tabla_simbolos){
            if(variable_a_buscar.equals(simbolo.variable)){
            RESULT = simbolo.dato;
            break;
            }
        }
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // dato ::= SUMA PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println("Suma"+izq.toString() +" "+der.toString() );
    System.out.println(operaciones.Suma(izq.toString(), der.toString()));
    RESULT = operaciones.Suma(izq.toString(), der.toString());
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // dato ::= RESTA PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println("Resta"+izq.toString() +" "+der.toString() );
    System.out.println(operaciones.Resta(izq.toString(), der.toString()));
    RESULT = operaciones.Resta(izq.toString(), der.toString());
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // dato ::= MULTIPLICACION PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println("Multiplicacion"+izq.toString() +" "+der.toString() );
    System.out.println(operaciones.Suma(izq.toString(), der.toString()));
    RESULT = operaciones.Multiplicacion(izq.toString(), der.toString());
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // dato ::= DIVISION PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println("Division"+izq.toString() +" "+der.toString() );
    System.out.println(operaciones.Suma(izq.toString(), der.toString()));
    RESULT = operaciones.Division(izq.toString(), der.toString());
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // dato ::= MODULO PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println("Modulo"+izq.toString() +" "+der.toString() );
    System.out.println(operaciones.Suma(izq.toString(), der.toString()));
    RESULT = operaciones.Modulo(izq.toString(), der.toString());
    
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("dato",5, ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-5)), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$sintactical$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$sintactical$do_action(
    int                        CUP$sintactical$act_num,
    java_cup.runtime.lr_parser CUP$sintactical$parser,
    java.util.Stack            CUP$sintactical$stack,
    int                        CUP$sintactical$top)
    throws java.lang.Exception
    {
              return CUP$sintactical$do_action_part00000000(
                               CUP$sintactical$act_num,
                               CUP$sintactical$parser,
                               CUP$sintactical$stack,
                               CUP$sintactical$top);
    }
}

}
