import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: "); String in = sc.next();
        ArrayList<Character> out = new ArrayList();
        out.add(null);//to increase the size by 1
        for(int i = 0; i<in.length(); i++){
            for(int j = 0; j<out.size(); j++){
                if(!out.contains(in.charAt(i))){
                    out.add(in.charAt(i));
                }
            }
        }
        for(int i = 1; i < out.size(); i++) if(out.get(i) != null) System.out.print(out.get(i));
    }
}
