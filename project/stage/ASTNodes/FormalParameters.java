/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaebrown
 */
public class FormalParameters extends ASTNode {
    public List<FormalParameter> params;

    public FormalParameters() {
        params = new ArrayList<>();
    }
    
    public void addParam(FormalParameter p) {
        this.params.add(p);
    }
    
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public IR accept(IRVisitor v) {
        return v.visit(this);
    }

    @Override
    public int getLineNum() {
        if (!params.isEmpty()) {
            return params.get(0).getLineNum();
        }
        return 0;
    }

    @Override
    public int getPos() {
        if (!params.isEmpty()) {
            return params.get(0).getPos();
        }
        return 0;
    }
    
}
