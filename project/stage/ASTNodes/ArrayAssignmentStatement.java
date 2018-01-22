package ASTNodes;


public class ArrayAssignmentStatement implements Statement {
    ArrayReference arr;
    Expression expr;
    public ArrayAssignmentStatement(ArrayReference arr, Expression expr) {
        this.arr = arr;
        this.expr = expr;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
