package array;

public class _11_283_Move_Zeroes {
    public static void moveZeroes(int[] a){
        int n=a.length;
        int curIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] !=0){
                a[curIndex]=a[i];
                curIndex++;
            }
        }
        for(;curIndex<n;curIndex++){
            a[curIndex]=0;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,0,67,0};
        moveZeroes(a);
    }

}
