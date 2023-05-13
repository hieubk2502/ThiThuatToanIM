package dailyLeetCode;

public class _70_ClimbingStairs {
    // de qiu k nho
//    public static int climbStairs(int n){
//        if (n==1) return 1;
//        if (n==2) return 2;
//        return climbStairs(n-1)+climbStairs(n-2);
//    }

    // de quy co nho
    public static int[] soBuoc = new int [100];
    public static int climbStairsrecusion(int n){

        // bai toan co so
        soBuoc[1] =1;
        soBuoc[2] =2;
        // cong thuc de quy
        if (soBuoc[n]==0) {
            soBuoc[n] = climbStairsrecusion(n-1)+climbStairsrecusion(n-2);
            System.out.println("tinh so buoc: "+ n+"-"+(n-1)+"-"+ (n-2));
        }
        return soBuoc[n];
    }



    public static void main(String[] args) {
//        System.out.println(climbStairs(5));
        System.out.println(climbStairsrecusion(10));
    }
}
