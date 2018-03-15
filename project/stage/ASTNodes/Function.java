package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public class Function  extends ASTNode {
    public FunctionDecl funcDecl;
    public FunctionBody funcBody;
    
    public Function(FunctionDecl decl, FunctionBody body) {
        this.funcDecl = decl;
        this.funcBody = body;
    }
    
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return funcDecl.getLineNum();
    }

    @Override
    public int getPos() {
        return funcDecl.getPos();
    }
}
