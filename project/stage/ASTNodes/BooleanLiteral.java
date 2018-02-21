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
public class BooleanLiteral extends Literal {
    boolean lit;
    int lineNum;
    
    public BooleanLiteral(int lineNum, boolean lit) {
        this.lit = lit;
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
}
