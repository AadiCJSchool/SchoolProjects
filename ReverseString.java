import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: "); String in = sc.nextLine();
        for(int i = in.length()-1; i>=0; i--) System.out.print(in.charAt(i));
    }
}
