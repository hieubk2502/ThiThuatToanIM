package dailyLeetCode;

public class _1089_DuplicateZeros {
    // 1 0 1 0 1 : Input
    // 1 0 0 1 0 : Output

    public static void dupliacteZeros(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] ==0){
                for (int j = n-2; j >=i+1 ; j--) {
                    a[j+1] = a[j];
                }
                if (i+1<n){
                    //i==1
                    a[i+1] =0;
                    i++;//i==2
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a ={1,0,2,3,0,4,5};
        dupliacteZeros(a);
    }

}
