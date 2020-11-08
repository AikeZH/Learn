package chapter15.section4.generics;

import chapter15.section4.generics.watercolors.Watercolors;
import util.Sets;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author ZhangHua
 * @date 2020/11/8
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + Sets.union(set1, set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("difference(set1, subset): " + Sets.difference(set1, subset));
        System.out.println("difference(set2, subset): " + Sets.difference(set2, subset));
        System.out.println("complement(set1,set2): " + Sets.complement(set1, set2));
    }
    /*
    set1: [BRILLIANT_RED, CRIMSON, MAGENTA, ROSE_MADDER, VIOLET, CERULEAN_BLUE_HUE,
    PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN, VIRIDIAN_HUE]
    set2: [CERULEAN_BLUE_HUE, PHTHALO_BLUE, ULTRAMARINE, COBALT_BLUE_HUE, PERMANENT_GREEN,
    VIRIDIAN_HUE, SAP_GREEN, YELLOW_OCHRE, BURNT_SIENNA, RAW_UMBER, BURNT_UMBER]
    union(set1, set2): [BURNT_SIENNA, CRIMSON, VIRIDIAN_HUE, PHTHALO_BLUE, SAP_GREEN,
    ROSE_MADDER, COBALT_BLUE_HUE, RAW_UMBER, YELLOW_OCHRE, BRILLIANT_RED, BURNT_UMBER,
    CERULEAN_BLUE_HUE, MAGENTA, PERMANENT_GREEN, ULTRAMARINE, VIOLET]
    intersection(set1, set2): [VIRIDIAN_HUE, PHTHALO_BLUE, CERULEAN_BLUE_HUE,
    COBALT_BLUE_HUE, PERMANENT_GREEN, ULTRAMARINE]
    difference(set1, subset): [CRIMSON, ROSE_MADDER, MAGENTA, BRILLIANT_RED, VIOLET]
    difference(set2, subset): [BURNT_SIENNA, BURNT_UMBER, SAP_GREEN, RAW_UMBER, YELLOW_OCHRE]
    complement(set1,set2): [BURNT_SIENNA, CRIMSON, SAP_GREEN, ROSE_MADDER, RAW_UMBER,
    YELLOW_OCHRE, BRILLIANT_RED, BURNT_UMBER, MAGENTA, VIOLET]
     */
}
