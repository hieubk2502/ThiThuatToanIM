package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n =sc.nextInt();
            int m = sc.nextInt();
            int soDep[] = new int[10];
            // nhap so dep
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                soDep[a]=1;
            }
            // nhap khoang xet
            int x =sc.nextInt();
            int y =sc.nextInt();
            int kq =0;
            for (int i = x; i <= y; i++) {
                String s =i+"";
                int dem =0;
                for (int j = 0; j < s.length(); j++) {
                    int sChar = s.charAt(j)-'0';
                    if (soDep[sChar]==1){
                        dem++;
                    }
                }
                if (dem>=m){
                    kq++;
                }
            }
            System.out.println("#"+t+" "+kq);
        }
    }


}
