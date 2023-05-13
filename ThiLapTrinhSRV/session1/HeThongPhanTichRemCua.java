package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeThongPhanTichRemCua {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            if (a<0||b>100){
                continue;
            }
            int rows = 5*(a)+1;
            int cols =5*(b)+1;
            char[][] arr = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                String line =sc.next();
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
            int[] c = new int[5];
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if (arr[1+5*(i-1)][1+5*(j-1)]=='.'){
                        c[0]++;
                    } else if (arr[2+5*(i-1)][2+5*(j-1)]=='.') {
                        c[1]++;
                    }else if (arr[3+5*(i-1)][3+5*(j-1)]=='.') {
                        c[2]++;
                    }else if (arr[4+5*(i-1)][4+5*(j-1)]=='.') {
                        c[3]++;
                    }else {
                        c[4]++;
                    }
                }
            }
            System.out.print("#"+ t+" ");
            for (int i = 0; i < 5; i++) {
                System.out.print(c[i]+" ");
            }
            System.out.println();
        }
    }
}
