package graphDoThi;

import java.util.HashSet;
import java.util.Set;

public class algorithmsDijkstra {

    public static void main(String[] args) {
        int[][] a ={
                {0,6,0,1,0},
                {6,0,5,2,2},
                {0,5,0,0,5},
                {1,2,0,0,1},
                {0,2,5,1,0}
        };
        int n = a.length;// so dinh
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];//distance[i] khoang cach tu dinh dau cho den dinh i
        int[] previous = new int[n];// previous[i] dinh phia truoc cua i

        int start = 0;
        int finish = 2;
        for (int i = 0; i < n; i++) {
            distance[i] =Integer.MAX_VALUE;
        }
        distance[start]=0;

        while (visited.size()<n){
            // buoc 2: chon dinh chua duoc duyet
            // va dang co khoang cach nho nhat (tu dinh xuat phat) lam dinh dang xet
            int dangXet=0;
            int minDist = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) &&distance[i]<minDist){
                    minDist = distance[i];
                    dangXet=i;
                }
            }
            // b3 : tu dinh dang xet, duyet cac dinh ke chua duyet;
            // update khoang cac, va dinh truoc cua no
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) &&a[dangXet][i] !=0){
                    int newDistance = distance[dangXet]+ a[dangXet][i];
                    if (newDistance<distance[i]){
                        distance[i] =newDistance;
                        previous[i]=dangXet;
                    }
                }
            }
            // danh dau dinh dang xet thanh dinh da duyet
            visited.add(dangXet);
        }
        System.out.println("khoang cach nho nhat tu : "+start +" den "+finish +": "+ distance[finish]);
        int chay=finish;
        while (chay!=start){
            System.out.print(chay+"<--");
            chay=previous[chay];
        }
        System.out.println(chay);


    }
}
