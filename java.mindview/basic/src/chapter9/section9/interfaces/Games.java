package chapter9.section9.interfaces;

/**
 * A Game framework using Factory Methods
 *
 * @author zhanghua
 * @date 2020/9/14
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) {
        }
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
    /* Output:
    Checker move 0
    Checker move 1
    Checker move 2
    Chess move 0
    Chess move 1
    Chess move 2
    Chess move 3
     */
}

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checker move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}
