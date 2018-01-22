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
public class CharLiteral implements Literal {
    char c;

    public CharLiteral(char c) {
        this.c = c;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
