package dailyLeetCode;

public class _283_MoveZeroes {

    public static void moveZeroes(int[] a){
        int n = a.length;
        int[] b  = new int[n];
        int currentIndex  = 0;

        for (int i = 0; i < n; i++) {
            if (a[i]!=0){
                b[currentIndex] = a[i];
                currentIndex++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,3,0,0,3};
        moveZeroes(a);
    }
}
