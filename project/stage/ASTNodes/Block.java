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

public class Block extends ASTNode {
    public List<Statement> statements;
    public Block() {
        this.statements = new ArrayList<>();
    }
    
    public void addStatement(Statement s) {
        this.statements.add(s);
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        if (!statements.isEmpty()) {
           return statements.get(0).getLineNum();
        } else {
            // No statments = no possible errors
            return 0;
        }
    }

    @Override
    public int getPos() {
        if (!statements.isEmpty()) {
            return statements.get(0).getLineNum();
        } else {
            // No statments = no possible errors
            return 0;
        }
    }
}
