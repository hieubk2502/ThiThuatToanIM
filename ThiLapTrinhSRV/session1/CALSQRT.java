package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class CALSQRT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int a=scanner.nextInt();
            int c =(int) Math.floor(Math.sqrt(a));
            System.out.println("#"+i+" "+ c);
        }
    }
}
