package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static boolean check(String s1){
        for (int i = 0; i < s1.length()/2; i++) {
            if (s1.charAt(i)!= s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T= scanner.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // duyet hang
            for (int i = 0; i < n; i++) {
                System.out.print(i+" : " );
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] +" ");
                }
                System.out.println();
            }
            System.out.println();
            // duyet cot
            for (int i = 0; i < n; i++) {
                System.out.print(i+" : " );
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j][i] +" ");
                }
                System.out.println();
            }
            System.out.println();
            // duyet hang cheo
            System.out.print("cheo xuoi: ");
            for (int i = 0; i < n; i++) {
                    System.out.print(a[i][i]+" ");
            }
            System.out.println();
            System.out.print("cheo nguoc: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][n-1-i]+" ");
            }
            System.out.println();


//            System.out.println("#"+tc+" "+res);
        }
    }
}
