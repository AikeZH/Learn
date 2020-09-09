package chapter9.section7.interfaces;

import java.util.Random;

/**
 * Initializing interface fields with non-constant initializers
 *
 * @author zhanghua
 * @date 2020/9/9
 */
public interface RandVals {
    Random RANDOM = new Random(47);
    int RANDOM_INT = RANDOM.nextInt(10);
    long RANDOM_LONG = RANDOM.nextLong() * 10;
    float RANDOM_FLOAT = RANDOM.nextLong() * 10;
    double RANDOM_DOUBLE = RANDOM.nextDouble() * 10;
}
