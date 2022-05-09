import java.util.Scanner;
public class Quals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two strings: "); String in = sc.nextLine(); String in1 = sc.nextLine();
        if(in.equalsIgnoreCase(in1)) System.out.printf("%s is the same is %s, ignoring case", in, in1);
        else System.out.printf("%s is not the same is %s", in, in1);
    }
}
