grammar unamedLanguage;

@header {
	import ASTNodes.*;
}
		
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


program returns [Program prog]
@init
{
	prog = new Program();
}
	: 
	(f=function { prog.addFunction(f);})+ EOF
	;

function returns [Function f]:
	fd = functionDecl fb=functionBody
	{ f = new Function(fd,fb); }
     ;

functionDecl returns [FunctionDecl fd]:
	compoundType identifier '(' formalParameters ')'
	{ fd = new FunctionDecl(); }
	;

functionBody returns [FunctionBody fb]
@init 
{
	fb = new FunctionBody();
}
	:
	'{' (vd=varDecl {fb.addVarDecl(vd);})* (st=statement {fb.addStatement(st);})* '}'
	;

formalParameters: 
	compoundType identifier moreFormals*
    |
    ;

moreFormals:  
	',' compoundType identifier
    ;


varDecl returns [VariableDeclaration vd]:
	compoundType identifier ';'
	{ vd = new VariableDeclaration(); }
    ;

compoundType: 
	TYPE
	| TYPE '['INT']'
	;

arr :
	identifier '[' expr ']'
    ;

statement returns [Statement st] options {backtrack = true;}:
	expr ';'
	| IF '(' expr ')' block (ELSE block)?
	| 'while' '(' expr ')' block
	| 'print' expr ';'
	| 'println' expr ';'
	| 'return' expr? ';'
	| identifier '=' expr ';'
	| arr  '=' expr ';'
	| ';'
	{ st = new Statement(); }
  ;

block: 
	'{' statement* '}'
    ;

atom :
	arr
	| identifier '(' exprList ')'
	| identifier
	| literal
	| '(' expr ')'
   ;

expr:
    equalsExpr
    ;

equalsExpr :
    compExpr equalsPrime
    ;

equalsPrime :
    '==' compExpr equalsPrime
    |
	;

compExpr:
    addSubExpr compPrime
    ;

compPrime :
	'<' addSubExpr compPrime
	|
	;

addSubExpr:
    multiExpr addSubPrime
    ;

addSubPrime:
    ('+'|'-')  multiExpr addSubPrime
    |
    ;
	
multiExpr: atom multiPrime
	;

multiPrime:
    '*' atom multiPrime
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

INT : NONZERO_DIGIT DIGIT+
    | DIGIT
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
