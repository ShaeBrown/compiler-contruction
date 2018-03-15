/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodes;

import IR.IR;
import Visitors.ComplexType;
import Visitors.IRVisitor;
import Visitors.Visitor;
import Visitors.TypeCheckVisitor;
import static jdk.nashorn.internal.parser.TokenKind.IR;

/**
 *
 * @author shaebrown
 */
public abstract class Expression extends ASTNode {
    public abstract void accept(Visitor v);
    public abstract IR accept(IRVisitor v);
    public abstract ComplexType type(TypeCheckVisitor visitor);
}
