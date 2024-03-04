package Analyzers;
import java_cup.runtime.*;

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
%init{
    yyline = 0;
    yychar = 0;
%init}

ONE_LINE_COMMENT = \/\/[^\n]*
COMMENT_TEXT = [^!]
MULTI_LINE_COMMENT = "\/*"({COMMENT_TEXT})*"*\/"


NUMERO_ENTERO = [0-9]+
NUMERO_FLOTANTE = [0-9]+("."[0-9]+)
BOOLEANO = "true"|"false"
VARIABLE = [a-zA-Z_]([a-zA-Z0-9_])*
STRING =  \"([^\"]|"\\\"")+\"
CHAR = '[^']'


CONCATENATION = \.
DISJUNCTION = "|"
NO_OR_MORE = "*"
ONE_OR_MORE = "+"
NO_OR_ONE = "?"
SET = "CONJ"
LOWER = [a-z]
UPPER = [A-Z]
NUMBERS = [0-9]
COMMA = ","
SEPARATOR = "~"
NEW_LINE = \n
TAB = \t
SPACE = " "
CAR_RETURN = \r
BEGIN = "\{"
END = "\}"
PORCENTAGE = "%"
COLON = ":"
SEMI_COLON = ";"
ESCAPED = "\\\"" | "\\n" | "\\\'"
NO_ESCAPED = [^\'\"]
CHARACTER = (\"{NO_ESCAPED} \")| {ESCAPED}
TEXT = \"([^\"]|"\\\"")+\"
SPECIAL = [( -\/)(:-@)(\[-`)(\-})]
VARIABLE = [a-zA-Z_]([a-zA-Z0-9_])+
SLASH = "-"
MAYOR = ">"
PARENTESIS_ABIERTO = "("
PARENTESIS_CERRADO = ")"


%% 

<YYINITIAL> {NEW_LINE} {System.out.println(yytext()); }
<YYINITIAL> {TAB} {System.out.println(yytext()); }
<YYINITIAL> {SPACE} {System.out.println(yytext()); }
<YYINITIAL> {CAR_RETURN} {System.out.println(yytext());}
<YYINITIAL> {ONE_LINE_COMMENT} {System.out.println(yytext()); }
<YYINITIAL> {MULTI_LINE_COMMENT} {System.out.println(yytext()); }
<YYINITIAL> {CHARACTER} {System.out.println(yytext()); return new Symbol(sym.CHARACTER, yycolumn, yyline, yytext());}
<YYINITIAL> {TEXT} {System.out.println(yytext()+  " Soy un cad"); return new Symbol(sym.TEXT, yycolumn, yyline, yytext());}
<YYINITIAL> {CONCATENATION} {System.out.println(yytext()); return new Symbol(sym.CONCATENATION, yycolumn, yyline, yytext());}
<YYINITIAL> {DISJUNCTION} {System.out.println(yytext()); return new Symbol(sym.DISJUNCTION, yycolumn, yyline, yytext());}
<YYINITIAL> {NO_OR_MORE} {System.out.println(yytext()); return new Symbol(sym.NO_OR_MORE, yycolumn, yyline, yytext());}
<YYINITIAL> {NO_OR_ONE} {System.out.println(yytext()); return new Symbol(sym.NO_OR_ONE, yycolumn, yyline, yytext());}
<YYINITIAL> {ONE_OR_MORE} {System.out.println(yytext()); return new Symbol(sym.ONE_OR_MORE, yycolumn, yyline, yytext());}
<YYINITIAL> {SET} {System.out.println(yytext()); return new Symbol(sym.SET, yycolumn, yyline, yytext());}
<YYINITIAL> {VARIABLE} {System.out.println(yytext()); return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());}
<YYINITIAL> {LOWER} {System.out.println(yytext()); return new Symbol(sym.LOWER, yycolumn, yyline, yytext());}
<YYINITIAL> {UPPER} {System.out.println(yytext()); return new Symbol(sym.UPPER, yycolumn, yyline, yytext());}
<YYINITIAL> {NUMBERS} {System.out.println(yytext()); return new Symbol(sym.NUMBERS, yycolumn, yyline, yytext());}
<YYINITIAL> {COMMA} {System.out.println(yytext()); return new Symbol(sym.COMMA, yycolumn, yyline, yytext());}
<YYINITIAL> {SEPARATOR} {System.out.println(yytext()); return new Symbol(sym.SEPARATOR, yycolumn, yyline, yytext());}
<YYINITIAL> {BEGIN} {System.out.println(yytext()); return new Symbol(sym.BEGIN, yycolumn, yyline, yytext());}
<YYINITIAL> {PARENTESIS_CERRADO} {System.out.println(yytext()); return new Symbol(sym.PARENTESIS_CERRADO, yycolumn, yyline, yytext());}
<YYINITIAL> {PARENTESIS_ABIERTO} {System.out.println(yytext()); return new Symbol(sym.PARENTESIS_ABIERTO, yycolumn, yyline, yytext());}
<YYINITIAL> {END} {System.out.println(yytext()); return new Symbol(sym.END, yycolumn, yyline, yytext());}
<YYINITIAL> {PORCENTAGE} {System.out.println(yytext()); return new Symbol(sym.PORCENTAGE, yycolumn, yyline, yytext());}
<YYINITIAL> {COLON} {System.out.println(yytext()); return new Symbol(sym.COLON, yycolumn, yyline, yytext());}
<YYINITIAL> {SEMI_COLON} {System.out.println(yytext()); return new Symbol(sym.SEMI_COLON, yycolumn, yyline, yytext());}
<YYINITIAL> {MAYOR} {System.out.println(yytext()); return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());}
<YYINITIAL> {SLASH} {System.out.println(yytext()); return new Symbol(sym.SLASH, yycolumn, yyline, yytext());}
<YYINITIAL> {SPECIAL} {System.out.println(yytext()+ " HE ENTRADO"); return new Symbol(sym.SPECIAL, yycolumn, yyline, yytext());}
