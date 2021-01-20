package chapter19.section11.enumerated;

import static chapter19.section11.enumerated.Outcome.*;


/**
 * Switching one enum on another
 *
 * @author ZhangHua
 * @date 2021/1/20
 */
public enum RoShamBo2 implements Competitor<RoShamBo2> {
    PAPER(DRAW, LOSE, WIN),
    SCISSORS(WIN, DRAW, LOSE),
    ROCK(LOSE, WIN, DRAW);

    private Outcome paper, scissors, rock;

    private RoShamBo2(Outcome paper, Outcome scissors, Outcome rock) {
        this.paper = paper;
        this.scissors = scissors;
        this.rock = rock;
    }

    @Override
    public Outcome compete(RoShamBo2 competitor) {
        switch (competitor) {
            default:
            case PAPER:
                return paper;
            case SCISSORS:
                return scissors;
            case ROCK:
                return rock;
        }
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo2.class, 20);
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
