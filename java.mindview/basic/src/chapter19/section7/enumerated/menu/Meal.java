package chapter19.section7.enumerated.menu;

/**
 * @author zhanghua
 * @date 2021/1/19
 */
public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Course item : Course.values()) {
                Food food = item.randomSelection();
                System.out.println(food);
            }
            System.out.println("---------");
        }
    }
    /* Output:
    SPRING_ROLLS
    VINDALOO
    FRUIT
    DECAF_COFFEE
    ---------
    SOUP
    VINDALOO
    FRUIT
    TEA
    ---------
    SALAD
    BURRITO
    FRUIT
    TEA
    ---------
    SALAD
    BURRITO
    CREME_CARAMEL
    LATTE
    ---------
    SOUP
    BURRITO
    TIRAMISU
    ESPRESSO
    ---------
     */
}
