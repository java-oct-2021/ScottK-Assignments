import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class PuzzlesTest {
    public static void main(String[] args) {
        // import Puzzles
        Puzzles test = new Puzzles();

        // call methods here
        int[] randomRolls = test.getTenRolls();

        // test here
        System.out.println(randomRolls);
    }
}