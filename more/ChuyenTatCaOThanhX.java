package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuyenTatCaOThanhX {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            // nhap
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // xu ly
            int[] tmp =new int[n];
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                // reset
                for (int j = 0; j < n; j++) {
                    tmp[j]=0;
                }
                //
                for (int j = 1; j <n; j++) {
                    for (int k = 0; k < n; k++) {
                        tmp[k]+=a[k][j];
                    }
                }
            }
        }
    }
}
