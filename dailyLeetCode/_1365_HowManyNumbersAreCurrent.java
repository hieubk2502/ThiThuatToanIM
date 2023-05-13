package dailyLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1365_HowManyNumbersAreCurrent {
    public static int[] smallNumberThanCurrent(int[] a){
        int n =a.length;
        int[] res =new int[n];
        int[] original = Arrays.copyOf(a,n);
        Map<Integer,Integer> map =new HashMap<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])==false){
                map.put(a[i],i);
            }
        }
        for (int i = 0; i < original.length; i++) {
            res[i] = map.get(original[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[]a = {8,1,2,2,3};
        smallNumberThanCurrent(a);
    }
}
