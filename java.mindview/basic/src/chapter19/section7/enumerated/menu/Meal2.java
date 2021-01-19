package chapter19.section7.enumerated.menu;

import util.Enums;

/**
 * @author zhanghua
 * @date 2021/1/19
 */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAIN_COURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Meal2(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS
        }

        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA
        }
    }

    public Food randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal2 item : Meal2.values()) {
                Food food = item.randomSelection();
                System.out.println(food);
            }
            System.out.println("--------");
        }
    }
    /* Output:
    SPRING_ROLLS
    VINDALOO
    FRUIT
    DECAF_COFFEE
    --------
    SOUP
    VINDALOO
    FRUIT
    TEA
    --------
    SALAD
    BURRITO
    FRUIT
    TEA
    --------
    SALAD
    BURRITO
    CREME_CARAMEL
    LATTE
    --------
    SOUP
    BURRITO
    TIRAMISU
    ESPRESSO
    --------
     */
}
