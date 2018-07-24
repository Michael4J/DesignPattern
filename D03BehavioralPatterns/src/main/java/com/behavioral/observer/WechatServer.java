package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号服务 被观察者
 * @Title: WechatServer
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class WechatServer implements Observerable {

    private List<Observer> list = new ArrayList<Observer>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : list) {
            observer.update(message);
        }
    }

    public void sendMsssage (String message) {
        this.message = message;
        System.out.println("微信服务发布消息：" + message);
        // 消息更新，通知所有观察者
        notifyObserver();
    }
}
