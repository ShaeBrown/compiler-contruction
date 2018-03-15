/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaebrown
 */
public class IRFunction extends IR {
    IRFuncDecl decl;
    List<IRTempDecl> varDecl = new ArrayList<>();
    List<IRIntruction> intr = new ArrayList<>();

    public IRFunction(IRFuncDecl decl) {
        this.decl = decl;
    }

    @Override
    public String print() {
        String p = decl.print();
        p+= "{\n";
        for (IRTempDecl varDec : this.varDecl) {
            p+= varDec.print();
        }
        for (IRIntruction intr : this.intr) {
            p+= intr.print();
        }
        p+= "}\n";
        return p;
    }
}
