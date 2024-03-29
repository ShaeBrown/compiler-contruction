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
public class EqualsExpression extends Expression {
    public CompareExpression compExpr;
    public EqualsExpression primeExpr;

    public EqualsExpression(CompareExpression compExpr, EqualsExpression primeExpr) {
        this.compExpr = compExpr;
        this.primeExpr = primeExpr;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return compExpr.getLineNum();
    }

    @Override
    public ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }

    @Override
    public int getPos() {
        return compExpr.getPos();
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
