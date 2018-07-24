package com.behavioral.command;

/**
 * 命令接口
 * @Title: Command
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销方法
     */
    void undo();
}
