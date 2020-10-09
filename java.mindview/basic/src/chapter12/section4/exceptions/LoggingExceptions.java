package chapter12.section4.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * An exception that reports through a Logger
 *
 * @author zhanghua
 * @date 2020/10/9
 */
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
    /* Output:
    十月 09, 2020 5:08:03 下午 chapter12.section4.exceptions.LoggingException <init>
    严重: chapter12.section4.exceptions.LoggingException
        at chapter12.section4.exceptions.LoggingExceptions.main(LoggingExceptions.java:16)

    Caught chapter12.section4.exceptions.LoggingException
    十月 09, 2020 5:08:03 下午 chapter12.section4.exceptions.LoggingException <init>
    严重: chapter12.section4.exceptions.LoggingException
        at chapter12.section4.exceptions.LoggingExceptions.main(LoggingExceptions.java:21)

    Caught chapter12.section4.exceptions.LoggingException
     */
}

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
