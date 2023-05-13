package graphDoThi;

import java.util.HashSet;
import java.util.Set;

public class DijkstraTest2 {
    public static void main(String[] args) {
        int[][] a ={
                {0,6,0,1,0},
                {6,0,5,2,2},
                {0,5,0,0,5},
                {1,2,0,0,1},
                {0,2,5,1,0}
        };
        int n = a.length;
        // Khoi tao khoang cach
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];
        int[] previous = new int[n];

        int start =0;
        int finish = 3;
        int infinity = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            distance[i] = infinity;
        }
        distance[start] = 0;
        // Buoc 2: chon dinh chua duoc duyet
        // va co khoang cach nho nhat tu dinh xuat phat den dinh dang xet
        while (visited.size()<n) {
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
                if (visited.contains(i) == false && a[dangxet][i]!=0){
                    int newDistance = distance[dangxet] +a[dangxet][i];
                    if (newDistance<distance[i]){
                        distance[i]= newDistance;
                        previous[i] = dangxet;
                    }
                }
            }
            // danh dau dinh dang xet thanh dinh da duyet
            visited.add(dangxet);
        }
        System.out.println("kc tu "+ start+" den "+finish+" la: "+distance[finish] );
        int chay=finish;
        while (chay!=start){
            System.out.print(chay+" <-- ");
            chay=previous[chay];
        }
        System.out.println(chay);
    }
}
