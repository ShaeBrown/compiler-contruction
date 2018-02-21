/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

/**
 *
 * @author shaebrown
 */
public class FloatLiteral extends Literal {
    float f;
    int lineNum;
    public FloatLiteral(int lineNum, float f) {
        this.lineNum = lineNum;
        this.f = f;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return this.lineNum;
    }
}
