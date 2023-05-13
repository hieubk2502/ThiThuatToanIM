package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InraDuongBaoMaTran {
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
                if (i==0||i==n-1){
                    System.out.print(a[i][j]+ " ");
                }
                if (i!=0&&i!=n-1){
                    if (j==0||j==n-1){
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
            System.out.println();

        }

    }
}
