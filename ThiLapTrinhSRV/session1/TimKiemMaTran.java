package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimKiemMaTran {
    public static void findMatrixCloestTotheTarget(int[][] a,int n, int targett){
        int res=Integer.MIN_VALUE;
        int rowBegin = 0;
        int colBegin = 0;
        for (int i = 0; i <= a.length-n; i++) {
            for (int j = 0; j <= a[0].length-n; j++) {
                int sum =0;
                for (int k = i; k < i+n; k++) {
                    for (int l = j; l <j+n ; l++) {
                        sum+=a[k][l];
                    }
                }
                if (Math.abs(sum-targett)<Math.abs(res-targett)){
                    res=sum;
                    rowBegin=i;
                    colBegin=j;
                } else if (Math.abs(sum-targett)==Math.abs(res-targett)) {
                    if (sum<res){
                        res=sum;
                        rowBegin=i;
                        colBegin=j;
                    }
                }
            }
        }
        System.out.print(rowBegin+" "+colBegin);
    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            if (n<5||n>100){
                continue;
            }
            int nSmall =sc.nextInt();
            if (nSmall<2||nSmall>n-1){
                continue;
            }
            int target =sc.nextInt();
            int[][] matrix = new int[n][n];
            int[][] a = new int[nSmall][nSmall];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("#" +t+" ");
            findMatrixCloestTotheTarget(matrix,nSmall,target);
            System.out.println();
        }
    }
}
