package ThiLapTrinhSRV.session1;

import java.util.Scanner;

public class PAIRS1E_CountThePairs {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int T =sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int a= sc.nextInt();
            int k = sc.nextInt();
            int[] arr =new int[a];
            for (int e = 0; e <arr.length ; e++) {
                arr[e]=sc.nextInt();
            }
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                for (int l = j+1; l < arr.length ; l++) {
                    if (arr[j]-arr[l]==k||arr[l]-arr[j]==k){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
