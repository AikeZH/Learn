package chapter14.section3.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghua
 * @date 2020/10/26
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();
    // Types that you want to be randomly created
    private static String[] typeNames = {
            "chapter14.section3.typeinfo.pets.Mutt",
            "chapter14.section3.typeinfo.pets.Pug",
            "chapter14.section3.typeinfo.pets.EgyptianMau",
            "chapter14.section3.typeinfo.pets.Manx",
            "chapter14.section3.typeinfo.pets.Cymric",
            "chapter14.section3.typeinfo.pets.Rat",
            "chapter14.section3.typeinfo.pets.Mouse",
            "chapter14.section3.typeinfo.pets.Hamster"
    };

    static {
        loader();
    }

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
