package dailyLeetCode;

public class _88_MergeSortedArray {
    public static int[] mergeSortedArray(int[] a1, int[] a2, int n1, int n2) {
        int k1 = n1 - 1;
        int k2 = n2 - 1;
        int k = k1 + k2 + 1;
        while (k1 >= 0 || k2 >= 0) {
            if (k1 >= 0 && k2 >= 0) {
                if (a1[k1] > a2[k2]) {
                    a1[k] = a1[k1];
                    k--;
                    k1--;
                } else {
                    a1[k] = a2[k2];
                    k--;
                    k2--;
                }
            } else {
                if (k1 >= 0) {
                    a1[k] = a1[k1];
                    k--;
                    k1--;
                }
                if (k2 >= 0) {
                    a1[k] = a2[k2];
                    k--;
                    k2--;
                }
            }
        }
        return a1;
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,3,0,0,0};
        int[] a2 = {2,5,6};
        mergeSortedArray(a1,a2,3,3);
    }
}
