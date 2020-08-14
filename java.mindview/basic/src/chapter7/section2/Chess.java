package chapter7.section2;

/**
 * reusing.Chess.java
 * Inheritance, constructors and arguments
 * @author zhanghua
 * @date 2020/8/13
 */
public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
    /* Output:
    Game constructor
    BoardGame constructor
    Chess constructor
     */
}
class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        //! System.out.println(); //Call to 'super()' must be first statement in constructor body
        super(i);
        System.out.println("BoardGame constructor");
    }
}