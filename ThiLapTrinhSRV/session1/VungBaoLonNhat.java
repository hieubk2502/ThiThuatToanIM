package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VungBaoLonNhat {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int rows = sc.nextInt();
            int cols =sc.nextInt();
            int[][] arr = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int maxsum =0;
            for (int i = 0; i <= rows-H; i++) {
                for (int j = 0; j <= cols-W; j++) {
                    int sum =0;
                    for (int k = j; k <j+W; k++) {
                        int a=arr[i][k];
                        if (arr[i][k]%2==0){
                            sum +=arr[i][k];
                        }
                        int b =arr[i+H-1][k];
                        if (arr[i+H-1][k]%2==0&&H>1){
                            sum +=arr[i+H-1][k];
                        }
                    }
                    for (int k = i+1; k <i+H-1; k++) {
                        int c =arr[k][j];
                        if (arr[k][j]%2==0){
                            sum +=arr[k][j];
                        }
                        int d =arr[k][j+W-1];
                        if (arr[k][j+W-1]%2==0&&W>1){
                            sum +=arr[k][j+W-1];
                        }
                    }
                    maxsum=(maxsum>sum)?maxsum:sum;
                }
            }
            System.out.println("#"+t+" "+maxsum);
        }
    }
}
