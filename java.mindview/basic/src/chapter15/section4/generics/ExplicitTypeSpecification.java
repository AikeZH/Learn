package chapter15.section4.generics;

import chapter14.section3.typeinfo.pets.Person;
import chapter14.section3.typeinfo.pets.Pet;
import util.New;

import java.util.List;
import java.util.Map;

/**
 * @author ZhangHua
 * @date 2020/11/8
 */
public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
}
