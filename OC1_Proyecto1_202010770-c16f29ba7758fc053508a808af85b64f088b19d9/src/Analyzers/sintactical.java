
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analyzers;

import java_cup.runtime.*;
import java.util.ArrayList;
import proyecto1_oc1_202010770.tabla_de_simbolos;
import proyecto1_oc1_202010770.operaciones_aritmeticas;
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
    "\000\015\000\002\002\004\000\002\002\006\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\005\015" +
    "\000\002\006\003\000\002\006\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\043\005\001\002\000\004\002\043\001" +
    "\002\000\004\004\006\001\002\000\004\012\015\001\002" +
    "\000\004\042\013\001\002\000\006\004\006\042\ufffe\001" +
    "\002\000\006\004\ufffd\042\ufffd\001\002\000\004\042\uffff" +
    "\001\002\000\004\043\014\001\002\000\004\002\000\001" +
    "\002\000\006\006\016\007\020\001\002\000\004\012\ufffb" +
    "\001\002\000\004\012\021\001\002\000\004\012\ufffa\001" +
    "\002\000\004\012\022\001\002\000\004\005\023\001\002" +
    "\000\004\013\024\001\002\000\004\015\025\001\002\000" +
    "\014\005\033\023\030\044\031\045\026\046\032\001\002" +
    "\000\010\016\ufff8\020\ufff8\042\ufff8\001\002\000\004\042" +
    "\041\001\002\000\004\017\034\001\002\000\010\016\ufff9" +
    "\020\ufff9\042\ufff9\001\002\000\010\016\ufff7\020\ufff7\042" +
    "\ufff7\001\002\000\010\016\ufff6\020\ufff6\042\ufff6\001\002" +
    "\000\014\005\033\023\030\044\031\045\026\046\032\001" +
    "\002\000\004\016\036\001\002\000\014\005\033\023\030" +
    "\044\031\045\026\046\032\001\002\000\004\020\040\001" +
    "\002\000\010\016\ufff5\020\ufff5\042\ufff5\001\002\000\004" +
    "\047\042\001\002\000\006\004\ufffc\042\ufffc\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\002\003\001\001\000\002\001\001\000" +
    "\010\003\006\004\007\005\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\003\011\004\007\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\016\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\034\001\001\000\002\001\001" +
    "\000\004\007\036\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

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
          case 5: // asignacion ::= VAR DOS_PUNTOS tipo_de_dato DOS_PUNTOS DOS_PUNTOS VARIABLE SLASH_MENOR DIAGONAL dato END PUNTO_Y_COMA 
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
          case 6: // tipo_de_dato ::= DOUBLE 
            {
              Object RESULT =null;
		RESULT = "double"; 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("tipo_de_dato",4, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipo_de_dato ::= CADENA 
            {
              Object RESULT =null;
		RESULT = "cadena"; 
              CUP$sintactical$result = parser.getSymbolFactory().newSymbol("tipo_de_dato",4, ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactical$stack.peek()), RESULT);
            }
          return CUP$sintactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // dato ::= CADENAS 
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
          case 9: // dato ::= NUMERO_FLOTANTE 
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
          case 10: // dato ::= NUMERO_ENTERO 
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
          case 11: // dato ::= VARIABLE 
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
          case 12: // dato ::= SUMA PARENTESIS_ABIERTO dato COMMA dato PARENTESIS_CERRADO 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$sintactical$stack.elementAt(CUP$sintactical$top-1)).value;
		
    System.out.println(operaciones.Suma(izq.toString(), der.toString()));
    RESULT = operaciones.Suma(izq.toString(), der.toString());
    
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
