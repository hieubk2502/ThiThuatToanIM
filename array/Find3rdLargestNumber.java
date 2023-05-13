package array;

public class Find3rdLargestNumber {

    public static void insert(long[] maxArr, int val){

    }

    public static int thirdMax(int[] a){
        long[] maxArr ={Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for (int i = 0; i < a.length; i++) {
            insert(maxArr,a[i]);
        }
        if (maxArr[2]==Long.MIN_VALUE){
            return (int)maxArr[0];
        }

        return (int) maxArr[2];
    }


}
