package dailyLeetCode;

public class _268_MissingNumber {
    public static int missingNumber(int[] a){
        int res =0;
        for (int ai : a) {
            res ^=ai;
        }
        for (int i = 0; i <= a.length; i++) {
            res ^=i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a ={3,0,1};
        // xem tu 0->3 thieu so gi
        System.out.println(missingNumber(a));
    }
}
