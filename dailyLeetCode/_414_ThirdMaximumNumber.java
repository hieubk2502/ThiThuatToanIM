package dailyLeetCode;

public class _414_ThirdMaximumNumber {
    public static int thirdMax(int[] a){
        int[] maxArray = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for (int i = 0; i < a.length; i++) {
            insert(maxArray,a[i]);
        }
        return maxArray[2];
    }
    public static void insert(int[] maxArray, int val){
        int i =0;
        while (i<maxArray.length){
            if (val==maxArray[i]){
                return;
            } else if (val>maxArray[i]) {
                break;
            }
            else {
                i++;
            }
        }
        if (i<maxArray.length){
            for (int j = maxArray.length-2; j >=i ; j--) {
                maxArray[j+1]=maxArray[j];
            }
            maxArray[i]=val;
        }
    }
    


    public static void main(String[] args) {
        int[] a = {1,1,2,4,6,7};
        System.out.println(thirdMax(a));

    }
}
