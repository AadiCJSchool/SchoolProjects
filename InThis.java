//import java.util.Scanner;
//public class InThis {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input your strings: "); String in1 = sc.nextLine(); String in2 = sc.nextLine();
//        String longer = in1.length()>in2.length()? in1 : in2;
//        String lesser = longer.length() == in1.length()? in2: in1;
//        int matching = 0;
//        for(int i = 0; i < lesser.length(); i++){
//            for(int j = 0; j < longer.length(); j++){
//                if(longer.charAt(j) == lesser.charAt(i)){
//                    System.out.println(longer.charAt(j) + " matches " + lesser.charAt(i));
//                    matching++;
//                    break;
//                }
//            }
//        }
//        if(matching == lesser.length()) System.out.printf("\n%s contains %s.",longer, lesser);
//        else System.out.printf("\n%s does not contain %s.",longer, lesser);
//    }
//}
//this was my first attempt. It failed, that's why there was a second attempt