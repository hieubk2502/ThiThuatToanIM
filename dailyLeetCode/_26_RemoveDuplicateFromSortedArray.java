package dailyLeetCode;

public class _26_RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] a){
        int currentIndex = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] !=a[currentIndex]){
                currentIndex++;
                a[currentIndex]=a[i];
            }
        }
        return currentIndex+1;
    }

    public static void main(String[] args) {
        int[] a ={0,0,1,1,1,2,3,4};
        removeDuplicates(a);
    }
}
