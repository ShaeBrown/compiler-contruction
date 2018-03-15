package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;


public class WhileStatement extends Statement {
    public Expression expr;
    public Block block;
    
    public WhileStatement(Expression e, Block b) {
        this.expr = e;
        this.block = b;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return expr.getLineNum();
    }

    @Override
    public int getPos() {
        return expr.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
