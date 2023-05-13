package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class Compression {
    public static int compressNumber(int a){
        int sum=0;
        while (a>0){
            sum+= a%10;
            a/=10;
        }
        if (sum>9){
             return compressNumber(sum);
        }
    return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int a = scanner.nextInt();
            int cn=0;
            if (a>0){
                cn=compressNumber(a);
            }
            System.out.println("#"+i+" "+cn);
        }

    }

}
