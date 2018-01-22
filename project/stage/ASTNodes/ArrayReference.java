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
public class ArrayReference implements Atom {
    Identifier i;
    Expression e;
    public ArrayReference(Identifier i, Expression e) {
        this.i = i;
        this.e = e;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
