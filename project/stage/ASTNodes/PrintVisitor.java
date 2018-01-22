/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

/**
 *
 * @author shaebrown
 */
public class PrintVisitor implements Visitor {

    @Override
    public void visit(AddExpression expr) {
        System.out.print(" + ");
        expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.accept(this);
        }
    }

    @Override
    public void visit(ArrayAssignmentStatement expr) {
        expr.arr.accept(this);
        System.out.print(" = ");
        expr.expr.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(ArrayReference expr) {
        expr.i.accept(this);
        System.out.print("[");
        expr.e.accept(this);
        System.out.print("]");
    }

    @Override
    public void visit(ArrayTypeNode expr) {
        expr.t.accept(this);
        System.out.print("[");
        System.out.print(expr.size);
        System.out.print("]");
    }

    @Override
    public void visit(AssignmentStatement expr) {
        expr.i.accept(this);
        System.out.print(" = ");
        expr.expr.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(Block expr) {
        //TODO: Indent properly
        System.out.println("    {");
        for (Statement s : expr.statements) {
            System.out.print("        ");
            s.accept(this);
        }
        System.out.println("    }");
    }

    @Override
    public void visit(BooleanLiteral expr) {
        System.out.print(expr.lit);
    }

    @Override
    public void visit(CharLiteral expr) {
        System.out.print("'");
        System.out.print(expr.c);
        System.out.print("'");
    }

    @Override
    public void visit(CompareExpression expr) {
        expr.addSubExpr.accept(this);
        if (expr.primeExpr != null) {
            System.out.print(" < ");
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(EqualsExpression expr) {
        expr.compExpr.accept(this);
        if (expr.primeExpr != null) {
            System.out.print(" == ");
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(EmptyStatement e) {
        System.out.println(";");
    }

    @Override
    public void visit(ExpressionList expr) {
        if (expr.exprList.size() > 0) {
            expr.exprList.get(0).accept(this);
            for (Expression e : expr.exprList.subList(1, expr.exprList.size())) {
                System.out.print(", ");
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(ExpressionStatement expr) {
        expr.e.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(FloatLiteral expr) {
        System.out.print(expr.f);
    }

    @Override
    public void visit(FormalParameter expr) {
        expr.ct.accept(this);
        System.out.print(" ");
        expr.id.accept(this);
    }

    @Override
    public void visit(FormalParameters expr) {
        if (expr.params.size() > 0) {
            expr.params.get(0).accept(this);
            for (FormalParameter f : expr.params.subList(1, expr.params.size())) {
                System.out.print(", ");
                f.accept(this);
            }
        }
    }

    @Override
    public void visit(Function expr) {
        expr.funcDecl.accept(this);
        System.out.println();
        System.out.println("{");
        expr.funcBody.accept(this);
        System.out.println("}");
    }

    @Override
    public void visit(FunctionBody expr) {
        for (VariableDeclaration v : expr.varDecls) {
            System.out.print("    ");
            v.accept(this);
        }
        for (Statement s : expr.statements) {
            System.out.print("    ");
            s.accept(this);
        }
    }

    @Override
    public void visit(FunctionDecl expr) {
        expr.ct.accept(this);
        System.out.print(" ");
        expr.id.accept(this);
        System.out.print(" (");
        expr.params.accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Identifier expr) {
        System.out.print(expr.value);
    }

    @Override
    public void visit(IfStatement expr) {
        System.out.print("if (");
        expr.ifExpr.accept(this);
        System.out.println(")");
        expr.thenBlock.accept(this);
        if (expr.elseBlock != null) {
            System.out.println("    else");
            expr.elseBlock.accept(this);
        }
    }

    @Override
    public void visit(IntegerLiteral expr) {
        System.out.print(expr.lit);
    }

    @Override
    public void visit(MultiExpression expr) {
        expr.a.accept(this);
        if (expr.expr != null) {
            System.out.print(" * ");
            expr.expr.accept(this);
        }
    }

    @Override
    public void visit(FunctionCallAtom expr) {
        expr.i.accept(this);
        System.out.print("(");
        expr.exprs.accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(PrintStatement expr) {
        System.out.print("print ");
        expr.e.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(PrintlnStatement expr) {
        System.out.print("println ");
        expr.expr.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(Program p) {
        for (Function f : p.functionList) {
            f.accept(this);
            System.out.println();
        }
    }

    @Override
    public void visit(ReturnStatement expr) {
        System.out.print("return");
        if (expr.expr != null) {
            System.out.print(" ");
            expr.expr.accept(this);
        }
        System.out.println(";");
    }

    @Override
    public void visit(StringLiteral expr) {
        System.out.print('"');
        System.out.print(expr.s);
        System.out.print('"');
    }

    @Override
    public void visit(SubExpression expr) {
        System.out.print(" - ");
        expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(TypeNode expr) {
        switch (expr.t) {
            case INT:
                System.out.print("int");
                break;
            case BOOL:
                System.out.print("boolean");
                break;
            case CHAR:
                System.out.print("char");
                break;
            case FLOAT:
                System.out.print("float");
                break;
            case STRING:
                System.out.print("string");
                break;
            case VOID:
                System.out.print("void");
                break;

        }

    }

    @Override
    public void visit(VariableDeclaration expr) {
        expr.ct.accept(this);
        System.out.print(" ");
        expr.id.accept(this);
        System.out.println(";");
    }

    @Override
    public void visit(WhileStatement expr) {
        System.out.print("while (");
        expr.expr.accept(this);
        System.out.println(")");
        expr.block.accept(this);
    }

    @Override
    public void visit(AddSubExpression expr) {
        expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            expr.primeExpr.accept(this);
        }
    }

    @Override
    public void visit(ParenAtom expr) {
        System.out.print("(");
        expr.expr.accept(this);
        System.out.print(")");
    }
}
