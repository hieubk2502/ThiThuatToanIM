package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimHangConhieuSoFibonhat {
    public static long[] F = new long[92];
    public static int fibo( int n ){
        F[0]=0;
        F[1]=1;
        F[2] =1;
        if (F[n]!=0){
            return (int) F[n];
        }
         F[n] =fibo(n-1)+fibo(n-2);
        return (int) F[n];
    }
    public static boolean check(int a ){
        for (int i = 2; i < F.length; i++) {
            if (F[i]==a){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] =scanner.nextInt();
            }
        }
        fibo(20);
        // check hang
        int res =0;
//        for (int i = 0; i < n; i++) {
//            int count=0;
//            for (int j = 0; j < n; j++) {
//                if (check(a[i][j])) {
//                    count++;
//                }
//            }
//            if (count>res){
//                res =count;
//            }
//        }
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (check(a[j][i])) {
                    count++;
                }
            }
            if (count>res){
                res =count;
            }
        }

        System.out.println(res);

    }

}
