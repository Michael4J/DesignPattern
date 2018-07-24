package com.behavioral.responsibilitychain;

/**
 * @Title: ConsoleLogger
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);

    }
}

