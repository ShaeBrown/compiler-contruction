/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import Visitors.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaebrown
 */
public class ExpressionList extends ASTNode {
    public List<Expression> exprList;
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
        if (!exprList.isEmpty()) {
            return exprList.get(0).getLineNum();
        }
        //No expressions = no possible errors
        return 0;
    }

    @Override
    public int getPos() {
        if (!exprList.isEmpty()) {
            return exprList.get(0).getPos();
        }
        //No expressions = no possible errors
        return 0;
    }
}
