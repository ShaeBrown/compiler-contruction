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
public class IfStatement extends Statement{
    public Expression ifExpr;
    public Block thenBlock;
    public Block elseBlock;
    
    public IfStatement(Expression ifExpr, Block thenBlock) {
        this.ifExpr = ifExpr;
        this.thenBlock = thenBlock;
    }
    
    public IfStatement(Expression ifExpr, Block thenBlock, Block elseBlock) {
        this.ifExpr = ifExpr;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return ifExpr.getLineNum();
    }

    @Override
    public int getPos() {
        return ifExpr.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
