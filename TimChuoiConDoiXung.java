package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimChuoiConDoiXung {
    public static boolean ktra(String s){
        if (s.length()==1)return true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T=scanner.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String s = scanner.next();
            int res =0;
            for (int i = 0; i < s.length(); i++) {
                for (int j =i +1; j <= s.length(); j++) {
                    String s1 =s.substring(i,j);
                    if (ktra(s1)){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
