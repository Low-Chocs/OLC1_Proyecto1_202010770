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

SUMA = sum
RESTA = res
MULTIPLICACION = mul
DIVISION = div
MODULO = MOD
MEDIA =  media
MEDIANA = mediana
MODA = moda 
VARIANZA = varianza
MAX = max
MIN = min
BARRAS = graphbar
PIE = graphpie
LINEA = graphline
HISTOGRAM = histogram
BARRAS_2 = grapbar
PIE_2 = grappie
LINEA_2 = grapline



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
MULTI_LINE_COMMENT = "<!"([^!]|!([^>]|(>[^!])))*"!>" 
EXEC = exec
TITULO = titulo
EJE_X = ejex
EJE_Y = ejey
TITULO_X = titulox
TITULO_Y = tituloy
VALUES = values
LABEL = label

VAR = var
VARIABLE = [a-zA-Z_]([a-zA-Z0-9_])*
DOUBLE = double
CADENA = char"[""]"
ARREGLO = "arr"
ARROBA = "@"





%% 

<YYINITIAL> {NEW_LINE} { }
<YYINITIAL> {TAB} { }
<YYINITIAL> {SPACE} { }
<YYINITIAL> {CAR_RETURN} { }


<YYINITIAL> {ONE_LINE_COMMENT} { yytext(); }
<YYINITIAL> {MULTI_LINE_COMMENT} { yytext(); }
<YYINITIAL> {ARREGLO} {System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext()); yytext(); return new Symbol(sym.ARREGLO, yycolumn, yyline, yytext()); }
<YYINITIAL> {ARROBA} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());
}

<YYINITIAL> {VAR} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.VAR, yycolumn, yyline, yytext());
}

<YYINITIAL> {DOUBLE} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());
}

<YYINITIAL> {CADENA} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.CADENA, yycolumn, yyline, yytext());
}

<YYINITIAL> {EXEC} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.EXEC, yycolumn, yyline, yytext());
}

<YYINITIAL> {TITULO} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.TITULO, yycolumn, yyline, yytext());
}

<YYINITIAL> {EJE_X} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.EJE_X, yycolumn, yyline, yytext());
}

<YYINITIAL> {EJE_Y} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.EJE_Y, yycolumn, yyline, yytext());
}

<YYINITIAL> {TITULO_X} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.TITULO_X, yycolumn, yyline, yytext());
}

<YYINITIAL> {TITULO_Y} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.TITULO_Y, yycolumn, yyline, yytext());
}

<YYINITIAL> {VALUES} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.VALUES, yycolumn, yyline, yytext());
}

<YYINITIAL> {LABEL} { 
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.LABEL, yycolumn, yyline, yytext());
}

// Añadir las demás reglas de acuerdo al mismo patrón



<YYINITIAL> {BARRAS} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.BARRAS, yycolumn, yyline, yytext());
}

<YYINITIAL> {PIE} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PIE, yycolumn, yyline, yytext());
}

<YYINITIAL> {LINEA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.LINEA, yycolumn, yyline, yytext());
}

<YYINITIAL> {BARRAS_2} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.BARRAS_2, yycolumn, yyline, yytext());
}

<YYINITIAL> {PIE_2} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PIE_2, yycolumn, yyline, yytext());
}

<YYINITIAL> {LINEA_2} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.LINEA_2, yycolumn, yyline, yytext());
}

<YYINITIAL> {HISTOGRAM} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.HISTOGRAM, yycolumn, yyline, yytext());
}

<YYINITIAL> {DOS_PUNTOS} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.DOS_PUNTOS, yycolumn, yyline, yytext());
}

<YYINITIAL> {PUNTO_Y_COMA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PUNTO_Y_COMA, yycolumn, yyline, yytext());
}

<YYINITIAL> {SLASH_MENOR} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.SLASH_MENOR, yycolumn, yyline, yytext());
}

<YYINITIAL> {SLASH_MAYOR} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.SLASH_MAYOR, yycolumn, yyline, yytext());
}

<YYINITIAL> {DIAGONAL} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.DIAGONAL, yycolumn, yyline, yytext());
}

<YYINITIAL> {COMMA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.COMMA, yycolumn, yyline, yytext());
}

<YYINITIAL> {PARENTESIS_CERRADO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PARENTESIS_CERRADO, yycolumn, yyline, yytext());
}

<YYINITIAL> {PARENTESIS_ABIERTO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PARENTESIS_ABIERTO, yycolumn, yyline, yytext());
}

<YYINITIAL> {CORCHETE_CERRADO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.CORCHETE_CERRADO, yycolumn, yyline, yytext());
}

<YYINITIAL> {CORCHETE_ABIERTO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.CORCHETE_ABIERTO, yycolumn, yyline, yytext());
}




<YYINITIAL> {SUMA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.SUMA, yycolumn, yyline, yytext());
}

<YYINITIAL> {RESTA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.RESTA, yycolumn, yyline, yytext());
}

<YYINITIAL> {MULTIPLICACION} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext());
}

<YYINITIAL> {DIVISION} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());
}

<YYINITIAL> {MODULO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MODULO, yycolumn, yyline, yytext());
}

<YYINITIAL> {MEDIA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());
}

<YYINITIAL> {MEDIANA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());
}

<YYINITIAL> {MODA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MODA, yycolumn, yyline, yytext());
}

<YYINITIAL> {VARIANZA} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());
}

<YYINITIAL> {MAX} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MAX, yycolumn, yyline, yytext());
}

<YYINITIAL> {MIN} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.MIN, yycolumn, yyline, yytext());
}


<YYINITIAL> {CONSOLE} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());
}

<YYINITIAL> {COLUMN} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());
}

<YYINITIAL> {PRINT} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PRINT, yycolumn, yyline, yytext());
}

<YYINITIAL> {IGUAL} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());
}

<YYINITIAL> {END} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.END, yycolumn, yyline, yytext());
}

<YYINITIAL> {PROGRAM} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());
}

<YYINITIAL> {CADENAS} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.CADENAS, yycolumn, yyline, yytext());
}

<YYINITIAL> {VARIABLE} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());
}

<YYINITIAL> {NUMERO_FLOTANTE} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.NUMERO_FLOTANTE, yycolumn, yyline, yytext());
}

<YYINITIAL> {NUMERO_ENTERO} {
    System.out.println("Número de línea: " + yyline + ", Número de columna: " + yycolumn + ", Lexema: " + yytext());
    return new Symbol(sym.NUMERO_ENTERO, yycolumn, yyline, yytext());
}

.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }






