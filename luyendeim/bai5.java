package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            // duyet
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            //
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println();
//            }
            //xuly
            int kq=0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]==1){
                        // tam giac 1
                        if (j+1<n&&i-1>=0){
                            if (a[i][j+1]==1&&a[i-1][j]==1){
                                kq++;
                            }
                        }
                        // tam giac 2
                        if (j+1<n&&i+1<m){
                            if (a[i][j+1]==1&&a[i+1][j]==1){
                                kq++;
                            }
                        }
                        // tam giac 3
                        if (j-1>=0&&i+1<m){
                            if (a[i][j-1]==1&&a[i+1][j]==1){
                                kq++;
                            }
                        }
                        // tam giac 4
                         if (i-1>=0&&j-1>=0){
                            if (a[i-1][j]==1&&a[i][j-1]==1){
                                kq++;
                            }
                        }
                    }
                }
            }
            System.out.println("#"+t+" "+kq);
        }
    }
}
//5
//10 10
//0 0 0 0 0 1 0 1 0 0
//1 0 1 0 1 1 1 1 0 0
//0 0 0 0 0 0 0 1 1 0
//0 1 1 0 1 0 0 1 1 1
//1 1 1 1 1 1 0 1 0 1
//1 0 1 1 1 0 0 0 1 1
//1 1 0 1 0 1 0 1 0 0
//0 1 0 1 1 1 1 0 1 1
//1 1 1 0 0 1 1 0 1 1
//1 0 1 1 0 1 1 1 1 1
//
//10 10
//1 1 0 1 1 0 1 0 1 0
//1 1 0 1 0 1 0 1 1 0
//0 0 1 1 1 0 1 0 0 0
//1 1 0 0 0 1 1 1 0 0
//1 1 0 0 0 1 1 0 1 0
//0 0 0 0 1 0 0 1 1 0
//0 0 0 0 1 0 0 0 1 0
//0 0 0 0 0 0 1 1 1 1
//0 1 1 0 0 1 1 1 1 1
//1 1 1 1 1 0 0 0 0 0
//
//10 10
//1 1 1 0 1 1 0 1 1 0
//0 0 1 1 0 1 1 1 0 0
//1 1 1 0 0 1 0 0 1 1
//0 1 1 1 0 0 1 0 1 0
//0 0 1 1 1 0 0 1 1 0
//0 0 0 1 1 1 0 0 0 1
//0 1 1 1 1 0 0 1 1 1
//0 0 0 1 0 0 0 0 1 1
//0 1 1 0 1 1 1 1 1 0
//0 1 0 1 1 0 0 1 1 1
//
//10 10
//0 1 1 1 1 0 1 1 0 0
//1 1 0 0 0 1 0 0 1 1
//1 0 0 0 0 0 1 1 0 0
//1 1 0 0 0 0 1 0 1 0
//1 0 0 0 0 0 1 0 0 0
//0 1 1 1 1 0 1 0 0 1
//0 0 1 1 0 0 1 0 0 1
//1 0 1 1 1 1 1 0 1 1
//0 0 0 0 1 0 0 0 0 0
//1 0 0 1 0 1 0 1 1 1
//
//10 10
//0 0 0 1 0 1 0 1 1 1
//0 0 1 1 0 1 1 1 0 1
//1 1 0 1 1 1 0 1 0 1
//0 0 0 1 0 0 1 1 0 0
//0 0 0 1 1 1 1 0 1 0
//1 0 1 1 1 1 1 1 0 1
//0 0 1 1 1 0 0 1 1 0
//1 1 1 0 1 0 1 0 0 1
//0 1 0 1 1 1 1 0 0 0
//0 1 0 1 0 1 0 0 1 1
