package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;
import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends ASTNode {

    public List<VariableDeclaration> varDecls;
    public List<Statement> statements;

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
    
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }

    @Override
    public int getLineNum() {
        if (!this.varDecls.isEmpty()) {
            return this.varDecls.get(0).getLineNum();
        } else if (!statements.isEmpty()) {
            return this.statements.get(0).getLineNum();
        }
        return 0;
    }

    @Override
    public int getPos() {
        if (!this.varDecls.isEmpty()) {
            return this.varDecls.get(0).getLineNum();
        } else if (!statements.isEmpty()) {
            return this.statements.get(0).getLineNum();
        }
        return 0;
    }
}
