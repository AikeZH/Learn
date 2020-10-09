package chapter12.section4.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Logging caught exceptions
 * @author zhanghua
 * @date 2020/10/9
 */
public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
    /* Output:
    十月 09, 2020 5:24:14 下午 chapter12.section4.exceptions.LoggingExceptions2 logException
    严重: java.lang.NullPointerException
        at chapter12.section4.exceptions.LoggingExceptions2.main(LoggingExceptions2.java:23)
     */
}
