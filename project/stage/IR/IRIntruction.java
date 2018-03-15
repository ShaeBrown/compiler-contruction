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
public class IRIntruction extends IR {
    String intr;

    public IRIntruction(String intr) {
        this.intr = intr;
    }

    @Override
    public String print() {
        return intr;
    }
    
}
