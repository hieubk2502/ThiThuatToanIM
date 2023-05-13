package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
//1
//4
//1 0 0 1
//0 0 1 0
//0 0 1 0
//0 1 1 1
public class DemXemHangNaoCoSo1NhieuHonSo0 {
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
            int res=0;
            int c =0;
            for (int i = 0; i < n; i++) {
                int count =0;
                for (int j = 0; j < n; j++) {
                    if (a[i][j]==1){
                        count++;
                    }
                }
                if (count>c){
                    res=i;
                }
            }
            System.out.println(res);
        }
    }
}
