package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuanMaDuocChon {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int[] dxk = {-2,-2,-1,1,2,2,1,-1};
        int[] dyk = {-1,1,2,2,1,-1,-2,-2};
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int p= sc.nextInt();
            int pn =sc.nextInt();
            int[][] boardChess = new int[1000][1000];
            int[][] nk=new int[2][999000];
            // set knight
            for (int i = 0; i < k; i++) {
                nk[0][i] =sc.nextInt();
                nk[1][i] = sc.nextInt();
                boardChess[nk[0][i]][nk[1][i]] =1;
            }
            // set pawn can eat
            for (int i = 0; i < p; i++)
            {
                int xp = sc.nextInt();
                int yp = sc.nextInt();
                boardChess[xp][yp] = 2;
            }
            // set pawn can't eat
            for (int i = 0; i < pn; i++)
            {
                int xpn = sc.nextInt();
                int ypn = sc.nextInt();
                boardChess[xpn][ypn] = -1;
            }
            int res =0;
            int tempX =0;
            int tempY =0;
            for (int i = 0; i < k; i++) {
                int xK = nk[0][i];
                int yK = nk[1][i];
                int count =0;
                for (int j = 0; j < 8; j++) {
                    int nx = xK+dxk[j];
                    int ny = yK+dyk[j];
                    if (nx<0||nx>=n||ny<0||ny>=n){
                        continue;
                    }
                    if (boardChess[nx][ny]>0){
                        count++;
                    }
                }
                if (count>res){
                    res=count;
                    tempX=xK;
                    tempY=yK;
                }
            }
            System.out.println("#"+t+" "+tempX+" "+tempY+" "+res);
        }
    }
}
