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
public class CompareExpression extends Expression {
    AddSubExpression addSubExpr;
    CompareExpression primeExpr;

    public CompareExpression(AddSubExpression addSubExpr, CompareExpression primeExpr) {
        this.addSubExpr = addSubExpr;
        this.primeExpr = primeExpr;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return addSubExpr.getLineNum();
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
       return visitor.eval(this);
    }
}
