package graphDoThi;

import java.util.Stack;

public class _43_200_Number_Of_Islands {
    static boolean[][] daDuyet = new boolean[300][300];
    static int rows;
    static int cols;

    public static boolean IsValid(int i, int j){
        return i>=0&&j>=0&&i<rows&&j<cols;
    }
    public static void DFSS(char[][] a, int i, int j){
        // bai toan co so
        if (IsValid(i,j)==false){
            return;
        }
        if (a[i][j]=='0'||daDuyet[i][j]==true){
            return;
        }
        boolean b = daDuyet[i][j] == true;
        // b2 de quy
        DFSS(a,i,j+1);
        DFSS(a,i,j-1);
        DFSS(a,i+1,j);
        DFSS(a,i-1,j);
    }
    public static int numIslands(char[][] a){
        int count =0;
        int rows= a.length;
        int cols = a[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] =='1'&&daDuyet[i][j]==false){
                    DFSS(a,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
