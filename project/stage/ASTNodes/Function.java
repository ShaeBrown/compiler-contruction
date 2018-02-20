package ASTNodes;

public class Function  extends ASTNode{
    FunctionDecl funcDecl;
    FunctionBody funcBody;
    
    public Function(FunctionDecl decl, FunctionBody body) {
        this.funcDecl = decl;
        this.funcBody = body;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
