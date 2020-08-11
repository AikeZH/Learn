package chapter2;

/**
 * @author zhanghua
 * @date 2020/7/6
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);

        System.out.println("UserName:" + System.getProperty("user.name"));
        System.out.println("Path:" + System.getProperty("java.library.path"));

    }
}
