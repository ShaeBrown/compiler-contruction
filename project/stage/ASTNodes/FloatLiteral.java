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
public class FloatLiteral extends Literal {
    public float f;
    int lineNum;
    int pos;
    public FloatLiteral(int lineNum, int pos, float f) {
        this.lineNum = lineNum;
        this.f = f;
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
