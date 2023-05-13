package dailyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class _448_FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisapperedInAnArray(int[] nums){
        ArrayList<Integer> results = new ArrayList<>();
        boolean[] exist = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            exist[nums[i]]=true;
        }
        for (int i = 1; i < exist.length; i++) {
            if (exist[i]==false){
                results.add(i);
            }
        }
        return  results;
    }

    public static void main(String[] args){
        int[] a ={1,2,5,6,7,9,0,9,8};
        findDisapperedInAnArray(a);
    }

}
