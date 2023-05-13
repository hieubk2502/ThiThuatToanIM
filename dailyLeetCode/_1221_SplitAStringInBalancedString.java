package dailyLeetCode;

public class _1221_SplitAStringInBalancedString {

    public static int balancedStringSplit(String s){
        int countResults = 0;
        char[] arr = s.toCharArray();
        int countR= 0;
        int countL =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] =='L'){
                countL++;
            }else {
                countR++;
            }
            if (countR==countL){
                countResults++;
                countL=0;
                countR=0;
            }
        }
        return countResults;
    }

    public static void main(String[] args) {
        String s = "LRLLRRLLLRRR";
        balancedStringSplit(s);
    }
}
