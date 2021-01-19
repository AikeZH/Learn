package chapter19.section10.enumerated;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author zhanghua
 * @date 2021/1/19
 */
public enum ConstantSpecificMethod {
    DATE_TIME {
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod item : ConstantSpecificMethod.values()) {
            System.out.println(item + ": " + item.getInfo());
        }
    }
    /* Output:
    DATE_TIME: 2021-1-19
    CLASSPATH: .;D:\java\jdk1.8\lib;D:\java\jdk1.8\lib\tools.jar
    VERSION: 1.8.0_211
     */
}
