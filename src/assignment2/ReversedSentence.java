package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by KayLee on 04/03/2018.
 */
public class ReversedSentence {
    public static String change5thPosition(String s){
        char[] string = s.toCharArray();

        for(int i = 1; i < string.length; i++){
            if(i % 5 == 0)
                string[i] = 'z';
        }

        return (new String(string));
    }

    public static String reverseByCharacter(String s){
        char[] string = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            string[i] = s.charAt(s.length() - (i + 1));
        }

        return (new String(string));
    }

    public static String reverseByWord(String s){
        String[] S = s.split("\\s");
        StringBuilder string = new StringBuilder();

        for(int i = S.length - 1; i >= 0; i--){
            string.append(S[i] + " ");
        }

        return string.toString().trim();
    }

    public static String truncateSentence(String s){
        if(s.length() > 80){
            char[] string = s.toCharArray();
            char[] S = new char[80];

            for(int i = 0; i < S.length; i++){
                S[i] = string[i];
            }

            return (new String(S));
        }
        else return s;
    }

    public static String printChar2DArray(char[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(new String(arr[i]));
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = new String[3];
        for(int i = 0; i < 3; i++){
            input[i] = truncateSentence(in.nextLine());
        }

        input[0] = reverseByCharacter(input[0]);
        input[1] = reverseByWord(input[1]);
        input[2] = change5thPosition(input[2]);

        char[][] ans = {input[0].toCharArray(), input[1].toCharArray(), input[2].toCharArray()};
        printChar2DArray(ans);
    }
}
