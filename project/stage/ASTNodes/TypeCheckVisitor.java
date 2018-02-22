/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author shaebrown
 */
public class TypeCheckVisitor implements Visitor {

    HashMap<String, CompoundTypeNode> varNames = new HashMap<>();
    HashMap<String, CompoundTypeNode> funcNames = new HashMap<>();
    CompoundTypeNode returnType;
    
    @Override
    public void visit(AddExpression expr) {
        eval(expr);   
    }

    @Override
    public void visit(AddSubExpression expr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(ArrayAssignmentStatement expr) {
        ComplexType arrayType = expr.arr.type(this);
        ComplexType exprType = expr.expr.type(this);
        if (!arrayType.equals(exprType)) {
            throw new TypeCheckException(expr.getLineNum(), "Array type is different then expression");
        }
    }

    @Override
    public void visit(ArrayReference expr) {
        ComplexType index = expr.e.type(this);
        if (index.t != Type.INT || index.isArray) {
            throw new TypeCheckException(expr.getLineNum(), "Array must be indexed by an integer");
        }
    }

    @Override
    public void visit(ArrayTypeNode expr) {
        
    }

    @Override
    public void visit(AssignmentStatement expr) {
        ComplexType idType = new ComplexType(varNames.get(expr.i.value));
        ComplexType exprType = expr.expr.type(this);
        if (!idType.equals(exprType)) {
            throw new TypeCheckException(expr.getLineNum(), "Assignment must be of the same type");
        }
    }

    @Override
    public void visit(Block expr) {
        for (Statement s : expr.statements) {
            s.accept(this);
        }
    }

    @Override
    public void visit(BooleanLiteral expr) {
        
    }

    @Override
    public void visit(CharLiteral expr) {
       
    }

    @Override
    public void visit(CompareExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(EqualsExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(EmptyStatement e) {
        
    }

    @Override
    public void visit(ExpressionList expr) {
        for (Expression e : expr.exprList) {
            e.accept(this);
        }
    }

    @Override
    public void visit(ExpressionStatement expr) {
        expr.e.accept(this);
    }

    @Override
    public void visit(FloatLiteral expr) {
        
    }

    @Override
    public void visit(FormalParameter expr) {
        
    }

    @Override
    public void visit(FormalParameters expr) {
        
    }

    @Override
    public void visit(Function expr) {
        expr.funcDecl.accept(this);
        expr.funcBody.accept(this);
    }

    @Override
    public void visit(FunctionBody expr) {
        for (VariableDeclaration decl : expr.varDecls) {
            decl.accept(this);
        }
        for (Statement s : expr.statements) {
            s.accept(this);
        }
    }

    @Override
    public void visit(FunctionDecl expr) {
        returnType = expr.ct;
        this.funcNames.put(expr.id.value, expr.ct);
    }

    @Override
    public void visit(Identifier expr) {
        
    }

    @Override
    public void visit(IfStatement expr) {
        ComplexType ifType = expr.ifExpr.type(this);
        if (ifType.isArray || ifType.t != Type.BOOL) {
            throw new TypeCheckException(expr.getLineNum(), "If statment expression must be boolean type");
        }
        expr.thenBlock.accept(this);
        if (expr.elseBlock != null) {
            expr.elseBlock.accept(this);
        }
    }

    @Override
    public void visit(IntegerLiteral expr) {
        
    }

    @Override
    public void visit(MultiExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(FunctionCallAtom expr) {
        //TODO check params
        expr.exprs.accept(this);
    }

    @Override
    public void visit(PrintStatement expr) {
        ComplexType type = expr.e.type(this);
        if (type.isArray || type.t == Type.VOID) {
            throw new TypeCheckException(expr.getLineNum(), "Print statement cannot have array or type void");
        }
    }

    @Override
    public void visit(PrintlnStatement expr) {
        ComplexType type = expr.expr.type(this);
        if (type.isArray || type.t == Type.VOID) {
            throw new TypeCheckException(expr.getLineNum(), "Println statement cannot have array or type void");
        }
    }

    @Override
    public void visit(Program expr) {
       for (Function f : expr.functionList) {
           f.accept(this);
       }
    }

    @Override
    public void visit(ReturnStatement expr) {
        ComplexType returns = expr.expr.type(this);
        ComplexType funcReturn = new ComplexType(returnType);
        if (!funcReturn.equals(returns)) {
            throw new TypeCheckException(expr.getLineNum(), "Return statement does not match function declaration return type");
        }
    }

    @Override
    public void visit(StringLiteral expr) {
        
    }

    @Override
    public void visit(SubExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(TypeNode expr) {
        
    }

    @Override
    public void visit(VariableDeclaration expr) {
        varNames.put(expr.id.value, expr.ct);
    }

    @Override
    public void visit(WhileStatement expr) {
        ComplexType whileExpr = expr.expr.type(this);
        if (whileExpr.isArray || whileExpr.t != Type.BOOL) {
            throw new TypeCheckException(expr.getLineNum(), "While statement must have boolean expression");
        }
    }

    @Override
    public void visit(ParenAtom expr) {
        expr.expr.type(this);
    }
    
    public ComplexType eval(MultiExpression expr) {
        ComplexType atom = expr.a.type(this);
        if (expr.expr != null) {
            ComplexType prime = eval(expr.expr);
            if (!atom.equals(prime)) {
                throw new TypeCheckException(expr.getLineNum(), "Multiply must be used on two of the same types");
            }
            if (!atom.isMultType() || !prime.isMultType()) {
                throw new TypeCheckException(expr.getLineNum(), "Multiply must be used on integer or float types");
            }
            return atom;
        }
        return atom;
    }
    
    public ComplexType eval(AddExpression expr) {
        ComplexType multi = eval(expr.multiExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = expr.primeExpr.type(this);
            if (!multi.equals(prime)) {
                throw new TypeCheckException(expr.getLineNum(), "Add must be used on two of the same types");
            }
            if (!multi.isAddType() || !prime.isAddType()) {
                throw new TypeCheckException(expr.getLineNum(), "Add must be used on integer, float, char or string types");
            }
            return multi;
        }
        return multi;
    }
    
    public ComplexType eval(SubExpression expr){
        ComplexType multi = eval(expr.multiExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = expr.primeExpr.type(this);
            if (!multi.equals(prime)) {
                throw new TypeCheckException(expr.getLineNum(), "Subtract must be used on two of the same types");
            }
            if (!multi.isSubType() || !prime.isSubType()) {
                throw new TypeCheckException(expr.getLineNum(), "Subtract must be used on integer, float, char or string types");
            }
            return multi;
        }
        return multi;
    }
    
    public ComplexType eval(CompareExpression expr) {
        ComplexType addSub = expr.addSubExpr.type(this);
        if (expr.primeExpr != null) {
            ComplexType prime = eval(expr.primeExpr);
            if (!addSub.equals(prime)) {
                throw new TypeCheckException(expr.getLineNum(), "Comparison must be used on two of the same types");
            }
            if (!addSub.isCompareType() || !prime.isCompareType()) {
                throw new TypeCheckException(expr.getLineNum(), "Comparison must be used on integer, float, char or string types");
            }
            return new ComplexType(Type.BOOL);
        }
        return addSub;
    }
    
    public ComplexType eval(EqualsExpression expr) {
        ComplexType compSub = eval(expr.compExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = eval(expr.primeExpr);
            if (!compSub.equals(prime)) {
                throw new TypeCheckException(expr.getLineNum(), "Equals must be used on two of the same types");
            }
            if (!compSub.isEqualsType() || !compSub.isEqualsType()) {
                throw new TypeCheckException(expr.getLineNum(), "Equals must be used on non-void type");
            }
            return new ComplexType(Type.BOOL);
        }
        return compSub;
    }
    
    public ComplexType eval(BooleanLiteral lit) {
        return new ComplexType(Type.BOOL);
    }
    
    public ComplexType eval(IntegerLiteral lit) {
        return new ComplexType(Type.INT);
    }
    
    public ComplexType eval(FloatLiteral lit) {
        return new ComplexType(Type.FLOAT);
    }
    
    public ComplexType eval(StringLiteral lit) {
        return new ComplexType(Type.STRING);
    }
    
    public ComplexType eval(CharLiteral lit) {
        return new ComplexType(Type.CHAR);
    }
    
    public ComplexType eval(ArrayReference arr) {
        return new ComplexType(varNames.get(arr.i.value));
    }
    
    public ComplexType eval(Identifier i) {
        return new ComplexType(varNames.get(i.value));
    }
    
    public ComplexType eval(FunctionCallAtom fc) {
        return new ComplexType(funcNames.get(fc.i.value));
    }
    
    public ComplexType eval(ParenAtom pa) {
        return pa.expr.type(this);
    }
    
    public class ComplexType {
        boolean isArray;
        int size;
        Type t;
        public ComplexType(Type t) {
            this.t = t;
            this.isArray = false;
        }
        
        public ComplexType(Type t, int size) {
            this.t = t;
            this.size = size;
            this.isArray = true;
        }
        
        public ComplexType(CompoundTypeNode node) {
            if (node.isArrayType()) {
                this.isArray = true;
                this.size = ((ArrayTypeNode) node).size;
            }
            this.t = node.getType();
        }
        
        public boolean equals(ComplexType type) {
            if (t != type.t) {
                return false;
            }
            if (this.isArray != type.isArray) {
                return false;
            } else if (this.isArray && this.isArray) {
                return this.size == type.size;
            }
            return true;
        }
        
        public boolean isAddType() {
            return !isArray && 
                    (t == Type.STRING || t == Type.CHAR || t == Type.FLOAT || t == Type.INT);
        }
        
        public boolean isMultType() {
            return !isArray && 
                    (t == Type.FLOAT || t == Type.INT);
        }
        
        public boolean isCompareType() {
            return !isArray && t != Type.VOID;
        }
        
        public boolean isSubType() {
            return !isArray && 
                    (t == Type.CHAR || t == Type.FLOAT || t == Type.INT);
        }
        
        public boolean isEqualsType() {
            return isCompareType();
        }
    }
}
