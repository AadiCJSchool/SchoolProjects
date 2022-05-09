import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your sentence: "); String in = sc.nextLine();
        int number = 0, character = 0, space = 0, other = 0;
        for(int i = 0; i<in.length(); i++){
            if ((int)in.charAt(i) >= 48 && (int)in.charAt(i) <= 57) number++;
            else if(((int)in.charAt(i) >= 65 && (int)in.charAt(i) <= 90) || ((int)in.charAt(i) >= 97 &&(int) in.charAt(i) <= 122)) character++;
            else if((int)in.charAt(i) == 32) space++;
            else other++;
        }
        System.out.printf("Letter = %s\nSpace = %s\nNumber = %s\nOther = %s", character, space, number, other);
    }
}
