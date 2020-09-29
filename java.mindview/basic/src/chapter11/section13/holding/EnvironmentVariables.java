package chapter11.section13.holding;

import java.util.Map;

/**
 * @author zhanghua
 * @date 2020/9/29
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    /* (Execute to see output)
     */
}
