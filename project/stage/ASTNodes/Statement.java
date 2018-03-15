package ASTNodes;

import IR.IR;
import Visitors.IRVisitor;
import Visitors.Visitor;

public abstract class Statement extends ASTNode {
    public abstract void accept(Visitor v);
    public abstract IR accept(IRVisitor v);
}
