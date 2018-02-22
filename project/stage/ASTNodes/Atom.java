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
public abstract class Atom extends ASTNode {    
    public abstract void accept(Visitor v);
    public abstract TypeCheckVisitor.ComplexType type(TypeCheckVisitor visitor);
}
