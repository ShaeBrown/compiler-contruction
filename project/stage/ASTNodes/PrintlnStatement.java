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
public class PrintlnStatement extends Statement {
    public Expression expr;
    public PrintlnStatement(Expression e) {
        this.expr = e;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return expr.getLineNum();
    }

    @Override
    public int getPos() {
        return expr.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
