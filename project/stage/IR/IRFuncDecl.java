/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR;

import ASTNodes.Identifier;

/**
 *
 * @author shaebrown
 */
public class IRFuncDecl extends IR {

    String params;
    String returnType;
    String name;

    public IRFuncDecl(String params, String returnType, String name) {
        this.params = params;
        this.returnType = returnType;
        this.name = name;
    }

    public IRFuncDecl(Identifier id, String print, String print0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String print() {
       return String.format("FUNC %s (%s)%s", name, params, returnType);
    }
    
}
