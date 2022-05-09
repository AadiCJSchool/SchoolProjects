import java.util.Scanner;
public class InThisAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your strings: "); String in1 = sc.nextLine(); String in2 = sc.nextLine();
        String longer = in1.length()>in2.length()? in1 : in2;
        String lesser = longer.length() == in1.length()? in2: in1;
        String compare = ""; boolean match = false;
        for(int i = 0; i < longer.length(); i++){
            if(longer.charAt(i) == lesser.charAt(0)){
                int lesLen = i + lesser.length();
                compare = longer.substring(i, lesLen);
            }
            if(compare.equals(lesser)) match = true;
        }
        if(match) System.out.printf("\n%s contains %s.",longer, lesser);
        else System.out.printf("\n%s does not contain %s.",longer, lesser);
    }
}
//Second attempt. Works :D