package ASTNodes;

public class Identifier extends Atom {
    String value;
    int lineNum;
    
    public Identifier(int lineNum, String value) {
        this.value = value;
        this.lineNum = lineNum;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return this.lineNum;
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }
}
