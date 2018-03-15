/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import ASTNodes.ASTNode;

/**
 *
 * @author shaebrown
 */
public class TypeCheckException extends RuntimeException {
    public TypeCheckException(ASTNode node, String msg) {
        super("Line " + node.getLineNum() + ":" + node.getPos() + " - " + msg);
    }
}
