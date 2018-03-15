/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import IR.IR;
import Visitors.ComplexType;
import Visitors.IRVisitor;
import Visitors.Visitor;
import Visitors.TypeCheckVisitor;

/**
 *
 * @author shaebrown
 */
public class ArrayReference extends Atom {
    public Identifier i;
    public Expression e;
    public ArrayReference(Identifier i, Expression e) {
        this.i = i;
        this.e = e;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }

    @Override
    public int getLineNum() {
        return i.getLineNum();
    }

    @Override
    public ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }

    @Override
    public int getPos() {
        return i.getPos();
    }
}
