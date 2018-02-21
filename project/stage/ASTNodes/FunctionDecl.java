package ASTNodes;

public class FunctionDecl extends ASTNode {
    CompoundTypeNode ct;
    Identifier id;
    FormalParameters params;

    public FunctionDecl(CompoundTypeNode ct, Identifier id, FormalParameters params) {
        this.ct = ct;
        this.id = id;
        this.params = params;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return ct.getLineNum();
    }
}
