import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Puzzles {
    // 10 random numbers between 1-20
    public static int[] getTenRolls() {
        int[] randArr = new int[10];
        Random randNum = new Random();
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = randNum.nextInt(20) + 1;
        }
        return randArr;
    }
}

