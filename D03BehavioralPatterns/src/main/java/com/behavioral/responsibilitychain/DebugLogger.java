package com.behavioral.responsibilitychain;

/**
 * @Title: DebugLogger
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug::Logger: " + message);
    }
}

