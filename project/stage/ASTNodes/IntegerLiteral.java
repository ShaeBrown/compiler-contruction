
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import Visitors.ComplexType;
import Visitors.Visitor;
import Visitors.TypeCheckVisitor;

/**
 *
 * @author shaebrown
 */
public class IntegerLiteral extends Literal {
    public int lit;
    int lineNum;
    int pos;
    public IntegerLiteral(int lineNum, int pos, int lit) {
        this.lit = lit;
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
