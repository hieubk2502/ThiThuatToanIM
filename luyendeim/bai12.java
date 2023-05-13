package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int soLan = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            // duyet
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]= sc.nextInt();
                }
            }
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println();
//            }

            // dem xem co bn so 1
//            int sum =0;
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (a[i][j]==1){
//                        sum++;
//                    }
//                }
//            }
//            System.out.println(sum);
            //
            int[] distance = new int[n];
            int[] tmp =new int[m];
            for (int i = 0; i < n; i++) {
                int count1 =0;
                int count0 =0;
                for (int j = 0; j < m; j++) {
                    if (a[j][i]==1){
                       count1++;
                     }
                    else {
                        count0++;
                    }
                }
                distance[i]=count1-count0;
            }
//            for (int i = 0; i < distance.length; i++) {
//                System.out.print(distance[i]+" ");
//            }
//            System.out.println();
            int sum =0;
            while (soLan>0){
                for (int i = 0; i < distance.length; i++) {
                    if (distance[i]<0){
                        sum+=(m-distance[i])/2;
                        soLan--;
                    } else if (distance[i]==0) {
                        sum+=m/2;
                        soLan--;
                    }else {
                        sum+=(m+distance[i])/2;
                        soLan--;
                    }
                }
                soLan=-1;
            }
            System.out.println("#"+t+" "+sum);
        }
    }
}
//5
//21
//10 10
//1 0 0 0 0 0 1 0 1 0
//1 0 0 0 1 0 0 0 1 0
//0 1 1 0 0 1 1 1 1 0
//1 0 0 1 1 1 1 0 1 0
//0 1 1 0 0 1 0 0 1 1
//1 1 0 0 0 0 1 1 1 0
//0 0 1 0 0 0 0 1 0 1
//1 1 0 1 1 0 0 0 1 1
//0 0 0 1 0 0 0 1 1 0
//0 0 1 0 0 1 0 0 1 0
//33
//10 10
//0 0 0 1 1 1 0 0 1 1
//0 0 0 0 1 0 1 1 0 0
//1 0 1 1 0 0 1 0 0 0
//0 1 1 1 1 0 0 1 0 0
//1 1 0 1 1 0 1 1 1 1
//1 1 1 1 0 1 0 1 1 1
//0 1 1 0 1 0 0 1 1 0
//1 1 1 0 1 0 0 0 1 1
//1 0 0 1 0 0 1 1 1 0
//1 0 1 1 1 0 0 0 0 1
//25
//10 10
//0 0 1 0 1 0 1 0 1 0
//0 1 1 0 0 1 0 1 0 1
//0 0 1 1 0 0 0 0 1 0
//0 1 1 1 0 1 0 1 1 1
//0 0 0 0 0 1 1 0 0 1
//0 1 1 1 1 0 1 1 0 0
//0 0 1 1 1 1 0 0 0 0
//0 1 0 0 1 0 1 0 1 0
//0 0 1 0 1 0 1 1 0 1
//0 0 1 0 1 1 1 1 0 0
//30
//10 10
//1 1 0 1 1 0 1 0 0 0
//1 1 1 1 1 1 0 1 1 1
//0 1 0 0 0 1 1 1 1 1
//1 1 1 1 0 1 0 0 0 0
//1 1 1 0 0 1 0 1 1 0
//1 1 0 0 0 0 0 0 1 0
//0 0 0 0 0 0 1 1 0 0
//0 0 1 0 0 1 1 1 0 1
//0 1 0 1 0 1 0 1 0 0
//0 1 1 0 0 0 1 0 0 1
//44
//10 10
//0 1 1 0 0 0 1 0 0 0
//1 0 1 1 0 0 0 0 1 1
//0 0 0 0 0 0 1 0 1 0
//1 1 0 1 0 1 1 0 1 0
//1 0 0 1 1 1 1 0 0 0
//1 1 0 1 1 0 1 1 0 1
//0 1 0 0 0 1 1 0 0 0
//1 0 0 1 0 1 1 1 0 1
//0 0 0 1 0 0 1 1 1 0
//1 0 0 0 1 0 1 0 0 0