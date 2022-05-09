import java.util.Scanner;

public class HappyChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a word and a letter: "); String in = sc.next(); String letter2 = sc.next();
        char letter = letter2.charAt(0);
        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == letter && (in.charAt(i+1) == letter || in.charAt(i-1) == letter))
            {System.out.printf("%s is a happy character", letter); System.exit(0);}
        }
        System.out.printf("%s is an unhappy character", letter);
    }
}
/**
 * The question
 * Write a Java program to check whether a specified character is happy or not. A character
 * is happy when the same character appears to its left or right in a string.
 * Example:
 * Input: goddess, s
 * Output: s is happy character
 * Input: goddess, o
 * Output: o is an unhappy character
 * Input: goddess d
 * Output: d is a happy character
 * Input: fruit, i
 * Output: o is an unhappy character
 */
