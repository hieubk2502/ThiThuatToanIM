package dailyLeetCode;

import java.util.ArrayList;

public class _771_JewelsAndStones {
    public static ArrayList[] jewelsAndStone(int[] a){
        ArrayList<Integer> results = new ArrayList<>();
        // mang a co 8 phan tu nhung chi co a.length =7
        // can khoi tao mang exist =7+1 =8
        boolean[] exist = new boolean[a.length+1];
        for (int i = 0; i < a.length; i++) {
            exist[a[i]] =true;
        }
        for (int i = 1; i < exist.length; i++) {
            if (exist[i]==false){
                results.add(i);
            }
        }
        return new ArrayList[]{results};
    }

    public static void main(String[] args) {
        int[] a ={1,1,2,5,4,6,8,8};
        jewelsAndStone(a);
    }
}
