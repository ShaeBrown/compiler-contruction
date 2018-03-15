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
import ASTNodes.CompoundTypeNode;
import ASTNodes.EmptyStatement;
import ASTNodes.EqualsExpression;
import ASTNodes.Expression;
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
import ASTNodes.Statement;
import ASTNodes.StringLiteral;
import ASTNodes.SubExpression;
import ASTNodes.Type;
import ASTNodes.TypeNode;
import ASTNodes.VariableDeclaration;
import ASTNodes.WhileStatement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import Visitors.ComplexType;

/**
 *
 * @author shaebrown
 */
public class TypeCheckVisitor implements Visitor {
    ComplexType INT = new ComplexType(Type.INT);
    ComplexType BOOL = new ComplexType(Type.BOOL);
    HashMap<String, CompoundTypeNode> varNames = new HashMap<>();
    HashMap<String, CompoundTypeNode> funcReturns = new HashMap<>();
    HashMap<String, FormalParameters> funcParams = new HashMap<>();
    CompoundTypeNode returnType;
    FormalParameters formalParams;
    HashMap<String, CompoundTypeNode> paramNames = new HashMap<>();

    @Override
    public void visit(AddExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(ArrayAssignmentStatement expr) {
        ComplexType arrayType = expr.arr.type(this);
        ComplexType exprType = expr.expr.type(this);
        if (!exprType.equals(arrayType)) {
            throw new TypeCheckException(expr, "Array type is different then expression");
        }
    }

    @Override
    public void visit(ArrayReference expr) {
        ComplexType index = expr.e.type(this);
        if (!index.isEqual(INT)) {
            throw new TypeCheckException(expr, "Array must be indexed by an integer");
        }
    }

    @Override
    public void visit(ArrayTypeNode expr) {

    }

    @Override
    public void visit(AssignmentStatement expr) {
        ComplexType idType = expr.i.type(this);
        ComplexType exprType = expr.expr.type(this);
        if (!exprType.equals(idType)) {
            throw new TypeCheckException(expr, "Assignment must be of the same type");
        }
    }

    @Override
    public void visit(Block expr) {
        for (Statement s : expr.statements) {
            s.accept(this);
        }
    }

    @Override
    public void visit(BooleanLiteral expr) {

    }

    @Override
    public void visit(CharLiteral expr) {

    }

    @Override
    public void visit(CompareExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(EqualsExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(EmptyStatement e) {

    }

    @Override
    public void visit(ExpressionList expr) {
        for (Expression e : expr.exprList) {
            e.accept(this);
        }
    }

    @Override
    public void visit(ExpressionStatement expr) {
        expr.e.accept(this);
    }

    @Override
    public void visit(FloatLiteral expr) {

    }

    @Override
    public void visit(FormalParameter expr) {
         paramNames.put(expr.id.value, expr.ct);
    }

    @Override
    public void visit(FormalParameters expr) {
        paramNames = new HashMap<>();
        for (FormalParameter param : expr.params) {
            param.accept(this);
        }
    }

    @Override
    public void visit(Function expr) {
        expr.funcDecl.accept(this);
        expr.funcBody.accept(this);
    }

    @Override
    public void visit(FunctionBody expr) {
        for (VariableDeclaration decl : expr.varDecls) {
            decl.accept(this);
        }
        for (Statement s : expr.statements) {
            s.accept(this);
        }
    }

    @Override
    public void visit(FunctionDecl expr) {
        returnType = expr.ct;
        expr.params.accept(this);
    }

    @Override
    public void visit(Identifier expr) {

    }

    @Override
    public void visit(IfStatement expr) {
        ComplexType ifType = expr.ifExpr.type(this);
        if (!ifType.isEqual(BOOL)) {
            throw new TypeCheckException(expr, "If statment expression must be boolean type");
        }
        expr.thenBlock.accept(this);
        if (expr.elseBlock != null) {
            expr.elseBlock.accept(this);
        }
    }

    @Override
    public void visit(IntegerLiteral expr) {

    }

    @Override
    public void visit(MultiExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(FunctionCallAtom expr) {
        if (!funcParams.containsKey(expr.i.value)) {
            throw new TypeCheckException(expr, "Function called before it was defined");
        }
        FormalParameters params = funcParams.get(expr.i.value);
        if (params.params.size() != expr.exprs.exprList.size()) {
            throw new TypeCheckException(expr, "Function called without the correct amount of parameters");
        }
        for (int i = 0; i < params.params.size(); i++) {
            ComplexType p1 = new ComplexType(params.params.get(i).ct);
            ComplexType p2 = expr.exprs.exprList.get(i).type(this);
            if (!p2.equals(p1)) {
                throw new TypeCheckException(expr, "Function called without the correct type of parameters");
            }
        }
    }

    @Override
    public void visit(PrintStatement expr) {
        ComplexType type = expr.e.type(this);
        if (type.isArray || type.t == Type.VOID) {
            throw new TypeCheckException(expr, "Print statement cannot have array or type void");
        }
    }

    @Override
    public void visit(PrintlnStatement expr) {
        ComplexType type = expr.expr.type(this);
        if (type.isArray || type.t == Type.VOID) {
            throw new TypeCheckException(expr, "Println statement cannot have array or type void");
        }
    }

    @Override
    public void visit(Program expr) {
        for (Function f : expr.functionList) {
            funcParams.put(f.funcDecl.id.value, f.funcDecl.params);
            funcReturns.put(f.funcDecl.id.value, f.funcDecl.ct);
        }
        for (Function f : expr.functionList) {
            f.accept(this);
        }
    }

    @Override
    public void visit(ReturnStatement expr) {
        ComplexType funcReturn = new ComplexType(returnType);
        if (expr.expr != null) {
            ComplexType returns = expr.expr.type(this);
            if (!returns.equals(funcReturn)) {
                throw new TypeCheckException(expr, "Return statement does not match function declaration return type");
            }
        } else if (funcReturn.t != Type.VOID)  {
            throw new TypeCheckException(expr, "Return statement does not match function declaration return type");
        }
    }

    @Override
    public void visit(StringLiteral expr) {

    }

    @Override
    public void visit(SubExpression expr) {
        eval(expr);
    }

    @Override
    public void visit(TypeNode expr) {

    }

    @Override
    public void visit(VariableDeclaration expr) {
        varNames.put(expr.id.value, expr.ct);
    }

    @Override
    public void visit(WhileStatement expr) {
        ComplexType whileExpr = expr.expr.type(this);
        if (!whileExpr.isEqual(BOOL)) {
            throw new TypeCheckException(expr, "While statement must have boolean expression");
        }
    }

    @Override
    public void visit(ParenAtom expr) {
        expr.expr.type(this);
    }

    public ComplexType eval(MultiExpression expr) {
        expr.a.accept(this);
        ComplexType atom = expr.a.type(this);
        if (expr.expr != null) {
            ComplexType prime = eval(expr.expr);
            if (!atom.isEqual(prime)) {
                throw new TypeCheckException(expr, "Multiply must be used on two of the same types");
            }
            if (!atom.isMultType() || !prime.isMultType()) {
                throw new TypeCheckException(expr, "Multiply must be used on integer or float types");
            }
            return atom;
        }
        return atom;
    }

    public ComplexType eval(AddExpression expr) {
        ComplexType multi = eval(expr.multiExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = expr.primeExpr.type(this);
            if (!multi.isEqual(prime)) {
                throw new TypeCheckException(expr, "Add must be used on two of the same types");
            }
            if (!multi.isAddType() || !prime.isAddType()) {
                throw new TypeCheckException(expr, "Add must be used on integer, float, char or string types");
            }
            return multi;
        }
        return multi;
    }

    public ComplexType eval(SubExpression expr) {
        ComplexType multi = eval(expr.multiExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = expr.primeExpr.type(this);
            if (!multi.isEqual(prime)) {
                throw new TypeCheckException(expr, "Subtract must be used on two of the same types");
            }
            if (!multi.isSubType() || !prime.isSubType()) {
                throw new TypeCheckException(expr, "Subtract must be used on integer, float, char or string types");
            }
            return multi;
        }
        return multi;
    }

    public ComplexType eval(CompareExpression expr) {
        ComplexType addSub = expr.addSubExpr.type(this);
        if (expr.primeExpr != null) {
            ComplexType prime = eval(expr.primeExpr);
            if (!addSub.isEqual(prime)) {
                throw new TypeCheckException(expr, "Comparison must be used on two of the same types");
            }
            if (!addSub.isCompareType() || !prime.isCompareType()) {
                throw new TypeCheckException(expr, "Comparison must be used on integer, float, char or string types");
            }
            return new ComplexType(Type.BOOL);
        }
        return addSub;
    }

    public ComplexType eval(EqualsExpression expr) {
        ComplexType compSub = eval(expr.compExpr);
        if (expr.primeExpr != null) {
            ComplexType prime = eval(expr.primeExpr);
            if (!compSub.isEqual(prime)) {
                throw new TypeCheckException(expr, "Equals must be used on two of the same types");
            }
            if (!compSub.isEqualsType() || !compSub.isEqualsType()) {
                throw new TypeCheckException(expr, "Equals must be used on non-void type");
            }
            return new ComplexType(Type.BOOL);
        }
        return compSub;
    }

    public ComplexType eval(BooleanLiteral lit) {
        return BOOL;
    }

    public ComplexType eval(IntegerLiteral lit) {
        return INT;
    }

    public ComplexType eval(FloatLiteral lit) {
        return new ComplexType(Type.FLOAT);
    }

    public ComplexType eval(StringLiteral lit) {
        return new ComplexType(Type.STRING);
    }

    public ComplexType eval(CharLiteral lit) {
        return new ComplexType(Type.CHAR);
    }

    public ComplexType eval(ArrayReference arr) {
        return new ComplexType(varNames.get(arr.i.value).getType());
    }

    public ComplexType eval(Identifier i) {
        if (varNames.containsKey(i.value)) {
            return new ComplexType(varNames.get(i.value));
        } else {
            return new ComplexType(paramNames.get(i.value));
        }
    }

    public ComplexType eval(FunctionCallAtom fc) {
        return new ComplexType(funcReturns.get(fc.i.value));
    }

    public ComplexType eval(ParenAtom pa) {
        return pa.expr.type(this);
    }
}
