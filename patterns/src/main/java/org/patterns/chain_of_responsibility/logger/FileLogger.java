package org.patterns.chain_of_responsibility.logger;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File :: Logger :" + message);
    }

}
