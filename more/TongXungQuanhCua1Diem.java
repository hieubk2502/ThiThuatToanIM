package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TongXungQuanhCua1Diem {

    public static void main(String[] args) throws FileNotFoundException {
        int[] dxQueen = {-1,-1,0,1,1,1,0,-1};
        int[] dyQueen = {0,1,1,1,0,-1,-1,-1};
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] =scanner.nextInt();
            }
        }
        int[][] b = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int sum = 0;
                    for (int k = 0; k < 8; k++) {
                        int dx = i+dxQueen[k];
                        int dy = j+dyQueen[k];
                        if (dx<0||dx>=n||dy<0||dy>=n){
                            continue;
                        }
                        sum += a[dx][dy];
                    }
                    b[i][j]=sum;
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
