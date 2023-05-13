package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c =(int) Math.sqrt(b);
            System.out.print("#"+t+" ");
            for (int i = a; i <= c; i++) {
                if (i*i<=b) {
                    System.out.print(i * i+" ");
                }
            }
            System.out.println();
        }
    }
}
