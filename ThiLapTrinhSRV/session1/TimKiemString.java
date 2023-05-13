package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimKiemString {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream =new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T= scanner.nextInt();
        for (int tc = 1; tc <=T; tc++) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            int res =0;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i)==s1.charAt(0)){
                    boolean isTrue =true;
                    for (int j = 1; j < s1.length(); j++) {
                        if (s1.charAt(j)!=s2.charAt(i+j)){
                            isTrue=false;
                            break;
                        }
                    }
                    if (isTrue){
                        res++;
                    }
                }
            }
            System.out.println("#" +tc+" "+res);
        }
    }
}
