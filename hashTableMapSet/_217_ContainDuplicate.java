package hashTableMapSet;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainDuplicate {
    public static boolean containDuplicate(int[] nums){
        Set<Integer> mySet = new HashSet<>();
        // truy xuat xem phan tu co trong mang
        // dung array thi mat O(n) con dung set thi mat O(1)
        for(Integer n:nums){
            if (mySet.contains(n)==true){
                return true;
            }
            else {
                mySet.add(n);
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
