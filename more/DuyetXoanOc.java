package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DuyetXoanOc {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int h1=0,h2 = n-1;
        int c1 =0,c2=n-1;
        while (h1<=h2&&c1<=c2){
            // duyet hang
            for (int i = c1; i <= c2; i++) {
                System.out.print(a[h1][i]+" ");
            }
            h1++;
            // duyet cot
            for (int i = h1; i <=h2 ; i++) {
                System.out.print(a[i][c2]+" ");
            }
            c2--;
            //
            if (h1<=h2){
                for (int i = c2; i >=c1 ; i--) {
                    System.out.print(a[h2][i]+" ");
                }
                h2--;
            }
            if (c1<=c2){
                //
                for (int i = h2; i >=h1 ; i--) {
                    int c =a[c1][i];
                    System.out.print(a[i][c1]+" ");
                }
                c1++;
            }
        }
    }
}
