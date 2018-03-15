/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import ASTNodes.ArrayTypeNode;
import ASTNodes.CompoundTypeNode;
import ASTNodes.Type;

/**
 *
 * @author shaebrown
 */
public class ComplexType {

    boolean isArray;
    int size;
    Type t;

    public ComplexType(Type t) {
        this.t = t;
        this.isArray = false;
    }

    public ComplexType(Type t, int size) {
        this.t = t;
        this.size = size;
        this.isArray = true;
    }

    public ComplexType(CompoundTypeNode node) {
        if (node.isArrayType()) {
            this.isArray = true;
            this.size = ((ArrayTypeNode) node).size;
        }
        this.t = node.getType();
    }

    public boolean isEqual(ComplexType type) {
        if (t != type.t) {
            return false;
        }
        if (this.isArray != type.isArray) {
            return false;
        } else if (this.isArray && this.isArray) {
            return this.size == type.size;
        }
        return true;
    }

    public boolean isAddType() {
        return !isArray
                && (t == Type.STRING || t == Type.CHAR || t == Type.FLOAT || t == Type.INT);
    }

    public boolean isMultType() {
        return !isArray
                && (t == Type.FLOAT || t == Type.INT);
    }

    public boolean isCompareType() {
        return !isArray && t != Type.VOID;
    }

    public boolean isSubType() {
        return !isArray
                && (t == Type.CHAR || t == Type.FLOAT || t == Type.INT);
    }

    public boolean isEqualsType() {
        return isCompareType();
    }
    
    public String getIRType() {
        String type = getIRTypeAtomic(this.t);
        if (this.isArray) {
            return "A"+ type;
        }
        return type;
    }
    
    public static String getIRTypeAtomic(Type t) {
        switch (t) {
            case STRING:
                return "U";
            case INT:
                return "I";
            case VOID:
                return "V";
            case FLOAT:
                return "F";
            case CHAR:
                return "C";
            case BOOL:
                return "Z";
            default:
                throw new AssertionError(t.name());
            
        }
    }
}
