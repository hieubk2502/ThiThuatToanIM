package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SumOfProduct {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int a=scanner.nextInt();
            int sum =0;
            for (int j = 1; j <= a; j++) {
                sum+=j*(a/j);
            }
            System.out.println(sum);
        }
    }
}
