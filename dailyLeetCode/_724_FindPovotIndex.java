package dailyLeetCode;


public class _724_FindPovotIndex {
    public static int pivotIndex(int[] a){
        int n = a.length;
        // dk chan
        if (n==1){
            return 0;
        }
        if (n==0){
            return -1;
        }

        int[] sL = new int[n];
        int[] sR = new int[n];
        for (int i = 0; i < n; i++) {
            int j = n-1-i;
            sL[i] = (i==0)? a[i]:(a[i-1]+a[i]);
            sR[i] = (j==n-1)? a[j]:(a[j+1]+a[j]);
        }
        for (int i = 0; i < n; i++) {
            if (i==0){
                if (sR[1]==0){
                    return i;
                }
            } else if (i==n-1) {
                if (sL[n-2]==0){
                    return i;
                }
            }
            else {
                if (sL[i-1]==sR[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        pivotIndex(a);
    }
}
