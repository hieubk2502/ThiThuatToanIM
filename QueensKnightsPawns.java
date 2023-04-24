package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QueensKnightsPawns {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int[] dxQueen = {-1,-1,0,1,1,1,0,-1};
        int[] dyQueen = {0,1,1,1,0,-1,-1,-1};
        int[] dxKnight = {-2,-2,-1,1,2,2,1,-1};
        int[] dyKnight = {-1,1,2,2,1,-1,-2,-2};
        int testCase =0;
        while (true){
            // nhap mang m*n;
            int m = sc.nextInt();
            int n =sc.nextInt();
            int count=0;

            int whites=0;
            //Values of n = m = 0 indicate end of input.
            if (m==0||n==0){
                break;
            }
            else {
                int[][] broadChess = new int[m+1][n+1];
                // initialize value queen: nq. knight:nk
                int[][] nq=new int[2][100];
                int[][] nk=new int[2][100];

                // input number queen on broadChess
                int q = sc.nextInt();
                for (int i = 0; i < q; i++) {
                    nq[0][i] =sc.nextInt();
                    nq[1][i] = sc.nextInt();
                    broadChess[nq[0][i]][nq[1][i]] =1;
                }
                // input number knight on broadChess
                int k = sc.nextInt();
                for (int i = 0; i < k; i++) {
                    nk[0][i] =sc.nextInt();
                    nk[1][i] = sc.nextInt();
                    broadChess[nk[0][i]][nk[1][i]] =2;
                }
                // input number Pawn on broadChess
                int p = sc.nextInt();
                for (int i = 0; i < p; i++)
                {
                    int xPawn = sc.nextInt();
                    int yPawn = sc.nextInt();
                    broadChess[xPawn][yPawn] = 3;
                }
                // Queen move
                for (int i = 0; i < q; i++) {
                    // 8 direction
                    for (int j = 0; j < 8; j++) {
                        for (int l = 1;; l++) { // (1,4) (2,4)
                            int x =nq[0][i] +dxQueen[j]*l;
                            int y =nq[1][i] +dyQueen[j]*l;
                            if (x<=0||x>m||y<=0||y>n){
                                break;
                            }
                            else {
                                if (broadChess[x][y] ==1||broadChess[x][y] ==2||broadChess[x][y] ==3){
                                    break;
                                }
                                if (broadChess[x][y]==0){
                                    broadChess[x][y] =-1;
                                    count++;
                                }
                            }
                        }
                    }
                }

                // Knight move
                for (int i = 0; i < k; i++) {
                    // 8 direction
                    for (int j = 0; j < 8; j++) {
                        int x =nk[0][i] +dxKnight[j];
                        int y =nk[1][i] +dyKnight[j];
                        if (x>0&&x<=m&&y>0&&y<=n){
                            if (broadChess[x][y] !=1||broadChess[x][y] !=2||broadChess[x][y] !=3){
                                if (broadChess[x][y]==0){
                                    broadChess[x][y] =-1;
                                    count++;
                                }
                            }
                        }
                    }
                }
                whites = m*n -count-k-q-p;
                testCase++;
                System.out.println("Board"+" "+testCase+" "+"has"+" "+whites+" "+"safe squares.");
            }
        }
    }
}
