package array;

public class _24_724_Find_Pivot_Index {
    public static int pivotIndex(int[] a){
        int n =a.length;
        if (n==1){
            return 0;
        }
        if (n==0){
            return -1;
        }
        int[] st = new int[n];
        int[] sp = new int[n];
        for (int i = 0; i < n; i++) {
            int j=n-i-1;
            st[i] =(i==0) ? a[i] : st[i-1]+a[i];
            sp[j] =(j==n-1)? a[j] : sp[j+1] +a[j];
        }
        for (int i=0;i<n;i++){
            if (i==0){
                if(sp[i] ==0){
                    return i;
                }
            } else if (i==n-1) {
                if(st[2]==0){
                    return i;
                }
            }
            else {
                if(st[i-1]==sp[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={1,4,5,6,3,4,3};
        pivotIndex(a);
    }
}
