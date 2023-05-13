package ThiLapTrinhSRV.session1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class QueueRooki {
    public static void main(String[] args) throws FileNotFoundException {
        String url ="D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            if (n<=0||n>1000){
                continue;
            }
            int[] heights = new int[n];
            int[] tallerCounts = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                tallerCounts[i] = scanner.nextInt();
            }
            int[] saveValue = new int[100];
            for (int i = 0; i < n; i++) {
                saveValue[heights[i]] =tallerCounts[i];
            }
            Arrays.sort(heights);
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                int count =saveValue[heights[i]];
                for (int j = 0; j < n; j++) {
                    if (count==0&&result[j]==0){
                        result[j]=heights[i];
                        break;
                    }
                    if (result[j]==0){
                        count--;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
//Arrays.sort(a1);
//            int[] a3 = new int[n];
//            for (int i = 0; i < n; i++) {
//                int count = map.get(a1[i]);
//                for (int j = 0; j < n; j++) {
//                    if (count==0&&a3[j]==0){
//                        a3[j]=a1[i];
//                        break;
//                    }
//                    else if (a3[j]==0){
//                        count--;
//                    }
//                }
//            }
//
//            for (int i = 0; i < n; i++) {
//                System.out.print(a3[i]+" ");
//            }
