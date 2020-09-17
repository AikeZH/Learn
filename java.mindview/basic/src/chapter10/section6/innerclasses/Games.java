package chapter10.section6.innerclasses;

/**
 * Using anonymous inner classes with the Game framework
 *
 * @author zhanghua
 * @date 2020/9/16
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
    /* Output:
    Checkers move 0
    Checkers move 1
    Checkers move 2
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
    private Checkers() {

    }

    private int moves = 0;
    private static final int MOVES = 3;
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class Chess implements Game {
    private Chess() {
    }

    private int moves = 0;
    private static final int MOVES = 4;
    public static GameFactory factory = new GameFactory() {

        @Override
        public Game getGame() {
            return new Chess();
        }
    };

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}