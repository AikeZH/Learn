package chapter19.section11.enumerated;

/**
 * Switching one enum on another
 * @author ZhangHua
 * @date 2021/1/20
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
