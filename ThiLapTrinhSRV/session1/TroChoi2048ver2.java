package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TroChoi2048ver2 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            // nhap
            int N =scanner.nextInt();
            if (N<5||N>1000){
                continue;
            }
            int[] arr =new int[N];
            for (int j = 0; j < N; j++) {
                arr[N-1-j] =scanner.nextInt();
            }
            int flag =0;
            while (N>1&&flag==0){
                flag=1;
                for (int i = 0; i < N-1; i++) {
                    if(arr[i]==arr[i+1]){
                        arr[i]=arr[i]*2;
                        for (int j = i+1; j <N -1; j++) {
                            arr[j]=arr[j+1];
                        }
                        flag=0;
                        N--;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
//            for (int i = 0; i < b.length; i++) {
//                if (max<b[i]){
//                    max=b[i];
//                }
//            }
//            System.out.println("#"+t+" "+max);
        }
    }
}
