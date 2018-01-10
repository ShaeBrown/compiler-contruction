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

program : function+ 
	;

function: functionDecl functionBody
	;

functionDecl: compoundType identifier '(' formalParameters ')'
	;

formalParameters: compoundType identifier
    |
    ;

functionBody: '{' varDecl* statement* '}'
	;

varDecl: compoundType identifier ';'
    ;

identifier : ID
	;

compoundType: TYPE
            | TYPE '['INT']'
	;

statement:  ';'
         |  expr ';'
         |  IF '(' expr ')' block ('else' block)?
         | 'while' '(' expr ')' block
         | 'print' expr ';'
         | 'println' expr ';'
         | 'return' expr? ';'
         /*
         reachable by 2
         | identifier ('[' expr ']')? '=' expr ';'
         */
         ;

block: '{' statement* '}'
    ;

/*
Left-recursive solution
expr:   expr OP expr
      | identifier '[' expr ']'
      | identifier '(' exprList ')'
      | identifier
      | literal
      | '(' expr ')'
      ;
*/

expr:  identifier '[' expr ']' exprPrime
     | identifier '(' exprList ')' exprPrime
     | identifier exprPrime
     | literal exprPrime
     | '(' expr ')' exprPrime
     ;

exprPrime: OP expr exprPrime
           |
           ;

exprList: expr exprMore*
        |
        ;

exprMore: ',' expr;

literal : INT | STRING | CHAR | FLOAT | 'true' | 'false'
    ;

/* Lexer */
	 
IF	: 'if'
	;

TYPE: 'int' |  'float' | 'char' | 'string' | 'boolean' | 'void'
	;

OP  : '==' | '<' | '+' | '-' | '*'
    ;

ID	: NON_DIGIT VALID_CHAR*
	;

INT : NONZERO_DIGIT DIGIT*
    ;

STRING : '"'(VALID_CHAR|' ')*'"'
    ;

CHAR: '\''(VALID_CHAR|' ')'\''
    ;

FLOAT: NONZERO_DIGIT DIGIT* '.' DIGIT*
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
