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
public class FormalParameter extends ASTNode {
    public CompoundTypeNode ct;
    public Identifier id;
    
    public FormalParameter(CompoundTypeNode ct, Identifier id) {
        this.ct = ct;
        this.id = id;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return ct.getLineNum();
    }

    @Override
    public int getPos() {
        return ct.getPos();
    }
}
