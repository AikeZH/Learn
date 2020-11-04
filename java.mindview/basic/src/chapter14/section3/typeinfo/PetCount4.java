package chapter14.section3.typeinfo;

import chapter14.section3.typeinfo.pets.Pet;
import chapter14.section3.typeinfo.pets.Pets;
import util.TypeCounter;

/**
 * @author zhanghua
 * @date 2020/10/27
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
    /*
    Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau
    Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
    {Mouse=2, Pug=3, Manx=7, EgyptianMau=2, Rodent=5, Cat=9, Dog=6,
    Pet=20, Mutt=3, Hamster=1, Cymric=5, Rat=2}
     */
}
