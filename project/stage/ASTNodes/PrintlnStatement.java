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
public class PrintlnStatement extends Statement {
    Expression expr;
    public PrintlnStatement(Expression e) {
        this.expr = e;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return expr.getLineNum();
    }
}
