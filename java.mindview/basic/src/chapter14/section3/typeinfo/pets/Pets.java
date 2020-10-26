package chapter14.section3.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Facade to produce a default PetCreator
 *
 * @author ZhangHua
 * @date 2020/9/23
 */
public class Pets {
    public static final PetCreator CREATOR = new LiteralPetCreator();
    public static Pet randomPet() {
        return CREATOR.randomPet();
    }

    public static Pet[] createArray(int size) {
        return CREATOR.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return CREATOR.arrayList(size);
    }
}
