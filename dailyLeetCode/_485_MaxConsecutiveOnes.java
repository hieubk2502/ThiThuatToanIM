package dailyLeetCode;

public class _485_MaxConsecutiveOnes {
    
    public static int maxConsecutiveOnes(int[] a){
        int n =a.length;
        int count=0;
        int max =0;
        for (int i = 0; i < n; i++) {
            if (a[i] ==0){
                count=0;
            }else {
                count++;
                max= (count>max) ?count:max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a  ={1,1,1,1,0,0,0,1,1,1,1,1,0};
        System.out.println(maxConsecutiveOnes(a));
    }
}
