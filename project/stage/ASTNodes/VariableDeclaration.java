package ASTNodes;

public class VariableDeclaration extends ASTNode {
    Identifier id;
    CompoundTypeNode ct;
    public VariableDeclaration(Identifier id, CompoundTypeNode ct) {
        this.id = id;
        this.ct = ct;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return ct.getLineNum();
    }
}
