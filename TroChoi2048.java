package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TroChoi2048 {
    public static int[] dequy(int[] ab){
        int index=0;
        int[] b = new int[ab.length];
        // lay mang moi luu index
        for (int j = ab.length-1; j >=0; j--) {
            if (j<0){
                break;
            }
            if (j==0){
                b[index]=ab[j];
                j--;
                index++;
                break;
            }
            if (ab[j]!=ab[j-1]){
                b[index]=ab[j];
                index++;
            }else if (ab[j]==ab[j-1]){
                b[index]=2*ab[j];
                j--;
                index++;
            }
        }
        int[] c = new int[index];
        for (int i = 0; i < index; i++) {
            c[i] = b[index-i-1];
        }
        boolean isTrue =true;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    isTrue=false;
                    break;
                }
            }
            if (isTrue==false){
                break;
            }
        }
        if (isTrue==false){
           c=dequy(c);
        }
        return c;
    }
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
                arr[j] =scanner.nextInt();
            }
            int[] b =dequy(arr);
            int max = 0;
            for (int i = 0; i < b.length; i++) {
                if (max<b[i]){
                    max=b[i];
                }
            }
            System.out.println("#"+t+" "+max);
        }
    }
}
