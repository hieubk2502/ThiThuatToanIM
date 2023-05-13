package dailyLeetCode;

public class _2164_SortEvenAndOddIndicesIndependently {
    //
    public static int[] sortArrayEvenOdd(int[] a){
        int n =a.length;
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < n-2; j+=2) {
                if (a[j]>a[j+2]){
                    int t =a[j];
                    a[j] =a[j+2];
                    a[j+2] =t;
                }
            }
        }
        for (int i = 1; i < n; i+=2) {
            for (int j = 1; j < n-2; j+=2) {
                if (a[j]<a[j+2]){
                    int t =a[j];
                    a[j] =a[j+2];
                    a[j+2] =t;
                }
            }
        }
        return a;
    }
    // O(n^2) :(((((
    public static void main(String[] args) {
        int[] a ={4,1,2,3};
        sortArrayEvenOdd(a);
    }

}
