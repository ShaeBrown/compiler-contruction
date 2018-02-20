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
public class AddSubExpression extends Expression {
    MultiExpression multiExpr;
    AddSubExpression primeExpr;

    /**
     *
     * @param multiExpr
     * @param primeExpr
     */
    public AddSubExpression(MultiExpression multiExpr, AddSubExpression primeExpr) {
        this.multiExpr = multiExpr;
        this.primeExpr = primeExpr;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
