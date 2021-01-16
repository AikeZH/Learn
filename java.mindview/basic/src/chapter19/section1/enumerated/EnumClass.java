package chapter19.section1.enumerated;

/**
 * Capabilities of the Enum class
 *
 * @author zhanghua
 * @date 2021/1/15
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery item : Shrubbery.values()) {
            System.out.println(item +" ordinal: "+item.ordinal());
            System.out.print(item.compareTo(Shrubbery.CRAWLING)+" ");
            System.out.print(item.equals(Shrubbery.CRAWLING)+" ");
            System.out.println(item == Shrubbery.CRAWLING);
            System.out.println(item.getDeclaringClass());
            System.out.println(item.name());
            System.out.println("-----------------------");
        }
        // Produce an enum value from a string name:
        for (String item : "HANDING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, item);
            System.out.println(shrubbery);
        }
    }
    /* Output:
    GROUND ordinal: 0
    -1 false false
    class chapter19.section1.enumerated.Shrubbery
    GROUND
    -----------------------
    CRAWLING ordinal: 1
    0 true true
    class chapter19.section1.enumerated.Shrubbery
    CRAWLING
    -----------------------
    HANDING ordinal: 2
    1 false false
    class chapter19.section1.enumerated.Shrubbery
    HANDING
    -----------------------
    HANDING
    CRAWLING
    GROUND
     */
}

enum Shrubbery {GROUND, CRAWLING, HANDING}
