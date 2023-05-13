package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai6 {
    // H T L U
    public static int[] tmp = new int[4];
    public static void xuly(int[][] a, int i, int j){
        int[] tmp = new int[9];
        int ai=0;
        for (int k = i; k < i+3; k++) {
            for (int l = i; l <j+3 ; l++) {
                tmp[ai] = a[k][l];
                ai++;
            }
        }
        int[][] xoay0= new int[3][3];
        int[][] xoay90= new int[3][3];
        int[][] xoay270= new int[3][3];
        int[][] xoay180= new int[3][3];

        // xoay 0
        ai=0;
        for (int k = 0; k <3; k++) {
            for (int l = 0; l < 3; l++) {
                xoay0[k][l]=tmp[ai];
                ai++;
            }
        }
        // xoay 90
        ai=0;
        for (int k = 2; k >=0; k--) {
            for (int l = 0; l < 3; l++) {
                xoay90[l][k]=tmp[ai];
                ai++;
            }
        }
        // xoay 180
        ai=0;
        for (int k = 2; k >=0; k--) {
            for (int l = 2; l >=0; l--) {
                xoay180[k][l]=tmp[ai];
                ai++;
            }
        }
        // xoay 270
        ai=0;
        for (int k = 0; k <3; k++) {
            for (int l = 2; l >=0; l--) {
                xoay270[l][k]=tmp[ai];
                ai++;
            }
        }
        System.out.println();

        int count=0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (xoay0[k][l]==0){
                    count++;
                }
            }
        }
        // H
        if (count==2){
            tmp[0]++;

        } else if (count==4) {
            // T
            if (xoay0[1][0]==0&&xoay0[2][0]==0&&xoay0[1][2]==0&&xoay0[2][2]==0||
                    xoay90[1][0]==0&&xoay90[2][0]==0&&xoay90[1][2]==0&&xoay90[2][2]==0||
                    xoay180[1][0]==0&&xoay180[2][0]==0&&xoay180[1][2]==0&&xoay180[2][2]==0||
                    xoay270[1][0]==0&&xoay270[2][0]==0&&xoay270[1][2]==0&&xoay270[2][2]==0){
                tmp[1]++;
            }
            // L
            else if (xoay0[0][1]==0&&xoay0[0][2]==0&&xoay0[1][1]==0&&xoay0[1][2]==0||
                    xoay90[0][1]==0&&xoay90[0][2]==0&&xoay90[1][1]==0&&xoay90[1][2]==0||
                    xoay270[0][1]==0&&xoay270[0][2]==0&&xoay270[1][1]==0&&xoay270[1][2]==0||
                    xoay180[0][1]==0&&xoay180[0][2]==0&&xoay180[1][1]==0&&xoay180[1][2]==0) {
                tmp[2]++;
            }
            // U
            else if (xoay0[0][1] == 0 && xoay0[0][1] == 0 && xoay0[0][1] == 0 && xoay0[0][1] == 0 ||
                    xoay90[0][1]==0&&xoay90[0][1]==0&&xoay90[0][1]==0&&xoay90[0][1]==0||
                    xoay180[0][1]==0&&xoay180[0][1]==0&&xoay180[0][1]==0&&xoay180[0][1]==0||
                    xoay270[0][1]==0&&xoay270[0][1]==0&&xoay270[0][1]==0&&xoay270[0][1]==0) {
                tmp[3]++;
            }

        }



    }
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
            int count=0;
            for (int i = 0; i <= m-3; i++) {
                for (int j = 0; j <= n-3; j++) {
                    xuly(a,i,j);
                }
                System.out.println();
            }
            for (int i = 0; i < tmp.length; i++) {
                System.out.print(tmp[i]+" ");
            }
        }
    }
}
