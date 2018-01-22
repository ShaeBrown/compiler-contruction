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
public class MultiExpression implements Expression {
    Atom a;
    MultiExpression expr;

    public MultiExpression(Atom a, MultiExpression expr) {
        this.a = a;
        this.expr = expr;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
