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
public class IRLiteral extends IR {
    String lit;

    public IRLiteral(String lit) {
        this.lit = lit;
    }

    @Override
    public String print() {
        return lit;
    }
    
}
