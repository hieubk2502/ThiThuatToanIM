package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1
//5
//1 2 -1 -4 -20
//-8 -3 4 2 1
//3 8 10 1 3
//-4 -1 1 7 6
//1 1 1 1 1
public class HinhChuNhatCoSumLonNhat {
    public static int kadane(int[] a, int n){
        int cnt=0;
        int max_end_here = 0;
        int res =0;
        for (int i = 0; i < n; i++) {
            max_end_here+=a[i];
            res=Math.max(res,max_end_here);
            max_end_here = Math.max(0,max_end_here);
        }
        return res;


    }
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
            int[] tmp =new int[n];
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                // reset
                for (int j = 0; j < n; j++) {
                    tmp[j]=0;
                }
                //
                for (int j = 1; j <n; j++) {
                    for (int k = 0; k < n; k++) {
                        tmp[k]+=a[k][j];
                    }
                    res=Math.max(res,kadane(tmp,n));
                }
            }
            System.out.println(res);
        }
    }
}
