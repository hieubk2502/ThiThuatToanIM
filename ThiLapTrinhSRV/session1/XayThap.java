package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class XayThap {

    public static int calculateCost(int[] bricks, int N,int M1, int M2)  {
        // Sắp xếp mảng bricks theo giá trị giảm dần
        Arrays.sort(bricks);
        int[] brickss = new int[bricks.length];
        for (int i = 0; i < bricks.length; i++) {
            brickss[i]=bricks[bricks.length-1-i];
        }

        int cost=0;
        // Tính chi phí xây dựng tháp M1
        int i1=1;
        int i2=1;
        int i=0;
        while (i<N){
            if (i1<=M1&&i2<=M2){
                cost+=i1*brickss[i]+i2*brickss[i+1];
                i1++;
                i2++;
                i+=2;
            } else if (i1<=M1) {
                cost+=i1*brickss[i];
                i1++;
                i++;
            } else if (i2<=M2) {
                cost+=i2*brickss[i];
                i2++;
                i++;
            }
        }
        return cost;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        System.out.println(T);
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int M1 = scanner.nextInt();
            int M2 = scanner.nextInt();
            int[] bricks = new int[N];
            for (int i = 0; i < N; i++) {
                bricks[i] = scanner.nextInt();
            }
            int results = calculateCost(bricks,N,M1,M2);
            System.out.println("#"+t+" "+results);
        }
    }
}