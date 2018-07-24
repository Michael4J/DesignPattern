package com.behavioral.mediator;

/**
 * 中介模式
 * @Title: MediatorPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
