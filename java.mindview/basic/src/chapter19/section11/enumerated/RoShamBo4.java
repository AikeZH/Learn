package chapter19.section11.enumerated;

/**
 * @author ZhangHua
 * @date 2021/1/20
 */
public enum RoShamBo4 implements Competitor<RoShamBo4> {
    PAPER {
        @Override
        public Outcome compete(RoShamBo4 competitor) {
            return compete(ROCK, competitor);
        }
    },
    SCISSORS {
        @Override
        public Outcome compete(RoShamBo4 competitor) {
            return compete(PAPER, competitor);
        }
    },
    ROCK {
        @Override
        public Outcome compete(RoShamBo4 competitor) {
            return compete(SCISSORS, competitor);
        }
    };

    public Outcome compete(RoShamBo4 competitor, RoShamBo4 opponent) {
        return (opponent == this) ? Outcome.DRAW : ((opponent == competitor) ? Outcome.WIN : Outcome.LOSE);
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo4.class, 20);
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
