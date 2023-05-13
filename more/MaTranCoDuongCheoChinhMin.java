package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
//1
//4
//9 -2 -8 0
//-6 -2 0 9
//4 -5 6 1
//1 3 4 9
public class MaTranCoDuongCheoChinhMin {


    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int[][] a = new int[n+2][n+2];
            int[][] aCheoXuoi = new int[n+2][n+2];
            int[][] aCheoNguoc = new int[n+2][n+2];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j]= scanner.nextInt();
                }
            }
            for (int i = 0; i < n+2; i++) {
                for (int j = 0; j < n+2; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            // xet ma tran xuoi
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n; j++) {
                    if (i==1||j==1){
                        aCheoXuoi[i][j] =a[i][j];
                    }
                    else {
                        aCheoXuoi[i][j] = aCheoXuoi[i-1][j-1] + a[i][j];
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < n+2; i++) {
                for (int j = 0; j < n+2; j++) {
                    System.out.print(aCheoXuoi[i][j]+" ");
                }
                System.out.println();
            }
            // xet ma tran nguoc
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >=1; j--) {
                    if (i==1||j==n){
                        aCheoNguoc[i][j] =a[i][j];
                    }
                    else {
                        aCheoNguoc[i][j] = aCheoNguoc[i-1][j+1] + a[i][j];
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < n+2; i++) {
                for (int j = 0; j < n+2; j++) {
                    System.out.print(aCheoNguoc[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("done");
            int ans = a[1][1];
            int ic=1;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n ; j++) {
                    for (int k = 1; k <=n-1; k++) {
                        if (i+k>n||j+k>n){
                            break;
                        }
                        int sumCheoXuoi = aCheoXuoi[i+k][j+k]-aCheoXuoi[i-1][j-1];
                        int sumCheoNguoc=aCheoNguoc[i+k][j] - aCheoNguoc[i-1][j+k];
                        int res = sumCheoXuoi-sumCheoNguoc;

                        System.out.print(ic+":"+sumCheoXuoi+"->"+sumCheoNguoc+ "->"+res+"->");
                        ans = Math.max(ans, res);
                        System.out.print(ans);
                        System.out.println();
                        ic++;
                    }
                }
            }
        }
    }
}
