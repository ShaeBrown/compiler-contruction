lexer grammar ulNoActions;

T18 : '(' ;
T19 : ')' ;
T20 : '{' ;
T21 : '}' ;
T22 : ';' ;
T23 : '[' ;
T24 : ']' ;
T25 : 'else' ;
T26 : 'while' ;
T27 : 'print' ;
T28 : 'println' ;
T29 : 'return' ;
T30 : ',' ;
T31 : 'true' ;
T32 : 'false' ;

// $ANTLR src "ulNoActions.g" 111
IF	: 'if'
	;

// $ANTLR src "ulNoActions.g" 114
TYPE: 'int' |  'float' | 'char' | 'string' | 'boolean' | 'void'
	;

// $ANTLR src "ulNoActions.g" 117
OP  : '==' | '<' | '+' | '-' | '*'
    ;

// $ANTLR src "ulNoActions.g" 120
ID	: NON_DIGIT VALID_CHAR*
	;

// $ANTLR src "ulNoActions.g" 123
INT : NONZERO_DIGIT DIGIT*
    ;

// $ANTLR src "ulNoActions.g" 126
STRING : '"'(VALID_CHAR|' ')*'"'
    ;

// $ANTLR src "ulNoActions.g" 129
CHAR: '\''(VALID_CHAR|' ')'\''
    ;

// $ANTLR src "ulNoActions.g" 132
FLOAT: NONZERO_DIGIT DIGIT* '.' DIGIT*
    ;

// $ANTLR src "ulNoActions.g" 135
fragment DIGIT: ('0'..'9');
// $ANTLR src "ulNoActions.g" 136
fragment NONZERO_DIGIT: ('1'..'9');
// $ANTLR src "ulNoActions.g" 137
fragment NON_DIGIT: ('a'..'z')|('A'..'Z')|'_';
// $ANTLR src "ulNoActions.g" 138
fragment VALID_CHAR: NON_DIGIT|DIGIT;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
// $ANTLR src "ulNoActions.g" 145
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "ulNoActions.g" 148
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
