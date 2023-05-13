package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class AddReversesdNumbers {
    public static int reverseNumbers(int a){
        int sum = 0;
        while (a>0){
            sum=sum*10+a%10;
            a/=10;
        }
        return sum;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a=scanner.nextInt();
            scanner.nextLine();
            int b =scanner.nextInt();
            int c =reverseNumbers(reverseNumbers(a)+reverseNumbers(b));
            System.out.println(c);
        }

    }
}
