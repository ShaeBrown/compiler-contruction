/**
 * Created by shaebrown on 20/01/18.
 */
package ASTNodes;

public class TypeNode extends CompoundTypeNode {
    Type t;
    int lineNum;
    public TypeNode(int lineNum, Type t) {
        this.t = t;
        this.lineNum = lineNum;
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
}
