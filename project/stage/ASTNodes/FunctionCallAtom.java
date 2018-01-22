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
public class FunctionCallAtom implements Atom {
    Identifier i;
    ExpressionList exprs;
    public FunctionCallAtom(Identifier i, ExpressionList exprList) {
        this.i = i;
        this.exprs = exprList;
    } 
    public void accept(Visitor v) {
        v.visit(this);
    }
}
