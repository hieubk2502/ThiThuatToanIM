package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] tmp = new int[n - 1];
            int[] tmp2 = new int[n - 1];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            // set tmp
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    tmp[i] = -3 * (a[i + 1] - a[i]);
                } else if (a[i] > a[i + 1]) {
                    tmp[i] = (a[i] - a[i + 1]);
                }
            }
            // set tmp2
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] < a[i - 1]) {
                    tmp2[i - 1] = -3 * (a[i - 1] - a[i]);
                } else if (a[i] >= a[i - 1]) {
                    tmp2[i - 1] = a[i] - a[i - 1];
                }
            }
//            for (int i = 0; i < tmp2.length; i++) {
//                System.out.print(tmp2[i]);
//            }
//            System.out.println();
//            xu ly
            boolean is = true;
            int count = 0;
            int xStart = 0;
            int xStop = 0;
            for (int k = 0; k < tmp.length; k++) {
                is=true;
                if (tmp[k] < 0) {
                    continue;
                }
                int xStartCur = k;
                int xStopCur = k;
                int sum = tmp[k];
                int cur = 1;
                for (int i = k + 1; i < tmp.length; i++) {

                    sum += tmp[i];
                    if (sum >= 0) {
                        xStopCur++;
                        cur++;
                    }
                    // if sum==0
                    if (i+1> tmp.length-1){
                        continue;
                    }
                    int valueLaster = sum + tmp[i + 1];
                    if (valueLaster < 0) {
                        // neu gia tri truoc thap hon
                        for (int j = i; j >= 0; j--) {
                            sum += tmp2[j];
                            if (sum >= 0) {
                                xStopCur--;
                            } else {
                                is=false;
                                break;
                            }
                        }
                    }
                    if (is==false){
                        break;
                    }
                }
                if (cur > count) {
                    count = cur;
                    xStart = xStartCur;
                    xStop = xStopCur;
                }
            }
            int tt= xStop-xStart;
            System.out.println("#"+t+" "+tt);
        }
    }
}
