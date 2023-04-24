package ThiLapTrinhSRV.session1;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList =new ArrayList<>();
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > 0 && b > 0) {
                boolean k = true;
                for (int j = a; j <= Math.sqrt(b); j++) {
                    if (j * j <= b) {
                        k = false;
                        arrayList.add(j*j);
                    }
                }
                if (k==false){
                    System.out.print("#"+i);
                    for (int j = 0; j < arrayList.size(); j++) {
                        System.out.print(" "+ arrayList.get(j));
                    }
                }else {
                    System.out.println("NO NUMBER");
                }
            }
            System.out.println();
        }
    }
}

