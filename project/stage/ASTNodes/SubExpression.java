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
public class SubExpression extends AddSubExpression {

    public SubExpression(MultiExpression multiExpr, AddSubExpression primeExpr) {
        super(multiExpr, primeExpr);
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public ComplexType type(TypeCheckVisitor visitor) {
        return visitor.eval(this);
    }

    @Override
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }
}
