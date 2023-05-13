package dailyLeetCode;

public class _53_2_MaximumSubarray {
    // ap dung Dynamic programing
    public static int maximumSubrray(int[] a){
        // tinh tong sum tu a[0] ->a[i]
        int[] sum = new int[a.length];
        int res=0;
        sum[0] = a[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = a[i]+sum[i-1];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum_i_j= sum[j]-sum[i] +a[i];
                if (sum_i_j>res){
                    res =sum_i_j;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] a= {-2,1,-3,4,-1,2,1,-5,4};
        maximumSubrray(a);
    }

}
