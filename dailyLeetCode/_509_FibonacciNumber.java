package dailyLeetCode;

public class _509_FibonacciNumber {

    public static int fibonacci(int n){
        int[] F = new int[100];
         F[0]=0;F[1]=1;
        for (int i = 2; i <= n; i++) {
            F[i]=F[i-1]+F[i-2];
        }
        return F[n];
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(10));

    }
}
