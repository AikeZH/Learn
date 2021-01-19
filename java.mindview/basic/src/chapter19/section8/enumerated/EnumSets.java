package chapter19.section8.enumerated;

import java.util.EnumSet;
import static chapter19.section8.enumerated.AlarmPoints.*;

/**
 * Operation on EnumSets
 * @author zhanghua
 * @date 2021/1/19
 */
public class EnumSets {
    public static void main(String[] args) {
        // Empty set
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
    /* Output:
    [BATHROOM]
    [STAIR1, STAIR2, BATHROOM, KITCHEN]
    [LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY]
    [LOBBY, BATHROOM, UTILITY]
    [STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
     */
}
