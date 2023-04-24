package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogoDoiXung_LogoSymmetry {

//    public static  checkSymmetry(int[][] logoMatrix){
//        int n = logoMatrix.length;
//        for (int i = 0; i < n/2; i++) {
//            for (int j = 0; j < n/2; j++) {
//                if (logoMatrix[n-1-j][i] !=logoMatrix[j][i] ||logoMatrix[i][j] !=logoMatrix[i][n-1-j]){
//                    return "NO";
//                }
//            }
//        }
//        return "YES";
//    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[][] logoMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    logoMatrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("#" +t+" ");
            boolean isSymmetry =true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n/2; j++) {
                    int gt1 =logoMatrix[n-1-j][i];
                    int gt2 =logoMatrix[j][i];
                    int gt3 = logoMatrix[i][j];
                    int gt4 =logoMatrix[i][n-1-j];
                    if (logoMatrix[n-1-j][i] !=logoMatrix[j][i] ||logoMatrix[i][j] !=logoMatrix[i][n-1-j]){
                       isSymmetry=false;
                    }
                }
            }
            if (isSymmetry){
                System.out.print("YES");
            }else {
                System.out.print("NO");
            }
            System.out.println();
        }
    }
}

