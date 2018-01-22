package ASTNodes;

public class Identifier implements Atom {
    String value;
    public Identifier(String value) {
        this.value = value;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
