package dailyLeetCode;

public class _27_RemoveElement {
    public static int removeElement(int[] a, int val){
        int n =a.length;
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] !=0){
                a[currentIndex]=a[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {

    }
}
