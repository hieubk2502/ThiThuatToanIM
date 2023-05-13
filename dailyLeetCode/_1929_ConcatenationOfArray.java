package dailyLeetCode;

import java.util.ArrayList;

public class _1929_ConcatenationOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (count<2){
            for (int i = 0; i < a.length; i++) {
                arr.add(a[i]);
            }
            count++;
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }

}
