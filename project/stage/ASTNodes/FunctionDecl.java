package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public class FunctionDecl extends ASTNode {
    public CompoundTypeNode ct;
    public Identifier id;
    public FormalParameters params;

    public FunctionDecl(CompoundTypeNode ct, Identifier id, FormalParameters params) {
        this.ct = ct;
        this.id = id;
        this.params = params;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }

    @Override
    public int getLineNum() {
        return ct.getLineNum();
    }

    @Override
    public int getPos() {
        return ct.getPos();
    }
}
