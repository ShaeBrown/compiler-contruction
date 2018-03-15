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
public class ReturnStatement extends Statement {
    public Expression expr;
    int lineNum;
    int pos;

    public ReturnStatement(Expression e) {
        this.expr = e;
    }
    
    public ReturnStatement(int lineNum, int pos) {
        this.pos = pos;
        this.lineNum = lineNum;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        if (expr != null) {
            return expr.getLineNum();
        }
        return this.lineNum;
    }

    @Override
    public int getPos() {
         if (expr != null) {
            return expr.getPos();
        }
        return this.pos;
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
    
}
