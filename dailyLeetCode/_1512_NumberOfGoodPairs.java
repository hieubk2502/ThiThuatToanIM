package dailyLeetCode;

public class _1512_NumberOfGoodPairs {
    public static int numberOfGoodPairs(int[] a){
        int n = a.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (a[i]==a[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a ={1,2,2,1};
        System.out.println(numberOfGoodPairs(a));
    }
}
