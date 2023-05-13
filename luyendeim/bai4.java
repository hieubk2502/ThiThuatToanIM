package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int nSo =sc.nextInt();
            int nLanXuatHien = sc.nextInt();
            int[] soDep = new int[10];
            for (int i = 0; i < nSo; i++) {
                int a = sc.nextInt();
                soDep[a] =1;
            }
            // nhap khoang cach
            int x = sc.nextInt();
            int y = sc.nextInt();
            int kq=0;
            for (int i = x; i <= y; i++) {
                String s = i+"";
                int dem=0;
                for (int j = 0; j < s.length(); j++) {
                    int soChar = s.charAt(j) -'0';
                    if (soDep[soChar]==1){
                        dem++;
                    }
                }
                if (dem>=nLanXuatHien){
                    kq++;
                }
            }
            System.out.println("#"+t+" "+kq);
        }
    }
}
//4
//2 3
//2 0
//15 900
//
//3 2
//1 2 3
//1 99
//
//3 3
//4 8 9
//123 9921
//
//3 3
//2 7 3
//1199 22132
