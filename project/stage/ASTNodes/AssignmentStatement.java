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
public class AssignmentStatement extends Statement {
    Identifier i;
    Expression expr;
    public AssignmentStatement(Identifier i, Expression e) {
        this.i = i;
        this.expr = e;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return i.getLineNum();
    }
    
}
