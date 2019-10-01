lexer grammar TurtleLexer;

options {
  language = Java;
}

@header {
  package TP1;
}


ID  :   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-'|' '|'&')* ; // ajouter des unités en fonction des caractères autorisés

// ignore whitespaces
WS : (' '|'\n'|'\t'|'\r'|'\u000C')+ -> skip
   ;

fragment ASCII  : ~('\n'|'"'|'<'|'>');


CHEVRON_DROIT : '>' ;

CHEVRON_GAUCHE : '<' ;

GUILLEMET : '"' ;

POINT : '.' ;

PTVRG : ';' ;

VIRG : ',' ;
