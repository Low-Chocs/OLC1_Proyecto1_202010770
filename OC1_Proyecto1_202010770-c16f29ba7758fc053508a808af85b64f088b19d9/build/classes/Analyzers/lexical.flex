package Analyzers;
import java_cup.runtime.*;
import java.util.ArrayList;
import Analyzers.Token;

%%
//directrices


%public 
%class lexical
%cupsym sym
%cup
%char
%column
%full
%line
%unicode
%ignorecase

%init{
    yyline = 0;
    yychar = 0;
   
    
%init}


NEW_LINE = \n
TAB = \t
SPACE = " "
CAR_RETURN = \r

VAR = var
VARIABLE = [a-zA-Z_]([a-zA-Z0-9_])*
DOUBLE = double
CADENA = char"[""]"
ARREGLO = arr
ARROBA = "@"


DOS_PUNTOS = ":"
SLASH_MENOR = "<"
SLASH_MAYOR = ">"
DIAGONAL = "-"
PUNTO_Y_COMA = ";"


COMMA = ","



PARENTESIS_ABIERTO = "("
PARENTESIS_CERRADO = ")"
CORCHETE_ABIERTO = "["
CORCHETE_CERRADO = "]"

SUMA = suma
RESTA = resta
MULTIPLICACION = mul
DIVISION = div
MODULO = MOD
MEDIA = = media
MEDIANA = mediana
MODA = moda 
VARIANZA = varianza
MAX = max
MIN = min

CONSOLE = console 
PRINT = print
IGUAL = "="
COLUMN = column

END = end
PROGRAM = program 


CADENAS =  \"([^\"]|"\\\"")+\"
NUMERO_FLOTANTE = [0-9]+("."[0-9]+)
NUMERO_ENTERO = [0-9]+


ONE_LINE_COMMENT = "!"[^\n]*
COMMENT_TEXT = [^!]
MULTI_LINE_COMMENT = "<!"({COMMENT_TEXT})*"*!>"
EXEC = exec
TITULO = titulo
EJE_X = ejex
EJE_Y = ejey
TITULO_X = titulox
TITULO_Y = tituloy
VALUES = values
LABEL = label





%% 

<YYINITIAL> {NEW_LINE} {System.out.println(yytext() + 1); }
<YYINITIAL> {TAB} {System.out.println(yytext() + 2); }
<YYINITIAL> {SPACE} {System.out.println(yytext() + 3); }
<YYINITIAL> {CAR_RETURN} {System.out.println(yytext() + 4);}


<YYINITIAL> {ONE_LINE_COMMENT} {System.out.println(yytext() + 5); }
<YYINITIAL> {MULTI_LINE_COMMENT} {System.out.println(yytext()+ 6); }

<YYINITIAL> {VAR} {System.out.println(yytext()+ "SI 2ESTOY ACA"); return new Symbol(sym.VAR, yycolumn, yyline, yytext());  }
<YYINITIAL> {DOUBLE} {System.out.println(yytext()+8); return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());}
<YYINITIAL> {CADENA} {System.out.println(yytext()+9); return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}
<YYINITIAL> {ARREGLO} {System.out.println(yytext()+10); return new Symbol(sym.ARREGLO, yycolumn, yyline, yytext());}
<YYINITIAL> {ARROBA} {System.out.println(yytext()+11); return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}

<YYINITIAL> {EXEC} {System.out.println(yytext()+13); return new Symbol(sym.EXEC, yycolumn, yyline, yytext());}
<YYINITIAL> {TITULO} {System.out.println(yytext()+14); return new Symbol(sym.TITULO, yycolumn, yyline, yytext());}
<YYINITIAL> {EJE_X} {System.out.println(yytext()+15); return new Symbol(sym.EJE_X, yycolumn, yyline, yytext());}
<YYINITIAL> {EJE_Y} {System.out.println(yytext()+16); return new Symbol(sym.EJE_Y, yycolumn, yyline, yytext());}
<YYINITIAL> {TITULO_X} {System.out.println(yytext()+17); return new Symbol(sym.TITULO_X, yycolumn, yyline, yytext());}
<YYINITIAL> {TITULO_Y} {System.out.println(yytext()+18); return new Symbol(sym.TITULO_Y, yycolumn, yyline, yytext());}
<YYINITIAL> {VALUES} {System.out.println(yytext()+19); return new Symbol(sym.VALUES, yycolumn, yyline, yytext());}
<YYINITIAL> {LABEL} {System.out.println(yytext()+20); return new Symbol(sym.LABEL, yycolumn, yyline, yytext());}

