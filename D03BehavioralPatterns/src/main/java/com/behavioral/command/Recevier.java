package com.behavioral.command;

/**
 * 命令实际执行者
 * @Title: Recevier
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class Recevier {

    /**
     * 添加
     * @param name
     */
    public void add(String name) {
        System.out.println("添加" + name + "成功");
    }

    /**
     * 删除
     * @param name
     */
    public void delete(String name) {
        System.out.println("删除" + name + "成功");
    }
}
