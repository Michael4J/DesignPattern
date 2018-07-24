package com.behavioral.observer;

/**
 * 观察者模式
 * @Title: ObserverPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        WechatServer wechatServer = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        wechatServer.registerObserver(userZhang);
        wechatServer.registerObserver(userLi);
        wechatServer.registerObserver(userWang);
        // WangWu重复注册
        wechatServer.registerObserver(userWang);
        wechatServer.sendMsssage("消息一：AAA");

        System.out.println("------------------------------");
        // LiSi取消关注
        wechatServer.removeObserver(userLi);
        wechatServer.sendMsssage("消息二：BBB");
    }
}
