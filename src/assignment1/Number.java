package assignment1;

import java.util.ArrayList;

/**
 * Created by KayLee on 04/03/2018.
 */
public class Number {
    public static ArrayList<String> iterate(){
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i <= 113; i++){
            if(isOdd(i))
                output.add(i + " is odd");
            if(isDivisibleBy5(i))
                output.add("hi five");
            if(isDivisibleBy7(i + (i + 1)))
                output.add("wow");
            if(isPrime(i))
                output.add("prime");
        }

        return output;
    }

    public static boolean isDivisibleBy5(int n){
        return (n % 5 == 0);
    }

    public static boolean isDivisibleBy7(int n){
        return (n % 7 == 0);
    }

    public static boolean isOdd(int n){
        return (n % 2 == 1);
    }

    public static boolean isPrime(int n){
        if(n == 0 || n == 1)
            return false;

        int i = 2;

        while(i * i <= n){
            if(n % i == 0)
                return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(iterate());
    }
}
