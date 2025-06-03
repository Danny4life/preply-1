package designPattern.interpreterDesignPattern;

import java.util.Map;

public class Context {

    private final Map<String, Boolean> variables;


    public Context(Map<String, Boolean> variables) {
        this.variables = variables;
    }

    public boolean getValue(String variable){

        return variables.getOrDefault(variable, false);

    }
}
