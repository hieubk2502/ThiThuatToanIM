package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XoayMaTranMotGoc {
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
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            // xu ly
            int h1=0,h2 = n-1,c1=0,c2=n-1;
            while (h1<h2&&c1<c2){
                int pre=a[h1+1][c1];
                // duyet hang tren
                for (int i = c1; i <=c2 ; i++) {
                    int cur = a[h1][i];
                    a[h1][i] =pre;
                    pre =cur;
                }
                h1++;
                // duyet cot
                for (int i = h1; i <=h2 ; i++) {
                    int cur =a[i][c2];
                    a[i][c2]=pre;
                    pre =cur;
                }
                c2--;
                // duyet hang duoi
                if (h1<=h2) {
                    for (int i = c2; i >= c1; i--) {
                        int cur = a[h2][i];
                        a[h2][i] = pre;
                        pre = cur;
                    }
                    h2--;
                }
                // duyet cot
                if (c1<=c2){
                    for (int i = h2; i >=h1 ; i--) {
                        int cur = a[i][c1];
                        a[i][c1] = pre;
                        pre=cur;
                    }
                    c1++;
                }
                System.out.println();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
