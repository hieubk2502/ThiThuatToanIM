package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThayDoiHangCotNeuBang1 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        for (int t = 1; t <=T ; t++) {
            int n =scanner.nextInt();
            int[][] a = new int[n][n];
            // nhap
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // xu ly
            int[][] b = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                   if (a[i][j]==1){
                       for (int k = 0; k < n; k++) {
                           b[k][j]=1;
                           b[i][k]=1;
                       }
                   }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
