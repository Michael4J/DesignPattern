package com.behavioral.command;

/**
 * 命令请求者
 * @Title: Invoker
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }
}
