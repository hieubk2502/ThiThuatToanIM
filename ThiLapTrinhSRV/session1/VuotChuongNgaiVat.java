package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VuotChuongNgaiVat {

    public static int findTheSmallerNumberGreaterThanTheNumber(int[][] a, int x, int y){
        Set<Integer>set = new HashSet<>();
        set.add(a[x][y]);
        while (true){
            int startX = Math.max(0, x - 1);
            int endX = Math.min(a.length - 1, x + 1);
            int startY = Math.max(0, y - 1);
            int endY = Math.min(a[0].length-1, y + 1);
            int smallestBiggerNumber= Integer.MAX_VALUE;
            for (int k = startX; k <=endX ; k++) {
                for (int l = startY; l <=endY; l++) {
                    if (a[k][l] <smallestBiggerNumber&& set.contains(a[k][l]) ==false){
                        smallestBiggerNumber=a[k][l];
                    }
                }
            }
            if (smallestBiggerNumber==10000){
                break;
            }
            set.add(smallestBiggerNumber);
        }
        return set.size()-1;
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
                   System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("#" +t+" "+findTheSmallerNumberGreaterThanTheNumber(matrix,dx,dy));
        }
    }
}
