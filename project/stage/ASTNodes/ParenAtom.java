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
public class ParenAtom extends Atom {
    Expression expr;
    
    public ParenAtom(Expression expr) {
        this.expr = expr;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return expr.getLineNum();
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }
    
}
