package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class SmpDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T =scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a=scanner.nextInt();
            int b =scanner.nextInt();
            int c =scanner.nextInt();
            for (int j = b; j < a; j++) {
                if (j%b==0&&j%c!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
