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

public class Block extends ASTNode {
    List<Statement> statements;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
