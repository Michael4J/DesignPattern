package com.behavioral.observer;

/**
 * 被观察者接口
 * @Title: Observerable
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public interface Observerable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
