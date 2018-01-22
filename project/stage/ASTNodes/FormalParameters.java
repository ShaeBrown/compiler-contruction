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
public class FormalParameters {
    List<FormalParameter> params;

    public FormalParameters() {
        params = new ArrayList<>();
    }
    
    public void addParam(FormalParameter p) {
        this.params.add(p);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
