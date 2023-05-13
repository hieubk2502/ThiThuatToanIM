package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class bai1 {
    public static int maxCotMatranHang(int[][] maxRow,int i){
        int index = maxRow[0][i];
            for (int k = 0; k < maxRow.length; k++) {
                if (maxRow[k][i] !=0&&maxRow[k][i]>index){
                    index =maxRow[k][i];
                }
            }
            return index;
    }

    public static int max(int[] a){
        int max_a = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max_a){
                max_a=a[i];
            }
        }
        return max_a;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] a = new int[m][n];
            // nhap
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // max row
            int[][] maxRow = new int[m][n];
            int[][] maxCol = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]==max(a[i])){
                        maxRow[i][j]=a[i][j];
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(maxRow[i][j]+" ");
                }
                System.out.println();
            }

            // max col
            int[] tmp = new int[m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    tmp[j]=a[j][i];
                }
                for (int j = 0; j < m; j++) {
                    if (a[j][i]==max(tmp)){
                        maxCol[j][i]=a[j][i];
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(maxCol[i][j]+" ");
                }
                System.out.println();
            }
            // xet duyet
            int res=0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (maxRow[i][j]  !=0||maxCol[i][j]  !=0){
                        if (max(maxCol[i])==maxRow[i][j]&&maxCotMatranHang(maxRow,j)==maxRow[i][j]&&maxRow[i][j]!=0){
//                            System.out.println("-"+maxRow[i][j]);
                            res++;
                        }
                    }
                }
            }
            System.out.println("#" +t+" "+ res);
        }
    }
}
//5
//
//4 4
//5 6 9 10
//7 2 11 5
//2 1 5 9
//0 2 3 8
//
//6 6
//2 3 8 11 1 4
//9 8 2 10 2 1
//8 5 4 1 8 2
//3 4 5 6 7 8
//22 11 7 2 4 9
//1  10 9 2 3 8
//
//5 6
//14 3 22 28 26 3
//14 29 24 1 13 7
//7 13 14 19 12 0
//26 14 24 27 28 19
//19 5 13 23 16 20
//
//5 6
//21 7 12 12 8 14
//10 2 10 29 20 12
//16 24 29 14 9 5
//21 1 17 9 5 28
//18 7 7 13 21 14
//
//5 6
//13 28 0 20 3 22
//12 5 9 20 22 0
//9 6 16 5 3 4
//8 27 15 16 8 9
//21 29 0 19 13 16
