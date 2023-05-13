package dailyLeetCode;

public class _2154_KeepMultipplying {
    public static int keepMultiplying(int[] a, int k){
        while (true){
            boolean is =true;
            for (int i = 0; i < a.length; i++) {
                if (a[i]==k){
                    k = a[i]*2;
                    is=false;
                    break;
                }
            }
            if (is==true){
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] a = {5,3,5,1,12};
        System.out.println(keepMultiplying(a,3));


    }
}
