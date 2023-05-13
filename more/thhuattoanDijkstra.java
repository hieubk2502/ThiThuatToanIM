package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class thhuattoanDijkstra {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // buoc 1 khoi tao
            // Khoi tao khoang cach
            Set<Integer> visited = new HashSet<>();
            int[] distance = new int[n];
            int[] previous = new int[n];

            int start = 0;
            int finish = 3;
            int infinity = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                distance[i] = infinity;
            }
            distance[start] = 0;
            // Buoc 2: chon dinh chua duoc duyet
            // va co khoang cach nho nhat tu dinh xuat phat den dinh dang xet
            while (visited.size() < n) {
                int dangxet = 0;
                int minDist = infinity;
                for (int i = 0; i < n; i++) {
                    if (visited.contains(i) == false && distance[i] < minDist) {
                        minDist = distance[i];
                        dangxet = i;
                    }
                }

                // b3. tim dinh ke chua xet
                // => update khoang cach va dinh previous
                for (int i = 0; i < n; i++) {
                    if (visited.contains(i) == false && a[dangxet][i] != 0) {
                        int newDistance = distance[dangxet] + a[dangxet][i];
                        if (newDistance < distance[i]) {
                            distance[i] = newDistance;
                            previous[i] = dangxet;
                        }
                    }
                }
                // danh dau dinh dang xet thanh dinh da duyet
                visited.add(dangxet);
            }
            System.out.println("kc tu " + start + " den " + finish + " la: " + distance[finish]);
            int chay = finish;
            while (chay != start) {
                System.out.print(chay + " <-- ");
                chay = previous[chay];
            }
            System.out.println(chay);
        }
    }
}
