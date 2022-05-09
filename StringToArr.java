import java.util.Arrays;
import java.util.Scanner;

public class StringToArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        System.out.println(Arrays.toString(sc.next().toCharArray()));
    }
}
