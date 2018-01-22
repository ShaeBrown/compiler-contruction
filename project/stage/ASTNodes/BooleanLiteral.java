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
public class BooleanLiteral implements Literal{
    boolean lit;
    public BooleanLiteral(boolean lit) {
        this.lit = lit;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
