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
public class CharLiteral extends Literal {
    public char c;
    int lineNum;
    int pos;
    public CharLiteral(int lineNum, int pos, char c) {
        this.lineNum = lineNum;
        this.c = c;
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
    public ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }

    @Override
    public int getPos() {
        return this.pos;
    }
}
