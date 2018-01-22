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
public class IfStatement implements Statement{
    Expression ifExpr;
    Block thenBlock;
    Block elseBlock;
    
    public IfStatement(Expression ifExpr, Block thenBlock) {
        this.ifExpr = ifExpr;
        this.thenBlock = thenBlock;
    }
    
    public IfStatement(Expression ifExpr, Block thenBlock, Block elseBlock) {
        this.ifExpr = ifExpr;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
}
