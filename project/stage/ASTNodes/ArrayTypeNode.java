/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public class ArrayTypeNode extends CompoundTypeNode {
    public TypeNode t;
    public int size;
    
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

    @Override
    public int getPos() {
        return t.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
