package chapter15.section7.generics;

import java.util.*;

/**
 * @author ZhangHua
 * @date 2020/11/9
 */
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> p = new Particle<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }
    /* Output:
    [E]
    [K, V]
    [Q]
    [POSITION, MOMENTUM]
     */
}

class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}