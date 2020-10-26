package chapter17.sectionx.typeinfo.pets;

/**
 * TODO
 *
 * @author ZhangHua
 * @date 2020/9/23
 */
public class Individual {
    private static int counter = 0;
    private final int id = counter++;
    private String name;

    public Individual() {
    }

    public int getId() {
        return id;
    }

    public Individual(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name == null ? this.getClass().getSimpleName() : name;
    }
}
