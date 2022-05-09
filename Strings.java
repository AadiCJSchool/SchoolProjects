import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two strings to compare: "); String in = sc.next(), in1 = sc.next();
        System.out.println(equals(in, in1));
    }
    public static boolean equals(String one, String two){
        int len1 = one.length(), match = 0;
        if(len1 == two.length()){
            for(int i = 0; i < len1; i++){
                if((int) one.charAt(i) == (int) two.charAt(i)) match++;
            }
        }else return(false);
        if(match == len1) return(true);
        return false; //non-functional, simply to compile.
    }
}
