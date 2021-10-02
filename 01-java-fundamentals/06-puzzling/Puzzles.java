import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Puzzles {
    // 10 random numbers between 1-20
    public static ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randArr = new ArrayList<Integer>();
        Random randNum = new Random();
        for (int i = 0; i < 10; i++) {
            int x = randNum.nextInt(20);
            randArr.add(x);
        }
            return randArr;
    }

    // get Random Letter 
    public static char getRandLetter() {
        Random randLet = new Random();
        // use single quotes ' ' because it is char... not a string ("Double quotes")
        char c = (char)(randLet.nextInt(26) + 'a');
        return c;
    }

    // Generate a password
    
}

