package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _4_MuiTen {
    public static boolean xuly(int[][] arr, int x1, int y1, int x2, int y2,int count, int target){
        // dkien dung
        while (true){
            switch (arr[x1][y1]){
                case 1:
                    int index1=arr[x1+1][y1];
                    x1=x1+1;
                    break;
                case 2:
                    index1=arr[x1-1][y1];
                    x1=x1-1;
                    break;
                case 3:
                    index1=arr[x1][y1+1];
                    y1=y1+1;
                    break;
                case 4:
                    index1=arr[x1][y1-1];
                    y1=y1-1;
                    break;
            }
            switch (arr[x2][y2]){
                case 1:
                    int index2=arr[x2+1][y2];
                    x2=x2+2;
                    break;
                case 2:
                    index2=arr[x2-1][y2];
                    x2=x2-1;
                    break;
                case 3:
                    index2=arr[x2][y2+1];
                    y2=y2+1;
                    break;
                case 4:
                    index2=arr[x2][y2-1];
                    y2=y2-1;
                    break;
            }
            count++;
            if (count>=target){
                return true;
            }
            if (x1==x2&&y1==y2){
                return false;
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream =new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T= scanner.nextInt();
        for(int t=1;t<=T;t++){
            int n=scanner.nextInt();
            int target =scanner.nextInt();
            int[][] a =new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] =scanner.nextInt();
                }
            }
            int res =0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n-1; j++) {

                    for (int k = i; k < n; k++) {
                        if (j==n-1){
                            continue;
                        }
                        int l =(k==i)?j+1:0;
                        for (; l < n; l++) {
                            if (xuly(a,i,j,k,l,0,target)){
                                res++;
                            }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
