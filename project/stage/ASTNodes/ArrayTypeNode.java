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
    public Type getType() {
        return t.t;
    }

    @Override
    public int getLineNum() {
        return t.getLineNum();
    }
}
