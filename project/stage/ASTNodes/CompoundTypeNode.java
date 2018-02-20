/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

public abstract class CompoundTypeNode extends ASTNode {
    public abstract void accept(Visitor v);
    public abstract Type getType();
    public boolean isArrayType() {
        return this instanceof ArrayTypeNode;
    }
    
}
