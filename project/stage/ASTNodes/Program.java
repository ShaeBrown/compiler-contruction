package ASTNodes;

import Visitors.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode {
    public List<Function> functionList;
    public String programName = "temp";
    public Program () {
        functionList = new ArrayList<>();
    }
    public void addFunction (Function f) {
        functionList.add(f);
    }
    public Function getFunction (int index) {
        return functionList.get(index);
    }
    public int size () {
        return functionList.size();
    }
    public void accept (Visitor v) throws Exception {
        v.visit(this);
    }

    @Override
    public int getLineNum() {
        return 0;
    }

    @Override
    public int getPos() {
        return 0;
    }
}