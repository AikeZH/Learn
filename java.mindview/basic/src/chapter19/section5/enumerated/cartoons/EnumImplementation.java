package chapter19.section5.enumerated.cartoons;

import util.Generator;

import java.util.Random;

/**
 * An enum can implement an interface
 * @author zhanghua
 * @date 2021/1/15
 */
public class EnumImplementation {
    public static <T> void printNext(Generator<T> generator) {
        System.out.print(generator.next()+", ");
    }

    public static void main(String[] args) {
        // Choose any instance
        CartoonCharacter cartoonCharacter = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cartoonCharacter);
        }
    }
    /*
    BOB, PUNCHY, BOB, SPANKY, NUTTY, PUNCHY, SLAPPY, NUTTY, NUTTY, SLAPPY,
     */
}

enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private Random random = new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}