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
import ASTNodes.Statement;
import ASTNodes.StringLiteral;
import ASTNodes.SubExpression;
import ASTNodes.TypeNode;
import ASTNodes.VariableDeclaration;
import ASTNodes.WhileStatement;
import IR.IR;
import IR.IRFuncDecl;
import IR.IRFunction;
import IR.IRIntruction;
import IR.IRLiteral;
import IR.IRProgram;
import IR.IRTempDecl;
import IR.IRType;
import IR.Temporary;
import IR.TemporaryFactory;

/**
 *
 * @author shaebrown
 */
public class IRVisitor implements IRVisitorInf {
    IRProgram program;
    
    @Override
    public IR visit(AddExpression expr) {
        Temporary t1 = (Temporary) expr.multiExpr.accept(this);
        if (expr.primeExpr != null) {
            Temporary t2 = (Temporary) expr.primeExpr.accept(this);
            Temporary t3 = TemporaryFactory.getTemp(t2.type);
            program.addInstruction(new IRIntruction(String.format("%s := %s %s+ %s", 
                    t3.print(), t1.print(), t1.type.getIRType(), t2.print())));
            return t3;
        }
        return t1;
    }

    @Override
    public IR visit(ArrayAssignmentStatement expr) {
        Temporary t2 = (Temporary) expr.arr.accept(this);
        Temporary t3 = (Temporary) expr.expr.accept(this);
        Temporary t1 = TemporaryFactory.getTemp(expr.arr.i);
        IRIntruction arr = new IRIntruction(String.format("%s[%s] := %s", 
                t1.print(), t2.print(), t3.print()));
        program.addInstruction(arr);
        return null;
    }

    @Override
    public IR visit(ArrayReference expr) {
        return (Temporary) expr.e.accept(this);
    }

    @Override
    public IR visit(ArrayTypeNode expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(AssignmentStatement expr) {
        Temporary t2 = (Temporary) expr.expr.accept(this);
        Temporary t1 = TemporaryFactory.getTemp(expr.i);
        IRIntruction assStm = new IRIntruction(String.format("%s := %s", t1.print(), t2.print()));
        program.addInstruction(assStm);
        return null;
    }

    @Override
    public IR visit(Block expr) {
        for (Statement s : expr.statements) {
            s.accept(this);
        }
        return null;
    }

    @Override
    public IR visit(BooleanLiteral expr) {
        if (expr.lit) {
            return new IRLiteral("TRUE");
        } else {
            return new IRLiteral("FALSE");
        }
    }

    @Override
    public IR visit(CharLiteral expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(CompareExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(EqualsExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(EmptyStatement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(ExpressionList expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(ExpressionStatement expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(FloatLiteral expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(FormalParameter expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(FormalParameters expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(Function expr) {
        IRFunction func = (IRFunction) expr.funcDecl.accept(this);
        program.addFunc(func);
        expr.funcBody.accept(this);
        return null;
    }

    @Override
    public IR visit(FunctionBody expr) {
        for (VariableDeclaration decl : expr.varDecls) {
            Temporary t = (Temporary) decl.accept(this);
            program.addTemp(new IRTempDecl(t));
            if (decl.ct.isArrayType()) {
                program.addInstruction(new IRIntruction(String.format("%s := NEWARRAY (%s) %d", 
                        t.print(), t.type.getIRType(), t.type.size)));
            }
        }
        for (Statement s : expr.statements) {
            s.accept(this);
        }
        return null;
    }

    @Override
    public IR visit(FunctionDecl expr) {
        IRType params = (IRType) expr.params.accept(this);
        IRType returnType = (IRType) expr.ct.accept(this);
        return new IRFunction(new IRFuncDecl(expr.id, params.print(), returnType.print()));
    }

    @Override
    public IR visit(Identifier expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(IfStatement expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(IntegerLiteral expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(MultiExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(FunctionCallAtom expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(PrintStatement expr) {
        Temporary t = (Temporary) expr.e.accept(this);
        return new IRIntruction(String.format("PRINT%s %s", t.type.getIRType(), t.print()));
    }

    @Override
    public IR visit(PrintlnStatement expr) {
        Temporary t = (Temporary) expr.expr.accept(this);
        return new IRIntruction(String.format("PRINTLN%s %s", t.type.getIRType(), t.print()));
    }

    @Override
    public IR visit(Program expr) {
        this.program  = new IRProgram(expr.programName);
        for (Function f : expr.functionList) {
            f.accept(this);
        }
        return program;
    }

    @Override
    public IR visit(ReturnStatement expr) {
        if (expr.expr != null) {
            Temporary t = (Temporary) expr.expr.accept(this);
            return new IRIntruction("RETURN " + t.print());
        }
        return new IRIntruction("RETURN");
    }

    @Override
    public IR visit(StringLiteral expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(SubExpression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(TypeNode expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(VariableDeclaration expr) {
        Temporary t = TemporaryFactory.getTemp(expr.id.value, new ComplexType(expr.ct));
        IRTempDecl temp = new IRTempDecl(t);
        return temp;
    }

    @Override
    public IR visit(WhileStatement expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IR visit(ParenAtom expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
