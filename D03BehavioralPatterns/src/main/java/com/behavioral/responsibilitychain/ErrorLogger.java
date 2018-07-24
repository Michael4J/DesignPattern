package com.behavioral.responsibilitychain;

/**
 * @Title: ErrorLogger
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);

    }
}