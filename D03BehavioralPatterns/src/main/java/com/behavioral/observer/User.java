package com.behavioral.observer;

/**
 * @Title: User
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(name + "收到推送消息：" + message);
    }
}
