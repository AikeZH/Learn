package chapter12.section8.exceptions;

/**
 * @author zhanghua
 * @date 2020/10/10
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block will silence any thrown exception
            return;
        }
    }
}
