package dailyLeetCode;

public class _1816_TruncateSentence {

    public static String truncateSentence(String s, int k){
        String[] arr = s.split(" ");
        String result ="";
        for (int i = 0; i < k; i++) {
            result += (i==0)?arr[i]:(" "+ arr[i]);
        }
        return result;
    }
    public static String truncateSentenceStringBuilder(String s, int k){
        String[] arr =s.split(" ");
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i==0){
                resultSB.append(arr[i]);
            }
            else {
                resultSB.append(" "+arr[i]);
            }
        }
        return resultSB.toString();
    }
    public static String truncateSentenceSubstring(String s, int k){
        int countSpace = 0;
        s = s+" ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==0){
                countSpace++;
            }
            if (countSpace==k){
                return s.substring(0,i);
            }
        }
        return "";

    }

    public static void main(String[] args) {
        String s = "How old are you Peter";
        System.out.println(truncateSentence(s,3));

    }
}
