/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR;

import ASTNodes.Identifier;
import ASTNodes.Type;
import Visitors.ComplexType;
import java.util.HashMap;
import soot.jbco.util.Rand;

/**
 *
 * @author shaebrown
 */
public class TemporaryFactory {
    private static final HashMap<String, Integer> bindings = new HashMap<>();
    private static final HashMap<Integer, ComplexType> types = new HashMap<>();
    private static final int max = 65535;
    
    public static Temporary getTemp(String varName, ComplexType type) {
        if (bindings.containsKey(varName)) {
            return new Temporary(bindings.get(varName), type);
        }
        int rand;
        do {
            rand = Rand.getInt(max);
        } while (types.containsKey(rand));
        types.put(rand, type);
        bindings.put(varName, rand);
        return new Temporary(rand, type);
    }
    
    public static Temporary getTemp(ComplexType type) {
        //TODO
        return new Temporary(1, new ComplexType(Type.BOOL));
    }
    
    public static void resetTemp() {
        bindings.clear();
        types.clear();
    }

    public static Temporary getTemp(Identifier i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
