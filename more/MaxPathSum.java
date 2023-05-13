package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1
//4 6
//10 10 2 0 20 4
//1 0 0 30 2 5
//0 10 4 0 2 0
//1 0 2 20 0 4
public class MaxPathSum {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] a = new int[row][col];
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] =scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j==0){
                    a[i][j] +=Math.max(a[i-1][j],a[i-1][j+1]);
                } else if (j==c-1) {
                    a[i][j] +=Math.max(a[i-1][j-1],a[i-1][j]);
                }
                else {
                    int b = Math.max(a[i-1][j],a[i-1][j+1]);
                    a[i][j] +=Math.max(b,a[i-1][j-1]);
                }
            }

            for (int ri = 0; ri < row; ri++) {
                for (int rj = 0; rj < col; rj++) {
                    System.out.print(a[ri][rj]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int res = 0;
        for (int i = 0; i < c; i++) {
            if (a[r-1][i]>res){
               res= a[r-1][i];
            }
        }
        System.out.println(res);
    }
}
