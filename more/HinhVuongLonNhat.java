package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1
//5
//1 1 0 1 0
//0 1 0 0 1
//1 0 1 1 1
//0 0 1 1 1
//1 0 1 1 1
public class HinhVuongLonNhat {
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
            int[][] dp = new int[n][n];
            for (int i = 0; i < n; i++) {
                dp[i][0]= a[i][0];
                dp[0][i]= a[0][i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <n ; j++) {
                    if (a[i][j]==1){
                        int min1 = Math.min(dp[i][j-1],dp[i-1][j-1]);
                        dp[i][j]=Math.min(dp[i-1][j],min1)+1;
                    }
                }
            }
            System.out.println();
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            int res =0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j]>res){
                        res =dp[i][j];
                    }
                }
            }
            System.out.println(res);
        }
    }
}
