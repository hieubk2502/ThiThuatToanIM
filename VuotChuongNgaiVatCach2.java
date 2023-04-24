package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VuotChuongNgaiVatCach2 {
    public static int findTheSmallerNumberGreaterThanTheNumber(int[][] a, int x, int y){
        int[] dxQueen = {-1,-1,-1,0,0,1,1,1};
        int[] dyQueen = {-1,0,1,-1,1,-1,0,1};
        int res=0;
        while (true){
            int maxmin = Integer.MAX_VALUE;
            int valueXDangXet =0,valueYDangXet=0;
            for (int j = 0; j < 8; j++) {// (1,4) (2,4)
                int dx = x +dxQueen[j];
                int dy =y +dyQueen[j];
                if (dx<0||dx>=a.length||dy<0||dy>=a[0].length){
                    continue;
                }
                if (a[dx][dy]>a[x][y]&&a[dx][dy]<maxmin){
                    maxmin=a[dx][dy];
                    valueXDangXet=dx;
                    valueYDangXet=dy;
                }
            }
            if (maxmin==Integer.MAX_VALUE){
                break;
            }
            res++;
            x=valueXDangXet;
            y=valueYDangXet;
        }
        return res;
    }



    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int dx =sc.nextInt();
            int dy = sc.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" +t+" "+findTheSmallerNumberGreaterThanTheNumber(matrix,dx,dy));
        }
    }
}
