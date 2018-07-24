package com.behavioral.responsibilitychain;

/**
 * 责任链模式
 * @Title: ChainPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug information.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}

