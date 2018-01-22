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
public class AddSubExpression implements Expression {
    MultiExpression multiExpr;
    AddSubExpression primeExpr;

    public AddSubExpression(MultiExpression multiExpr, AddSubExpression primeExpr) {
        this.multiExpr = multiExpr;
        this.primeExpr = primeExpr;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
