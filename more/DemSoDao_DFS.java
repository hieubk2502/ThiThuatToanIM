package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1
//5
//1 1 0 0 0
//0 1 0 0 1
//1 0 0 1 1
//0 0 0 0 0
//1 0 1 1 0
public class DemSoDao_DFS {
    static int[] dxQueen = {-1,-1,0,1,1,1,0,-1};
    static int[] dyQueen = {0,1,1,1,0,-1,-1,-1};
    public static void dfs(int[][]a,int i,int j){
        a[i][j]=0;
        for (int k = 0; k < 8; k++) {
            int x = i+dxQueen[k];
            int y = j+dyQueen[k];
            if (x>=0&&x<a.length&&y>=0&&y<a[0].length&&a[x][y]==1){
                System.out.println("duyet: ("+x+","+y+")");
                dfs(a,x,y);
            }
        }
    }

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
            int count=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]==1){
                        System.out.println("duyet: ("+i+","+j+")");
                        count++;
                        dfs(a,i,j);
                        System.out.println(count);
//                        for (int i1 = 0; i1 < a.length; i1++) {
//                            for (int j1 = 0; j1 < a[0].length; j1++) {
//                                System.out.print(a[i1][j1]+" ");
//                            }
//                            System.out.println();
//                        }
                    }
                }
            }
        }
    }
}
