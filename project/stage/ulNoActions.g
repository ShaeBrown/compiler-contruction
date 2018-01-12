grammar ulNoActions;
				
@members
{
protected void mismatch (IntStream input, int ttype, BitSet follow)
        throws RecognitionException
{
        throw new MismatchedTokenException(ttype, input);
}
public void recoverFromMismatchedSet (IntStream input,
                                      RecognitionException e,
                                      BitSet follow)
        throws RecognitionException
{
        reportError(e);
        throw e;
}
}

@rulecatch {
        catch (RecognitionException ex) {
                reportError(ex);
                throw ex;
        }
}

/*
 * This is a subset of the ulGrammar to show you how
 * to make new production rules.
 * You will need to:
 *  - change type to be compoundType and include appropriate productions
 *  - introduce optional formalParameters
 *  - change functionBody to include variable declarations and statements 
 */

program : 
	function+ 
	;

function: 
	functionDecl functionBody
	;

functionDecl: 
	compoundType identifier '(' formalParameters ')'
	;

formalParameters: 
	compoundType identifier moreFormals*
    |
    ;

moreFormals:  
	',' compoundType identifier
    ;

functionBody: 
	'{' varDecl* statement* '}'
	;

varDecl: 
	compoundType identifier ';'
    ;

compoundType: 
	TYPE
	| TYPE '['INT']'
	;

statement options {backtrack = true; }:  
	expr ';'
	| IF '(' expr ')' block (ELSE block)?
	| 'while' '(' expr ')' block
	| 'print' expr ';'
	| 'println' expr ';'
	| 'return' expr? ';'
	| identifier '=' expr ';'
	| arr  '=' expr ';'
	| ';'
  ;

block: 
	'{' statement* '}'
    ;

atom options {backtrack = true; }: 
	arr
	| identifier '(' exprList ')'
	| identifier
	| literal
	| '(' expr ')'
   ;
	
expr : 
	atom equalsExpr
     ;

arr : 
	identifier '[' expr ']'
    ;

equalsExpr : 
	'==' compExpr equalsExpr
	| compExpr
	|
	;

compExpr : 
	'<' addSubExpr compExpr
	| addSubExpr
	|
	;

addSubExpr: ('+'|'-') multiExpr addSubExpr
	| multiExpr
	|
	;
	
multiExpr: '*' atom multiExpr
	| atom
	|
	;

exprList: 
	expr exprMore*
	|
	;

exprMore: 
	',' expr
	;


literal : INT | STRING | CHAR | FLOAT | 'true' | 'false'
    ;

identifier : ID
	;

/* Lexer */
	 
IF	: 'if'
	;
	
ELSE : 'else'
	;

TYPE: 'int' |  'float' | 'char' | 'string' | 'boolean' | 'void'
	;

ID	: NON_DIGIT VALID_CHAR*
	;

INT : NONZERO_DIGIT DIGIT*
    ;

STRING : '"'(VALID_CHAR|' ')*'"'
    ;

CHAR: '\''(VALID_CHAR|' ')'\''
    ;

FLOAT: DIGIT+ '.' DIGIT+
    ;

fragment DIGIT: ('0'..'9');
fragment NONZERO_DIGIT: ('1'..'9');
fragment NON_DIGIT: ('a'..'z')|('A'..'Z')|'_';
fragment VALID_CHAR: NON_DIGIT|DIGIT;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
