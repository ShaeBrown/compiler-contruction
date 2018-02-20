package ASTNodes;

public class Identifier extends Atom {
    String value;
    
    public Identifier(String value) {
        this.value = value;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
