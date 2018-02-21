
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
public class IntegerLiteral extends Literal {
    int lit;
    int lineNum;
    public IntegerLiteral(int lineNum, int lit) {
        this.lit = lit;
        this.lineNum = lineNum;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return this.lineNum;
    }
    
}
