package ASTNodes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Function> functionList;
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
    public void accept (Visitor v) {
        v.visit(this);
    }
}