/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR;

/**
 *
 * @author shaebrown
 */
public class IRTempDecl extends IR {
    public Temporary t;

    public IRTempDecl(Temporary t) {
        this.t = t;
    }

    @Override
    public String print() {
        return String.format("TEMP %d:%s;", t.num, t.type.getIRType());
    }
}
