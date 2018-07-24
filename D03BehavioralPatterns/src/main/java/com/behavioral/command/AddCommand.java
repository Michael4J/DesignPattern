package com.behavioral.command;

/**
 * 增加命令
 * @Title: AddCommand
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class AddCommand implements Command {

    private Recevier recevier;
    private String name;

    public AddCommand(Recevier recevier, String name) {
        this.recevier = recevier;
        this.name = name;
    }

    @Override
    public void execute() {
        recevier.add(name);
    }

    @Override
    public void undo() {
        recevier.delete(name);
    }
}
