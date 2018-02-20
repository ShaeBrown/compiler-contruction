package ASTNodes;


public class WhileStatement extends Statement {
    Expression expr;
    Block block;
    public WhileStatement(Expression e, Block b) {
        this.expr = e;
        this.block = b;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
