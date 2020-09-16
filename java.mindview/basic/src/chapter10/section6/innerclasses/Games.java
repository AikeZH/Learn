package chapter10.section6.innerclasses;

/**
 * Using anonymous inner classes with the Game framework
 *
 * @author zhanghua
 * @date 2020/9/16
 */
public class Games {
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