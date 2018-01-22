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
public interface Visitor {
    public void visit(AddExpression expr);
    public void visit(AddSubExpression expr);
    public void visit(ArrayAssignmentStatement expr);
    public void visit(ArrayReference expr);
    public void visit(ArrayTypeNode expr);
    public void visit(AssignmentStatement expr);
    public void visit(Block expr);
    public void visit(BooleanLiteral expr);
    public void visit(CharLiteral expr);
    public void visit(CompareExpression expr);
    public void visit(EqualsExpression expr);
    public void visit(EmptyStatement e);
    public void visit(ExpressionList expr);
    public void visit(ExpressionStatement expr);
    public void visit(FloatLiteral expr);
    public void visit(FormalParameter expr);
    public void visit(FormalParameters expr);
    public void visit(Function expr);
    public void visit(FunctionBody expr);
    public void visit(FunctionDecl expr);
    public void visit(Identifier expr);
    public void visit(IfStatement expr);
    public void visit(IntegerLiteral expr);
    public void visit(MultiExpression expr);
    public void visit(FunctionCallAtom expr);
    public void visit(PrintStatement expr);
    public void visit(PrintlnStatement expr);
    public void visit(Program expr);
    public void visit(ReturnStatement expr);
    public void visit(StringLiteral expr);
    public void visit(SubExpression expr);
    public void visit(TypeNode expr);
    public void visit(VariableDeclaration expr);
    public void visit(WhileStatement expr);
    public void visit(ParenAtom expr);
}
