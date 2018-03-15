package ASTNodes;

import Visitors.ComplexType;
import Visitors.Visitor;
import Visitors.TypeCheckVisitor;

public class Identifier extends Atom {
    public String value;
    int lineNum;
    int pos;
    
    public Identifier(int lineNum, int pos, String value) {
        this.value = value;
        this.lineNum = lineNum;
        this.pos = pos;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return this.lineNum;
    }

    @Override
    public ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }

    @Override
    public int getPos() {
        return this.pos;
    }
}
