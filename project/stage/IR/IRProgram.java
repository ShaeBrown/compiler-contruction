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
public class IRProgram extends IR {
    String programName;
    private List<IRFunction> funcs = new ArrayList<>();
    private IRFunction curr = null;

    public IRProgram(String programName) {
        this.programName = programName;
    }
    
    public void addFunc(IRFunction func) {
        funcs.add(func);
        curr = func;
    }
    
    public void addTemp(IRTempDecl decl) {
        curr.varDecl.add(decl);
    }
    
    public void addInstruction(IRIntruction instr) {
        curr.intr.add(instr);
    }
    
    @Override
    public String print() {
        String p = "TEMP " + programName;
        for (IR f : this.funcs) {
            p += f.print();
        }
        return p;
    }
}
