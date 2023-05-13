package more;

import java.util.HashMap;
import java.util.Map;

public class TimUocChungLonNhat {
    public static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static int xuly1(int[] a){
        int n = a.length;
        int res =1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                res = Math.max(res,gcd(a[i],a[j]));
            }
        }
        return res;
    }



    public static void main(String[] args) {
        int[] a ={2,3,1,4,5,7,14,2,5,10};
        System.out.println( xuly1(a));
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= Math.sqrt(a[i]); j++) {
                if (a[i]%j==0&&map.containsKey(j)==false){
                    map.put(j,1);
                    continue;
                }
                 if (a[i]%j==0){
                    Integer value = map.get(j);
                    value++;
                    map.replace(j,value);
                }
                if (j!=a[i]/j&&map.containsKey(a[i]/j)==false){
                    map.put(a[i]/j,1);
                    continue;
                }
                if  (j!=a[i]/j) {
                    Integer valuei = map.get(a[i]/j);
                    valuei++;
                    map.replace(a[i]/j,valuei);
                }
            }
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key)>=2){
                res =key;
            }
        }
        System.out.println(res);
    }
}
