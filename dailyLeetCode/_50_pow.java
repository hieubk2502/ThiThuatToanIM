package dailyLeetCode;

public class _50_pow {
    public static double xuly(double x, int n ){
        // dkien dung
        if (n==0){
            return 1 ;
        }
        int n_2=0;
        if (n<0){
            n_2 = (n%2==0)?(-n/2) : (-n-1)/2;
            x =1/x;
        }else {
            n_2 = (n%2==0)?(n/2) : (n-1)/2;
        }
        double t = xuly(x,n_2);
        return n%2==0 ? (t*t) : (x*t*t);
    }
    public static void main(String[] args) {
        System.out.println(xuly(2,-5));
        System.out.println(Math.pow(2,-5));
    }
}
