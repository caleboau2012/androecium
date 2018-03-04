package assignment1;

import java.util.ArrayList;

/**
 * Created by KayLee on 02/03/2018.
 */
public class HailstoneSequence {
    public static ArrayList<Integer> getHailstoneSequence(int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        int steps = 0;

        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = (3 * n) + 1;
            }

            numbers.add(n);
            steps++;
        }

        numbers.add(steps);

        return numbers;
    }
}
