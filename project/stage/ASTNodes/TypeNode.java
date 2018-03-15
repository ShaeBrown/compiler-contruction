/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public class TypeNode extends CompoundTypeNode {
    public Type t;
    int lineNum;
    int pos;
    public TypeNode(int lineNum, int pos, Type t) {
        this.t = t;
        this.lineNum = lineNum;
        this.pos = pos;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return lineNum;
    }

    @Override
    public Type getType() {
        return t;
    }

    @Override
    public int getPos() {
        return this.pos;
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
