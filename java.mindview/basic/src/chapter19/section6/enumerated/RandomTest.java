package chapter19.section6.enumerated;

import util.Enums;

/**
 * @author zhanghua
 * @date 2021/1/18
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
    /* Output:
    STANDING FLYING RUNNING STANDING RUNNING STANDING LYING DODGING SITTING
    RUNNING HOPPING HOPPING HOPPING RUNNING STANDING LYING FALLING RUNNING FLYING LYING
     */
}

enum Activity {
    SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}