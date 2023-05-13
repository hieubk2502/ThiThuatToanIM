package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstDuplicate {
    public static int findFistDuplicate(int[] a){
        int n=a.length;
        int[] ab = new int[100005];
        int res=0;
        for (int i = 0; i < n; i++) {
            ab[a[i]]++;
            if (ab[a[i]]==2){
                res= a[i];
                break;
            }
        }
        if (res==0){
            return -1;
        }
        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String url ="D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream  fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n= sc.nextInt();
            int[] a =new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println("#" +t+" "+findFistDuplicate(a));
        }
    }

}
