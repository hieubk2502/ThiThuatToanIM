package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai13 {
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


//            System.out.println("#"+t+" "+kq);
        }
    }
}
