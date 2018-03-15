/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR;

import Visitors.ComplexType;

/**
 *
 * @author shaebrown
 */
public class Temporary extends IR {
    public int num;
    public ComplexType type;

    public Temporary(int num, ComplexType type) {
        this.num = num;
        this.type = type;
    }

    @Override
    public String print() {
        return "T"+ num;
    }
    
}
