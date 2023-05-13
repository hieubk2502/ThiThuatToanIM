package dailyLeetCode;

public class _746_MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] a){

        // 1 100 1 1 1 100 1 1 100 1 *
        // buoc toi da 2 khoang cach
        // gia tri 2 buoc dau se la 0 0
        // 0  0
        //
        int[] sumMoney = new int [ a.length+1];
        // gia tri mac dinh
        sumMoney[0] =0;
        sumMoney[1] =0;
        // truy hoi
        for (int i = 2; i <=a.length ; i++) {
            sumMoney[i] =Math.min(sumMoney[i-1] + a[i-1] , sumMoney[i-2]+a[i-2]);
        }
        return sumMoney[a.length];
    }

    public static void main(String[] args) {
        int[] a ={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(a));
    }
}
