package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QueenKnightPawns {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int testCase=0;
        int[] dxQueen = {-1,-1,0,1,1,1,0,-1};
        int[] dyQueen = {0,1,1,1,0,-1,-1,-1};
        int[] dxKnight = {-2,-2,-1,1,2,2,1,-1};
        int[] dyKnight = {-1,1,2,2,1,-1,-2,-2};
        while (true){
            // nhap m n
            int m = scanner.nextInt();
            int n =scanner.nextInt();
            // dk dung
            if (m==0||n==0){
                break;
            }
            if (m>1000||n>1000){
                break;
            }
            // khoi tao matran va vi tri
            int[][] broadChess = new int[1000][1000];
            int[][] nq=new int[2][100];
            int[][] nk=new int[2][100];
            System.out.println();
            // vi tri hau
            int q = scanner.nextInt();
            if (q>0){
                for (int i = 0; i < q; i++) {
                    nq[0][i] =scanner.nextInt();
                    nq[1][i] = scanner.nextInt();
                    broadChess[nq[0][i]-1][nq[1][i]-1] =1;
                }
            }
            // vi tri ma
            int k = scanner.nextInt();
            if (k>0){
                for (int i = 0; i < k; i++) {
                    nk[0][i] =scanner.nextInt();
                    nk[1][i] = scanner.nextInt();
                    broadChess[nk[0][i]-1][nk[1][i]-1] =2;
                }
            }
            // vi tri tot
            int p = scanner.nextInt();
            if (p>0){
                for (int i = 0; i < p; i++)
                {
                    int xPawn = scanner.nextInt();
                    int yPawn = scanner.nextInt();
                    broadChess[xPawn-1][yPawn-1] = 3;
                }
            }
            // di chuyen quan hau
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < 8; j++) {
                    for (int l = 1;; l++) {
                        int x =nq[0][i]-1 +dxQueen[j]*l;
                        int y =nq[1][i]-1 +dyQueen[j]*l;
                        if (x<0||x>=m||y<0||y>=n){
                            break;
                        }
                        if (broadChess[x][y] ==1||broadChess[x][y] ==2||broadChess[x][y] ==3){
                            break;
                        }
                        if(broadChess[x][y]==0){
                            int a =broadChess[x][y];
                            broadChess[x][y] =-1;
                        }
                    }
                }
            }
            // di chuyen ma
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < 8; j++) {
                    int x =nk[0][i]-1 +dxKnight[j];
                    int y =nk[1][i]-1 +dyKnight[j];
                    if (x>=0&&x<m&&y>=0&&y<n){
                            if (broadChess[x][y]==0){
                                broadChess[x][y] =-1;
                            }
                    }
                }
            }
            // dem
            int dem =0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (broadChess[i][j]==0){
                        dem++;
                    }
                }
            }
            testCase++;
            System.out.println("Board"+" "+testCase+" "+"has"+" "+dem+" "+"safe squares.");
        }
    }
}
