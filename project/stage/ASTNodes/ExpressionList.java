/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaebrown
 */
public class ExpressionList extends ASTNode {
    List<Expression> exprList;
    public ExpressionList() {
        exprList = new ArrayList<>();
    }
    public void addExpr(Expression e) {
        this.exprList.add(e);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
