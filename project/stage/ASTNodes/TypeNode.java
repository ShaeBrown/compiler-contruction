/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

public class TypeNode extends CompoundTypeNode {
    Type t;
    public TypeNode(Type t) {
        this.t = t;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return t;
    }
}
