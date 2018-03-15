package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;


public class ArrayAssignmentStatement extends Statement {
    public ArrayReference arr;
    public Expression expr;
    public ArrayAssignmentStatement(ArrayReference arr, Expression expr) {
        this.arr = arr;
        this.expr = expr;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return arr.getLineNum();
    }

    @Override
    public int getPos() {
        return arr.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
