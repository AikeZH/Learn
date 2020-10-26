package chapter13.section5.strings;

/**
 * @author zhanghua
 * @date 2020/10/19
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch (DatabaseException e) {
            System.out.println(e);
        }
    }
    /* Output:
    chapter13.section5.strings.DatabaseException: (t3, q7) Write failed
     */
}