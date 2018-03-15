/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import ASTNodes.AddExpression;
import ASTNodes.ArrayAssignmentStatement;
import ASTNodes.ArrayReference;
import ASTNodes.ArrayTypeNode;
import ASTNodes.AssignmentStatement;
import ASTNodes.Block;
import ASTNodes.BooleanLiteral;
import ASTNodes.CharLiteral;
import ASTNodes.CompareExpression;
import ASTNodes.EmptyStatement;
import ASTNodes.EqualsExpression;
import ASTNodes.ExpressionList;
import ASTNodes.ExpressionStatement;
import ASTNodes.FloatLiteral;
import ASTNodes.FormalParameter;
import ASTNodes.FormalParameters;
import ASTNodes.Function;
import ASTNodes.FunctionBody;
import ASTNodes.FunctionCallAtom;
import ASTNodes.FunctionDecl;
import ASTNodes.Identifier;
import ASTNodes.IfStatement;
import ASTNodes.IntegerLiteral;
import ASTNodes.MultiExpression;
import ASTNodes.ParenAtom;
import ASTNodes.PrintStatement;
import ASTNodes.PrintlnStatement;
import ASTNodes.Program;
import ASTNodes.ReturnStatement;
import ASTNodes.StringLiteral;
import ASTNodes.SubExpression;
import ASTNodes.TypeNode;
import ASTNodes.VariableDeclaration;
import ASTNodes.WhileStatement;
import IR.IR;

/**
 *
 * @author shaebrown
 */
public interface IRVisitorInf {
    public IR visit(AddExpression expr);
    public IR visit(ArrayAssignmentStatement expr);
    public IR visit(ArrayReference expr);
    public IR visit(ArrayTypeNode expr);
    public IR visit(AssignmentStatement expr);
    public IR visit(Block expr);
    public IR visit(BooleanLiteral expr);
    public IR visit(CharLiteral expr);
    public IR visit(CompareExpression expr);
    public IR visit(EqualsExpression expr);
    public IR visit(EmptyStatement e);
    public IR visit(ExpressionList expr);
    public IR visit(ExpressionStatement expr);
    public IR visit(FloatLiteral expr);
    public IR visit(FormalParameter expr);
    public IR visit(FormalParameters expr);
    public IR visit(Function expr);
    public IR visit(FunctionBody expr);
    public IR visit(FunctionDecl expr);
    public IR visit(Identifier expr);
    public IR visit(IfStatement expr);
    public IR visit(IntegerLiteral expr);
    public IR visit(MultiExpression expr);
    public IR visit(FunctionCallAtom expr);
    public IR visit(PrintStatement expr);
    public IR visit(PrintlnStatement expr);
    public IR visit(Program expr);
    public IR visit(ReturnStatement expr);
    public IR visit(StringLiteral expr);
    public IR visit(SubExpression expr);
    public IR visit(TypeNode expr);
    public IR visit(VariableDeclaration expr);
    public IR visit(WhileStatement expr);
    public IR visit(ParenAtom expr);
}
