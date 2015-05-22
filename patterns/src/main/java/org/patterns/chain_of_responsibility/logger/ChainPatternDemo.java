package org.patterns.chain_of_responsibility.logger;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information message");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information message");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information message");
    }
}
