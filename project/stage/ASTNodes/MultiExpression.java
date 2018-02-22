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
public class MultiExpression extends Expression {
    Atom a;
    MultiExpression expr;

    public MultiExpression(Atom a, MultiExpression expr) {
        this.a = a;
        this.expr = expr;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return a.getLineNum();
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }
}
