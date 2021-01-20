package chapter19.section11.enumerated;

import static chapter19.section11.enumerated.Outcome.*;

/**
 * Using constant-specific methods
 *
 * @author ZhangHua
 * @date 2021/1/20
 */
public enum RoShamBo3 implements Competitor<RoShamBo3> {
    PAPER {
        @Override
        public Outcome compete(RoShamBo3 competitor) {
            switch (competitor) {
                // To placate the compiler
                default:
                case PAPER:
                    return DRAW;
                case SCISSORS:
                    return LOSE;
                case ROCK:
                    return WIN;
            }
        }
    },
    SCISSORS {
        @Override
        public Outcome compete(RoShamBo3 competitor) {
            switch (competitor) {
                default:
                case PAPER:
                    return WIN;
                case SCISSORS:
                    return DRAW;
                case ROCK:
                    return LOSE;
            }
        }
    },
    ROCK {
        @Override
        public Outcome compete(RoShamBo3 competitor) {
            switch (competitor) {
                default:
                case PAPER:
                    return LOSE;
                case SCISSORS:
                    return WIN;
                case ROCK:
                    return DRAW;
            }
        }
    };

    @Override
    public abstract Outcome compete(RoShamBo3 competitor);

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo3.class, 20);
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
