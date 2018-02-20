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
public class FormalParameter extends ASTNode {
    CompoundTypeNode ct;
    Identifier id;
    public FormalParameter(CompoundTypeNode ct, Identifier id) {
        this.ct = ct;
        this.id = id;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
