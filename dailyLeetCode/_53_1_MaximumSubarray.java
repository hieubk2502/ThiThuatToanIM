package dailyLeetCode;

public class _53_1_MaximumSubarray {
    public static int maximumSubarray(int[] a){
        int res = a[0];
        // tinh tong ij
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum_ij = 0;
                for (int k = i; k <= j; k++) {
                    sum_ij+= a[k];
                }
                if (sum_ij>res){
                    res = sum_ij;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarray(a);
    }
}
