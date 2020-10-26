package chapter14.section3.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Using class literals
 *
 * @author ZhangHua
 * @date 2020/10/26
 */
public class LiteralPetCreator extends PetCreator {
    // No try block needed
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class
            ));
    // Types for random creation
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
    /*
    [class chapter14.section3.typeinfo.pets.Mutt, class chapter14.section3.typeinfo.pets.Pug,
    class chapter14.section3.typeinfo.pets.EgyptianMau, class chapter14.section3.typeinfo.pets.Manx,
    class chapter14.section3.typeinfo.pets.Cymric, class chapter14.section3.typeinfo.pets.Rat,
    class chapter14.section3.typeinfo.pets.Mouse, class chapter14.section3.typeinfo.pets.Hamster]
     */
}
