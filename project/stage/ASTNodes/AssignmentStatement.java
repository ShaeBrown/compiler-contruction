/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

/**
 *
 * @author shaebrown
 */
public class AssignmentStatement extends Statement {
    public Identifier i;
    public Expression expr;
    public AssignmentStatement(Identifier i, Expression e) {
        this.i = i;
        this.expr = e;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return i.getLineNum();
    }

    @Override
    public int getPos() {
        return i.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
    
}
