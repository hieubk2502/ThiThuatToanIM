package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TimDuongDINhanhNhat_ThuatToanDijkstra {
    public static void main(String[] args) throws FileNotFoundException {
        String url ="D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n =scanner.nextInt();
            // nhap thong tin
            int[][] a =new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] =scanner.nextInt();
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            Set<Integer> visited  =new HashSet<>();
            int[] distance = new int[n];// khoang cach tu dinh dau den dinh i
            int[] previous =new int[n];// dinh ngay phia truoc cua i
            int start =0; // vi tri bat dau
            int finish = 4;
            int oo = Integer.MAX_VALUE;
            //  khoi tao khoang cach
            for (int i = 0; i < n; i++) {
                distance[i] =oo;
            }
            distance[start]=0;
            int indexCuoi =0;
            while (visited.size()<n){
                // b2. chon dinh chua duyet
                // va co khoang cach ngan nhat (tu dinh xuat phat) lam dinh dang xet
                int dangXet =0;
                int minDistance = oo;
                for (int i = 0; i < n; i++) {
                    if (visited.contains(i)==false&&distance[i]<minDistance){
                        minDistance =distance[i];
                        dangXet=i;
                    }
                }

                // //b3 tu dinh dang xet, duyet cac dinh ke chua duyet
                // update kc va dinh truoc cua dinh do
                for (int i = 0; i < n; i++) {
                    int findMin = oo;
                    if (visited.contains(i)==false&&a[dangXet][i]!=0) {
                        int newDistance = distance[dangXet]+a[dangXet][i];
                        distance[i]=newDistance;
                        if (distance[i]<findMin){
                            findMin =distance[i];
                            previous[i] =dangXet;
                        }

//                        if (newDistance<distance[i]){
//                            distance[i]= newDistance;
//                            previous[i]=dangXet;
//                        }
                    }
                }
                // b4 danh dau dinh dang xet thanh da duyet
                visited.add(dangXet);
                indexCuoi=dangXet;
            }
            System.out.print("distance ");
            for (int i = 0; i < n; i++) {
                System.out.print(distance[i]+" ");
            }
            System.out.println();
            System.out.print("previous:  ");
            for (int i = 0; i < n; i++) {
                System.out.print(previous[i]+" ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(visited.contains(i)+" ");
            }
            int b =distance[indexCuoi]+a[indexCuoi][0];
            System.out.println();
            System.out.println(a[indexCuoi][0]);
            System.out.println();
            System.out.println("done");
            System.out.println(b);
        }
    }


}
