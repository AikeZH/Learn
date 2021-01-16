package chapter19.section4.enumerated;

/**
 * No values() method if you upcast an enum
 *
 * @author zhanghua
 * @date 2021/1/15
 */
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        // Upcast
        Enum e = Search.HITHER;
        // No values() in Enum
        // e.values();
        for (Enum item : e.getClass().getEnumConstants()) {
            System.out.println(item);
        }
    }
    /* Output:
    HITHER
    YON
     */
}

enum Search {
    HITHER, YON
}