/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

public class ArrayTypeNode extends CompoundTypeNode {
    TypeNode t;
    int size;
    public ArrayTypeNode(TypeNode t, int size) {
        this.t = t;
        this.size = size;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return t.t;
    }
}
