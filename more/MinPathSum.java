package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MinPathSum {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] a = new int[row][col];
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] =scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int[][] dp =new int[row][col];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i==0&&j==0){
                    dp[i][j] = a[i][j];
                } else if (j==0) {
                    dp[i][j] = dp[i-1][j]+a[i][j];
                }
                else if (i==0) {
                    dp[i][j] = dp[i][j-1]+a[i][j];
                }
                else {
                    dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j])+a[i][j];
                }
            }

            for (int ri = 0; ri < row; ri++) {
                for (int rj = 0; rj < col; rj++) {
                    System.out.print(dp[ri][rj]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int res = 0;
//        for (int i = 0; i < c; i++) {
//            if (a[r-1][i]>res){
//                res= a[r-1][i];
//            }
//        }
//        System.out.println(res);
    }
}
