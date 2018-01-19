lexer grammar unamedLanguage;

T18 : '(' ;
T19 : ')' ;
T20 : ',' ;
T21 : '{' ;
T22 : '}' ;
T23 : ';' ;
T24 : '[' ;
T25 : ']' ;
T26 : 'while' ;
T27 : 'print' ;
T28 : 'println' ;
T29 : 'return' ;
T30 : '=' ;
T31 : '==' ;
T32 : '<' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : 'true' ;
T37 : 'false' ;

// $ANTLR src "unamedLanguage.g" 158
IF	: 'if'
	;
	
// $ANTLR src "unamedLanguage.g" 161
ELSE : 'else'
	;

// $ANTLR src "unamedLanguage.g" 164
TYPE: 'int' |  'float' | 'char' | 'string' | 'boolean' | 'void'
	;

// $ANTLR src "unamedLanguage.g" 167
ID	: NON_DIGIT VALID_CHAR*
	;

// $ANTLR src "unamedLanguage.g" 170
INT : NONZERO_DIGIT DIGIT+
    | DIGIT
    ;

// $ANTLR src "unamedLanguage.g" 174
STRING : '"'(VALID_CHAR|' ')*'"'
    ;

// $ANTLR src "unamedLanguage.g" 177
CHAR: '\''(VALID_CHAR|' ')'\''
    ;

// $ANTLR src "unamedLanguage.g" 180
FLOAT: DIGIT+ '.' DIGIT+
    ;

// $ANTLR src "unamedLanguage.g" 183
fragment DIGIT: ('0'..'9');
// $ANTLR src "unamedLanguage.g" 184
fragment NONZERO_DIGIT: ('1'..'9');
// $ANTLR src "unamedLanguage.g" 185
fragment NON_DIGIT: ('a'..'z')|('A'..'Z')|'_';
// $ANTLR src "unamedLanguage.g" 186
fragment VALID_CHAR: NON_DIGIT|DIGIT;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
// $ANTLR src "unamedLanguage.g" 193
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "unamedLanguage.g" 196
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
