import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        //Write a Java program to find the longest Palindromic Substring within a string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: "); String in = sc.nextLine();
        String longSub = "";
        int count = 1;
        for(int i = 0; i <= in.length(); i++){
            for(int j = i; j <= in.length(); j++){
                if(palinCheck(in.substring(i,j)) && in.substring(i,j).length() > longSub.length()){
                    longSub = in.substring(i,j);
                }
            }
        }
        System.out.println(longSub);
    }
    public static boolean palinCheck(String input){
        String out = "";
        for(int i =input.length()-1; i >= 0; i--) out+=input.charAt(i);
        if(out.equals(input)) return true;
        else return false;
    }
}
