/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

public class TypeNode implements CompoundTypeNode {
    Type t;
    public TypeNode(Type t) {
        this.t = t;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
