package com.behavioral.interpreter;

/**
 * @Title: TerminalExpression
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;

    }
}
