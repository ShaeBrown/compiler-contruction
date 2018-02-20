package ASTNodes;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends ASTNode {

    List<VariableDeclaration> varDecls;
    List<Statement> statements;

    public FunctionBody() {
        this.varDecls = new ArrayList<>();
        this.statements = new ArrayList<>();
    }

    public void addVarDecl(VariableDeclaration varDecl) {
        this.varDecls.add(varDecl);
    }

    public void addStatement(Statement stmt) {
        this.statements.add(stmt);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
