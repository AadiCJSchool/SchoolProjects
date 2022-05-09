import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: "); String str = sc.nextLine();
        int vowels = countVowel(str);
        int consts = countConst(str);
        System.out.printf("The number of vowels is %d and the number of consonants is %d", vowels, consts);
    }
    public static int countVowel(String word){
        int vowels = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            int compare = word.charAt(i);
            if(compare == 97 || compare == 101 || compare == 105 || compare == 111 || compare == 117) vowels++;
        }
        return vowels;
    }
    public static int countConst(String word){
        int consts = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            int compare = word.charAt(i);
            if(!(compare == 97 || compare == 101 || compare == 105 || compare == 111 || compare == 117) && compare >= 97 && compare <= 122) consts++;
        }
        return consts;
    }
}
