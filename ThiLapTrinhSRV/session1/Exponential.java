package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c =(int) Math.pow(a,b);
            System.out.print("#"+i +" "+c);
        }
        System.out.println();
    }
}
