import java.util.Random;
import java.util.ArrayList;

public class PuzzlesTest {
    public static void main(String[] args) {
        // import Puzzles
        Puzzles test = new Puzzles();

        // call methods here
        ArrayList<integer> randomRolls = test.getTenRolls();

        // test here
        System.out.println(randomRolls);
    }
}