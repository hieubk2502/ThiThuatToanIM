package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ToAndFro {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int testCase =0;
        while (true){
            int cols =sc.nextInt();
            if (cols<=0){
                break;
            }
            String line =sc.next();
            int rows = line.length()/cols;
            int index=0;
            char[][] a = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i%2==0){
                        a[i][j] =line.charAt(index);
                        index++;
                    }
                    if (i%2!=0){
                        a[i][cols-1-j] =line.charAt(index);
                        index++;
                    }
                }
            }
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(a[j][i]);
                }
            }
            System.out.println();
        }
    }
}
