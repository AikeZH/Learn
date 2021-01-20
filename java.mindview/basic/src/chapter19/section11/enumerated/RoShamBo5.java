package chapter19.section11.enumerated;

import java.util.EnumMap;

import static chapter19.section11.enumerated.Outcome.*;

/**
 * Multiple dispatching using an EnumMap of EnumMaps
 *
 * @author ZhangHua
 * @date 2021/1/20
 */
public enum RoShamBo5 implements Competitor<RoShamBo5> {
    PAPER, SCISSORS, ROCK;
    static EnumMap<RoShamBo5, EnumMap<RoShamBo5, Outcome>> table = new EnumMap<>(RoShamBo5.class);

    static {
        for (RoShamBo5 item : RoShamBo5.values()) {
            table.put(item, new EnumMap<>(RoShamBo5.class));
        }
        initRow(PAPER, DRAW, LOSE, WIN);
        initRow(SCISSORS, WIN, DRAW, LOSE);
        initRow(ROCK, LOSE, WIN, DRAW);
    }

    static void initRow(RoShamBo5 it, Outcome paper, Outcome scissors, Outcome rock) {
        EnumMap<RoShamBo5, Outcome> row = RoShamBo5.table.get(it);
        row.put(RoShamBo5.PAPER, paper);
        row.put(RoShamBo5.SCISSORS, scissors);
        row.put(RoShamBo5.ROCK, rock);
    }

    @Override
    public Outcome compete(RoShamBo5 competitor) {
        return table.get(this).get(competitor);
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo5.class, 20);
    }
    /* Output:
    ROCK vs. ROCK: DRAW
    SCISSORS vs. ROCK: LOSE
    SCISSORS vs. ROCK: LOSE
    SCISSORS vs. ROCK: LOSE
    PAPER vs. SCISSORS: LOSE
    PAPER vs. PAPER: DRAW
    PAPER vs. SCISSORS: LOSE
    ROCK vs. SCISSORS: WIN
    SCISSORS vs. SCISSORS: DRAW
    ROCK vs. SCISSORS: WIN
    SCISSORS vs. PAPER: WIN
    SCISSORS vs. PAPER: WIN
    ROCK vs. PAPER: LOSE
    ROCK vs. SCISSORS: WIN
    SCISSORS vs. ROCK: LOSE
    PAPER vs. SCISSORS: LOSE
    SCISSORS vs. PAPER: WIN
    SCISSORS vs. PAPER: WIN
    SCISSORS vs. PAPER: WIN
    SCISSORS vs. PAPER: WIN
     */
}
