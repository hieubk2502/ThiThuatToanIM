package dailyLeetCode;

public class _1299_ReplaceElementWithGreatestElementOnRightSide {
   // 17 18 5 4 6 1
    public static int[] replaceElement(int[] a){
        int n =a.length;
        for (int i = n-1; i >=0 ; i--) {
            if (i==n-1){
                // khong co gi ca
            }
            else {
                a[i] = Math.max(a[i],a[i+1]);
            }
        }
        // 18 18 6 6 6 1
        // dich chuyen sang ben trai 1 o
        for (int i = 1; i <n ; i++) {
            a[i-1] =a[i];
        }
        // 18 6 6 6 1 1
        if (n>0){
            a[n-1] =-1;
        }
        // 18 6 6 6 1 -1
        return a;
    }

    public static void main(String[] args) {
        int[] a={17,18,5,4,6,1};
        int[]k = replaceElement(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(k[i]+" ");
        }
    }


}
