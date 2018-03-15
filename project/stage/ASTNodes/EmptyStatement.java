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
public class EmptyStatement extends Statement {
    int lineNum;
    int pos;

    public EmptyStatement(int lineNum, int pos) {
        this.lineNum = lineNum;
        this.pos = pos;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return this.lineNum;
    }

    @Override
    public int getPos() {
        return this.pos;
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
    
}
