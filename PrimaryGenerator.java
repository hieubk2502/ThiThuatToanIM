package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimaryGenerator {
    public static boolean isNT(int i){
        if (i<2){
            return false;
        }
        for (int j = 2; j <=Math.sqrt(i) ; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = a; i <= b; i++) {
                if(isNT(i)){
                    System.out.println(i);
                }
            }
            System.out.println();
        }


    }
}
