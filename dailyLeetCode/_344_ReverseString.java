package dailyLeetCode;

public class _344_ReverseString {
    public static void swap(char[] arr, int i, int j){
        if(i<j){
            char tempt = arr[i];
            arr[i]= arr[j];
            arr[j] = tempt;
            swap(arr,i+1,j-1);
        }

    }
    public static void reverseString(char[] s){
        swap(s,0,s.length-1);
    }


    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }

}
