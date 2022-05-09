import java.util.ArrayList;
import java.util.Scanner;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: "); String in = sc.nextLine();
        char[] v = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        ArrayList vowels = new ArrayList();
        for(int i = 0; i < v.length; i++) vowels.add(v[i]);
        ArrayList<Character> usedVowels = new ArrayList();
        int counter = 1;
        in = in.toLowerCase();
        for(int i = 0; i < in.length(); i++) {
            if (vowels.contains(in.charAt(i)) && !usedVowels.contains(in.charAt(i))){
                usedVowels.add(in.charAt(i));
                counter++;
            }
        }
        System.out.printf("%s the number of vowels. %s is the number of unique vowels.", counter,usedVowels.size());
    }
}
