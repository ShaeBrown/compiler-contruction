/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

/**
 *
 * @author shaebrown
 */
public class TypeCheckException extends RuntimeException {
    public TypeCheckException(int lineNum, String msg) {
        super("Line " + lineNum + ": " + msg);
    }
}
