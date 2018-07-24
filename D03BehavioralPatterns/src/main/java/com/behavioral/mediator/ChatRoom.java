package com.behavioral.mediator;

import java.util.Date;

/**
 * @Title: ChatRoom
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()  + " [" + user.getName() +"] : " + message);
    }
}