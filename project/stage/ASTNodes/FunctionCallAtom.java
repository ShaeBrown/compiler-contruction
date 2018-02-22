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
public class FunctionCallAtom extends Atom {
    Identifier i;
    ExpressionList exprs;
    public FunctionCallAtom(Identifier i, ExpressionList exprList) {
        this.i = i;
        this.exprs = exprList;
    } 
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return i.getLineNum();
    }

    @Override
    public TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }
}