<YYINITIAL> {DOS_PUNTOS} {System.out.println(yytext()); return new Symbol(sym.DOS_PUNTOS, yycolumn, yyline, yytext());}
<YYINITIAL> {PUNTO_Y_COMA} {System.out.println(yytext()); return new Symbol(sym.PUNTO_Y_COMA, yycolumn, yyline, yytext());}
<YYINITIAL> {SLASH_MENOR} {System.out.println(yytext()); return new Symbol(sym.SLASH_MENOR, yycolumn, yyline, yytext());}
<YYINITIAL> {SLASH_MAYOR} {System.out.println(yytext()); return new Symbol(sym.SLASH_MAYOR, yycolumn, yyline, yytext());}
<YYINITIAL> {DIAGONAL} {System.out.println(yytext()); return new Symbol(sym.DIAGONAL, yycolumn, yyline, yytext());}
<YYINITIAL> {COMMA} {System.out.println(yytext()); return new Symbol(sym.COMMA, yycolumn, yyline, yytext());}
<YYINITIAL> {PARENTESIS_CERRADO} {System.out.println(yytext()); return new Symbol(sym.PARENTESIS_CERRADO, yycolumn, yyline, yytext());}
<YYINITIAL> {PARENTESIS_ABIERTO} {System.out.println(yytext()); return new Symbol(sym.PARENTESIS_ABIERTO, yycolumn, yyline, yytext());}
<YYINITIAL> {CORCHETE_CERRADO} {System.out.println(yytext()); return new Symbol(sym.CORCHETE_CERRADO, yycolumn, yyline, yytext());}
<YYINITIAL> {CORCHETE_ABIERTO} {System.out.println(yytext()); return new Symbol(sym.CORCHETE_ABIERTO, yycolumn, yyline, yytext());}


<YYINITIAL> {SUMA} {System.out.println(yytext()); return new Symbol(sym.SUMA, yycolumn, yyline, yytext());}
<YYINITIAL> {RESTA} {System.out.println(yytext()); return new Symbol(sym.RESTA, yycolumn, yyline, yytext());}
<YYINITIAL> {MULTIPLICACION} {System.out.println(yytext()); return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext());}
<YYINITIAL> {DIVISION} {System.out.println(yytext()); return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());}
<YYINITIAL> {MODULO} {System.out.println(yytext()); return new Symbol(sym.MODULO, yycolumn, yyline, yytext());}
<YYINITIAL> {MEDIA} {System.out.println(yytext()); return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());}
<YYINITIAL> {MEDIANA} {System.out.println(yytext()); return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());}
<YYINITIAL> {MODA} {System.out.println(yytext()); return new Symbol(sym.MODA, yycolumn, yyline, yytext());}
<YYINITIAL> {VARIANZA} {System.out.println(yytext()); return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());}
<YYINITIAL> {MAX} {System.out.println(yytext()); return new Symbol(sym.MAX, yycolumn, yyline, yytext());}
<YYINITIAL> {MIN} {System.out.println(yytext()); return new Symbol(sym.MIN, yycolumn, yyline, yytext());}


<YYINITIAL> {CONSOLE} {System.out.println(yytext()); return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
<YYINITIAL> {PRINT} {System.out.println(yytext()); return new Symbol(sym.PRINT, yycolumn, yyline, yytext());}
<YYINITIAL> {IGUAL} {System.out.println(yytext()); return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
<YYINITIAL> {COLUMN} {System.out.println(yytext()); return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());}


<YYINITIAL> {END} {System.out.println(yytext()); return new Symbol(sym.END, yycolumn, yyline, yytext());}
<YYINITIAL> {PROGRAM} {System.out.println(yytext()); return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}

<YYINITIAL> {CADENAS} {System.out.println(yytext()); return new Symbol(sym.CADENAS, yycolumn, yyline, yytext());}
<YYINITIAL> {VARIABLE} {System.out.println(yytext()+"faskjndasjkfadsf"); return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());}
<YYINITIAL> {NUMERO_FLOTANTE} {System.out.println(yytext()); return new Symbol(sym.NUMERO_FLOTANTE, yycolumn, yyline, yytext());}
<YYINITIAL> {NUMERO_ENTERO} {System.out.println(yytext()); return new Symbol(sym.NUMERO_ENTERO, yycolumn, yyline, yytext());}



