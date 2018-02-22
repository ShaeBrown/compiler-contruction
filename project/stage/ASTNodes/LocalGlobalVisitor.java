/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import java.util.HashSet;

/**
 *
 * @author shaebrown
 */
public class LocalGlobalVisitor implements Visitor {

    boolean hasMain = false;
    HashSet<String> varName = new HashSet<>();
    HashSet<String> funcNames = new HashSet<>();
    HashSet<String> paramNames = new HashSet<>();

    @Override
    public void visit(AddExpression expr) {
        expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(ArrayAssignmentStatement expr) {
        expr.arr.accept(this);
        expr.expr.accept(this);
    }

    @Override
    public void visit(ArrayReference expr) {
        expr.i.accept(this);
        expr.e.accept(this);
    }

    @Override
    public void visit(ArrayTypeNode expr) {
    }

    @Override
    public void visit(AssignmentStatement expr) {
        expr.i.accept(this);
        expr.expr.accept(this);
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
        expr.addSubExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(EqualsExpression expr) {
        expr.compExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
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
        if (expr.ct.getType() == Type.VOID) {
            throw new LocalGlobalException(expr.getLineNum(), "No parameter may have a “type” of void.");
        }
        if (paramNames.contains(expr.id.value)) {
            throw new LocalGlobalException(expr.getLineNum(), "No two parameters of a function may have the same name");
        }
        paramNames.add(expr.id.value);
    }

    @Override
    public void visit(FormalParameters expr) {
        paramNames = new HashSet<>();
        for (FormalParameter param : expr.params) {
            param.accept(this);
        }
    }

    @Override
    public void visit(Function expr) {
        expr.funcDecl.accept(this);
        expr.funcBody.accept(this);
    }

    @Override
    public void visit(FunctionBody expr) {
        varName = new HashSet<>();
        for (VariableDeclaration var : expr.varDecls) {
            var.accept(this);
        }
        for (Statement s : expr.statements) {
            s.accept(this);
        }
    }

    @Override
    public void visit(FunctionDecl expr) {
        if (expr.id.value.equals("main") && expr.params.params.isEmpty()
                && !expr.ct.isArrayType() && expr.ct.getType() == Type.VOID) {
            hasMain = true;
        }
        expr.params.accept(this);
    }

    @Override
    public void visit(Identifier expr) {
        if (!varName.contains(expr.value) && !paramNames.contains(expr.value) && !funcNames.contains(expr.value)) {
            throw new LocalGlobalException(expr.getLineNum(), "Each local variable must be defined before being used.");
        }
    }

    @Override
    public void visit(IfStatement expr) {
        expr.ifExpr.accept(this);
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
        expr.a.accept(this);
        if (expr.expr != null) {
            expr.expr.accept(this);
        }
    }

    @Override
    public void visit(FunctionCallAtom expr) {
        expr.i.accept(this);
        expr.exprs.accept(this);
    }

    @Override
    public void visit(PrintStatement expr) {
        expr.e.accept(this);
    }

    @Override
    public void visit(PrintlnStatement expr) {
        expr.expr.accept(this);
    }

    @Override
    public void visit(Program expr) {
        if (expr.functionList.isEmpty()) {
            throw new LocalGlobalException(expr.getLineNum(), "A program must contain at least one function");
        }
        for (Function f : expr.functionList) {
            if (funcNames.contains(f.funcDecl.id.value)) {
                throw new LocalGlobalException(expr.getLineNum(), "No two functions may have the same name");
            }
            funcNames.add(f.funcDecl.id.value);
        }
        for (Function f : expr.functionList) {
            f.accept(this);
        }
        if (!hasMain) {
            throw new LocalGlobalException(expr.getLineNum(), "One function must be called main, and "
                    + "must take no parameters, and must have a return “type” of void.");
        }
    }

    @Override
    public void visit(ReturnStatement expr) {
        if (expr.expr != null) {
            expr.expr.accept(this);
        }
    }

    @Override
    public void visit(StringLiteral expr) {

    }

    @Override
    public void visit(SubExpression expr) {
        expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(TypeNode expr) {

    }

    @Override
    public void visit(VariableDeclaration expr) throws LocalGlobalException {
        if (expr.ct.getType() == Type.VOID) {
            throw new LocalGlobalException(expr.getLineNum(), "No local variable may have a “type” of void.");
        }
        if (varName.contains(expr.id.value)) {
            throw new LocalGlobalException(expr.getLineNum(), " No two local variables declared in a function may have the same name.");
        }
        if (paramNames.contains(expr.id.value)) {
            throw new LocalGlobalException(expr.getLineNum(), "A local variable may not hide the name of a parameter.");
        }
        varName.add(expr.id.value);
    }

    @Override
    public void visit(WhileStatement expr) {
        expr.expr.accept(this);
        expr.block.accept(this);
    }

    @Override
    public void visit(ParenAtom expr) {
        expr.expr.accept(this);
    }

}
