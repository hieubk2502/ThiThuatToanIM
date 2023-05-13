package array;

public class _27_66_plus_one {
    public static int[] plusOne(int[] a){
        int n =a.length;
        int soDu=1;
        int i=n-1;
        while (i>=0&&soDu>0){
            int temp= a[i] +soDu;
            a[i]=temp%10;
            soDu =temp/10;
            i--;
        }
        if(soDu==0){
            return a;
        }
        int[] b=new int[n+1];
        b[0] =soDu;
        for (int j = 0; j < n; j++) {
            b[j+1] =a[j];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a ={9,9,9};
        plusOne(a);
    }
}
