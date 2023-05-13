package array;

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOne(int[] a){
        int max = 0;
        int count =0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            if(a[i]==0){
                count=0;
            }
            else {
                count++;
                max=(count>max) ? count:max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a ={1,1,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOne(a));


    }
}
