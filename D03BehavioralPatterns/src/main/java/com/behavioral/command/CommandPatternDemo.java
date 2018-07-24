package com.behavioral.command;

/**
 * 命令模式
 * @Title: CommandPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        String name = "AAA";
        // 创建接收者
        Recevier recevier = new Recevier();
        // 创建具体命令并且指定接收者
        Command addCommand = new AddCommand(recevier, name);

        // 创建请求者
        Invoker invoker = new Invoker();
        // 设置命令
        invoker.setCommand(addCommand);

        invoker.executeCommand();
        invoker.undoCommand();
    }
}
