package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T =sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n =sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                int curSumR =a[i];
                int curSumL =a[i];
                int bi=0;
                int b1=0;
                int b2=0;
                // an pahi
                for (int j = i+1; j < n; j++) {
                    if (curSumR/2>=a[j]){
                        b1 +=a[j];
                        curSumR +=a[j];
                    } else if (curSumR>a[j]&&curSumR/2<a[j]){
                        b1 +=a[j];
                        curSumR -=a[j];
                    }else if (curSumR<a[j]){
                        b1 +=curSumR;
                        break;
                    }
                }
                // an trai
                if (i==0){
                    b[i]=b1;
                    continue;
                }
                for (int j = i-1; j >=0; j--) {
                    if (curSumL/2>=a[j]){
                        b2 +=a[j];
                        curSumL +=a[j];
                    } else if (curSumL>a[j]&&curSumL/2<a[j]){
                        b2 +=a[j];
                        curSumL -=a[j];
                    }else if (curSumL<a[j]){
                        b2 +=curSumL;
                        break;
                    }
                }
                bi=Math.max(b1,b2);
                b[i]=bi;

            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
