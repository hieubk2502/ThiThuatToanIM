package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//5
//4 15
//1 2 0 0
//
//5 14
//1 2 0 9 0
//
//5 22
//1 9 8 0 0
//
//5 25
//2 8 4 0 0
//
//5 30
//9 8 7 0 0
public class bai11 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n =sc.nextInt();
            int sum = sc.nextInt();
            int[] visit = new int[10];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a!=0){
                    visit[a] =1;
                }
            }
            // xu ly
            for (int i = 0; i < 10; i++) {
                if (visit[i]==1){
                    sum-=i;
                }
            }
            int y=0;
            int x=0;
            int count=0;
            for (int i = 1; i < 10; i++) {
                if (visit[i] !=1){
                    y=sum-i;
                    if (y>0&&y<10&&visit[y] !=1&&y!=i){
                        count++;
                    }
                }

            }

            System.out.println("#"+t+" "+count);
        }
    }
}
