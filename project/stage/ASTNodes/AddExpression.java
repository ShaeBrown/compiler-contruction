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
public class AddExpression extends AddSubExpression {

    public AddExpression(MultiExpression multiExpr, AddSubExpression primeExpr) {
        super(multiExpr, primeExpr);
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }
}
