package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DuyetMang2x2 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n= sc.nextInt();
            if (n<3||n>100){
                continue;
            }
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int maxsum =0;
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum =0;
                for (int j = 0; j < n; j++) {
                    sum+=a[i][j];
                }
                if (maxsum<sum){
                    maxsum=sum;
                }

            }
            for (int i = 0; i < n; i++) {
                sum =0;
                for (int j = 0; j < n; j++) {
                    sum+=a[j][i];
                }
                if (maxsum<sum){
                    maxsum=sum;
                }

            }
            sum=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i][i];
            }
            if (maxsum<sum){
                maxsum=sum;
            }
            sum=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i][n-1-i];
            }
            if (maxsum<sum){
                maxsum=sum;
            }
            System.out.println("#"+t+" "+maxsum);
        }

        }
}
