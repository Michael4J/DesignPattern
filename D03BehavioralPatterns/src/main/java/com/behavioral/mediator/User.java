package com.behavioral.mediator;

/**
 * @Title: User
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
