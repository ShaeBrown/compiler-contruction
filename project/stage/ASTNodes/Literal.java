/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import Visitors.Visitor;

/**
 *
 * @author shaebrown
 */
public abstract class Literal extends Atom {
    
    @Override
    public abstract void accept(Visitor v);
}
