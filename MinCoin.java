import java.util.Scanner;

public class MinCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int counter = 0;
        for(;tests!=0;tests--){
            counter = 0;
            int money = sc.nextInt();
            if(money%5!=0) System.out.println(-1);
            while(money!=0) {
                if (money - 10 >= 0) money -= 10;
                else if (money - 5 >= 0) money -= 5;
                counter++;
            }
            System.out.println(counter);
        }
    }
}
//3
//50
//15
//8