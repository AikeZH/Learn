package util;

/**
 * Demonstrate standard I/O redirection
 * @author zhanghua
 * @date 2021/1/15
 */
public class OSExecuteDemo {
    public static void main(String[] args) {
//        OSExecute.command("ipconfig");
        OSExecute.command("javap java.mindview/out/util/OSExecuteDemo.class");
    }
}
