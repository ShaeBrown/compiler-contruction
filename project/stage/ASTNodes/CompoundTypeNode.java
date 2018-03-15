/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public abstract class CompoundTypeNode extends ASTNode {
    public abstract void accept(Visitor v);
    public abstract IR accept(IRVisitor v);
    public abstract Type getType();
    public boolean isArrayType() {
        return this instanceof ArrayTypeNode;
    }
    
}
