package chapter14.section2.typeinfo;

/**
 * @author zhanghua
 * @date 2020/10/23
 */
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new Building();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        // ... or just do this
        h = (House) b;
    }
}
class Building{}
class House extends Building{}