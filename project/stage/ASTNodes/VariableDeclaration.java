package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public class VariableDeclaration extends ASTNode {
    public Identifier id;
    public CompoundTypeNode ct;
    
    public VariableDeclaration(Identifier id, CompoundTypeNode ct) {
        this.id = id;
        this.ct = ct;
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
