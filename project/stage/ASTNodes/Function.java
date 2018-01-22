package ASTNodes;

public class Function {
    FunctionDecl funcDecl;
    FunctionBody funcBody;
    public Function(FunctionDecl decl, FunctionBody body) {
        this.funcDecl = decl;
        this.funcBody = body;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
