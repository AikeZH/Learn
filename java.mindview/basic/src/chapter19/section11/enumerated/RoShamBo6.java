package chapter19.section11.enumerated;

import com.sun.org.apache.regexp.internal.RE;

import static chapter19.section11.enumerated.Outcome.*;

/**
 * Enums using "tables" instead of multiple dispatch
 *
 * @author ZhangHua
 * @date 2021/1/20
 */
public enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = {
            // PAPER
            {DRAW, LOSE, WIN},
            // SCISSORS
            {WIN, DRAW, LOSE},
            // ROCK
            {LOSE, WIN, DRAW},
    };

    @Override
    public Outcome compete(RoShamBo6 competitor) {
        return table[this.ordinal()][competitor.ordinal()];
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class, 20);
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
