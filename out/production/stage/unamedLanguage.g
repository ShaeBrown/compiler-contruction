grammar unamedLanguage;

@lexer::header {
    import ASTNodes.*;
}

@parser::header {
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
	ct=compoundType id=identifier '(' fp=formalParameters ')'
	{ fd = new FunctionDecl(ct, id, fp); }
	;

functionBody returns [FunctionBody fb]
@init 
{
	fb = new FunctionBody();
}
	:
	'{' (vd=varDecl {fb.addVarDecl(vd);})* (st=statement {fb.addStatement(st);})* '}'
	;

formalParameters returns [FormalParameters params]
@init {
    params = new FormalParameters();
}: 
	(ct=compoundType id=identifier { params.addParam(new FormalParameter(ct, id)); })
        (p=moreFormals { params.addParam(p); })*
    |
    ;

moreFormals returns [FormalParameter p]:  
	',' ct=compoundType id=identifier { p = new FormalParameter(ct, id); }
    ;


varDecl returns [VariableDeclaration vd]:
	ct=compoundType id=identifier ';'
	{ vd = new VariableDeclaration(id, ct); }
    ;

compoundType returns [CompoundTypeNode ct]:
	t=type { ct = t; }
	| t=type '['i=INT']' { ct = new ArrayTypeNode(t, new Integer($i.text)); }
	;

arr returns [ArrayReference arr]:
	i=identifier '[' e=expr ']' { return new ArrayReference(i,e); }
    ;

statement returns [Statement st] options {backtrack = true;}:
	  eStmt=exprStatement { st = eStmt; }
	| ifStmt=ifStatement { st = ifStmt; }
	| wStmt=whileStatement { st = wStmt; }
	| pStmt=printStatement { st = pStmt; }
	| plnStmt=printlnStatement { st = plnStmt; }
	| rStmt=returnStatement { st = rStmt; }
	| assStmt=assignmentStatement { st = assStmt; }
	| arrStmt=arrayAssignmentStatement { st = arrStmt; }
	| ';' { st = new EmptyStatement(); }
  ;
  
arrayAssignmentStatement returns [ArrayAssignmentStatement arrstmt]:
        a=arr '=' e=expr ';'
        { arrstmt = new ArrayAssignmentStatement(a, e); }
    ;
    
assignmentStatement returns [AssignmentStatement assign]:
        i=identifier '=' e=expr ';'
        { assign = new AssignmentStatement(i, e); }
    ;

ifStatement returns [IfStatement ifStmt]  options {backtrack = true;}:
          IF '(' e=expr ')' b1=block ELSE b2=block  { ifStmt = new IfStatement(e,b1,b2); }
        | IF '(' e=expr ')' b=block { ifStmt = new IfStatement(e,b); }
    ;
    
whileStatement returns [WhileStatement w]: 
        'while' '(' e=expr ')' b=block
        { w = new WhileStatement(e, b); }
    ;
    
printStatement returns [PrintStatement p]:
       'print' e= expr ';' 
       { p = new PrintStatement(e); }
    ;
       
printlnStatement returns [PrintlnStatement p]:
        'println' e=expr ';'
        { p = new PrintlnStatement(e); }
    ;

returnStatement returns [ReturnStatement r]:
        'return' e=expr? ';'
        { r = new ReturnStatement(e); }
    ;
    
exprStatement returns [ExpressionStatement s]:
        e=expr ';'
        { s = new ExpressionStatement(e); }
    ;

block returns [Block b]
@init 
{
    b = new Block();
}: 
	'{' (s=statement{ b.addStatement(s); })* '}'
    ;

atom returns [Atom a]:
	arrRef=arr { a = arrRef; }
	| id=identifier '(' exprs=exprList ')' { a = new FunctionCallAtom(id, exprs); }
	| i=identifier { a = i; }
	| l=literal { a = l; }
	| '(' e=expr ')' { a = new ParenAtom(e); }
   ;

expr returns [Expression e]:
    eq=equalsExpr { e = eq; }
    ;

equalsExpr returns [EqualsExpression eq]:
    c=compExpr e=equalsPrime { eq = new EqualsExpression(c, e); }
    ;

equalsPrime returns [EqualsExpression eq]:
    '==' c=compExpr e=equalsPrime { eq = new EqualsExpression(c, e); }
    | { eq = null; }
	;

compExpr returns [CompareExpression compExpr]:
    a=addSubExpr c=compPrime { compExpr = new CompareExpression(a, c); }
    ;

compPrime returns [CompareExpression compExpr] :
	'<' a=addSubExpr c=compPrime { compExpr = new CompareExpression(a, c); }
	| { compExpr = null; }
	;

addSubExpr returns [AddSubExpression expr]:
    m=multiExpr a=addSubPrime { expr = new AddSubExpression(m,a);  }
    ;

addSubPrime returns [AddSubExpression expr]:
    '+' m=multiExpr a=addSubPrime { expr = new AddExpression(m, a); }
    | '-' m=multiExpr a=addSubPrime { expr = new SubExpression(m, a); }
    | { expr = null; }
    ;
	
multiExpr returns [MultiExpression mexpr]: 
    a=atom m=multiPrime { mexpr = new MultiExpression(a, m); }
    ;

multiPrime returns [MultiExpression mexpr]:
    '*' a=atom m=multiPrime { mexpr = new MultiExpression(a, m); }
    | { mexpr = null; }
    ;

exprList returns [ExpressionList exprs]
@init {
    exprs = new ExpressionList();
}:
	e=expr { exprs.addExpr(e); } (em=exprMore { exprs.addExpr(em); })*
	|
	;

exprMore returns [Expression expr]: 
	',' e=expr { expr = e; } 
	;


literal returns [Literal l]: 
    i=INT { l = new IntegerLiteral(Integer.parseInt($i.text)); }
    | s=STRING { l = new StringLiteral($s.text.substring(1, $s.text.length()-1)); }
    | c=CHAR { l = new CharLiteral($c.text.charAt(1)); }
    | f=FLOAT { l = new FloatLiteral(Float.parseFloat($f.text)); }
    | 'true' { l = new BooleanLiteral(true); }
    | 'false' { l = new BooleanLiteral(false); }
    ;

identifier returns [Identifier i]:
    val=ID { i = new Identifier($val.text); }
	;


type returns [TypeNode t]:
       'int' { t = new TypeNode(Type.INT); }
    |  'float' { t = new TypeNode(Type.FLOAT); }
    |  'char' { t = new TypeNode(Type.CHAR); }
    |  'string' { t = new TypeNode(Type.STRING); }
    |  'boolean' { t = new TypeNode(Type.BOOL); }
    |  'void' { t = new TypeNode(Type.VOID); }
    ;

/* Lexer */
	 
IF	: 'if'
	;
	
ELSE : 'else'
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
