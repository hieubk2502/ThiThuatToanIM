package more;

public class DiemCanBang {
    public static int xuly(int[] a){
        int[] b = new int [a.length];
        int[] c = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (i==0)? a[i]: b[i-1]+a[i];
            c[a.length-1-i] = (i==0)? a[a.length-1-i]: c[a.length-i]+a[a.length-1-i];
        }
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                if (c[1]==0){
                    return i;
                }
            }
             else if (i==a.length-1){
                if (b[a.length-2]==0){
                    return i;
                }
            }
            else {
                if (b[i-1]==c[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,9,8,1};
        System.out.println(xuly(a));
    }
}
