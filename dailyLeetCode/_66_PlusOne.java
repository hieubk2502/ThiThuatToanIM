package dailyLeetCode;

public class _66_PlusOne {

    public static int[] plusOne(int[] a){
        int n =a.length;
        int soDu =1;
        int i =n-1;
        while (i>=0&&soDu>0){
            int temp = a[i] +soDu;
            a[i] = temp%10;
            soDu = temp/10;
            i--;
        }
        if(soDu>0){
            int[] b = new int[n+1];
            b[0] =1;
            for (int j = 1; j < n+1; j++) {
                b[j] =a[j-1];
            }
            return b;
        }
        else {
            return a;
        }

    }
    public static void main(String[] args) {
        int[] a ={9,9,9};
        plusOne(a);
    }
}
