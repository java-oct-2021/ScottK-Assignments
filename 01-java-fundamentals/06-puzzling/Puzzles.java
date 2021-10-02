import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Puzzles {
    public static int getTenRolls() {
        Random randRoll = new Random();
        ArrayList<integer> randomRolls = new ArrayList<integer>;
        for(int i=0; i<10; i++) {
            randRoll.setSeed(20);
            randomRolls.add("randRoll");
        }
        return randomRolls;
    }
}