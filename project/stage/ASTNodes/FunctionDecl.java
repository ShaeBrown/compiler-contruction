package ASTNodes;

public class FunctionDecl extends ASTNode {
    CompoundTypeNode ct;
    Identifier id;
    FormalParameters params;

    public FunctionDecl(CompoundTypeNode ct, Identifier id, FormalParameters params, int lineNum) {
        this.ct = ct;
        this.id = id;
        this.params = params;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
