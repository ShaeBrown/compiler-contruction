package ASTNodes;


public class WhileStatement implements Statement {
    Expression expr;
    Block block;
    public WhileStatement(Expression e, Block b) {
        this.expr = e;
        this.block = b;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
