lexer grammar unamedLanguage;
@header {
    import ASTNodes.*;
}

T17 : '(' ;
T18 : ')' ;
T19 : '{' ;
T20 : '}' ;
T21 : ',' ;
T22 : ';' ;
T23 : '[' ;
T24 : ']' ;
T25 : '=' ;
T26 : 'while' ;
T27 : 'print' ;
T28 : 'println' ;
T29 : 'return' ;
T30 : '==' ;
T31 : '<' ;
T32 : '+' ;
T33 : '-' ;
T34 : '*' ;
T35 : 'true' ;
T36 : 'false' ;
T37 : 'int' ;
T38 : 'float' ;
T39 : 'char' ;
T40 : 'string' ;
T41 : 'boolean' ;
T42 : 'void' ;

// $ANTLR src "unamedLanguage.g" 240
IF	: 'if'
	;
	
// $ANTLR src "unamedLanguage.g" 243
ELSE : 'else'
	;

// $ANTLR src "unamedLanguage.g" 246
ID	: NON_DIGIT VALID_CHAR*
	;

// $ANTLR src "unamedLanguage.g" 249
INT : NONZERO_DIGIT DIGIT+
    | DIGIT
    ;

// $ANTLR src "unamedLanguage.g" 253
STRING : '"'(VALID_CHAR|' ')*'"'
    ;

// $ANTLR src "unamedLanguage.g" 256
CHAR: '\''(VALID_CHAR|' ')'\''
    ;

// $ANTLR src "unamedLanguage.g" 259
FLOAT: DIGIT+ '.' DIGIT+
    ;

// $ANTLR src "unamedLanguage.g" 262
fragment DIGIT: ('0'..'9');
// $ANTLR src "unamedLanguage.g" 263
fragment NONZERO_DIGIT: ('1'..'9');
// $ANTLR src "unamedLanguage.g" 264
fragment NON_DIGIT: ('a'..'z')|('A'..'Z')|'_';
// $ANTLR src "unamedLanguage.g" 265
fragment VALID_CHAR: NON_DIGIT|DIGIT;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
// $ANTLR src "unamedLanguage.g" 272
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "unamedLanguage.g" 275
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
