package array;

public class _1818_TruncateSentence {
    public static String truncateSentenceString(String s, int k){
        String[] arr =s.split(" ");
        String result = "";
        for (int i = 0; i < k; i++) {
            if (i==0){
                result +=arr[i];
            }
            else {
                result+=" "+ arr[i];
            }
        }
        return result;
    }
    public static String truncateSentenceStringBuilder(String s, int k){
        String[] arr = s.split(" ");
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i==0){
                resultSB.append(arr[i]);
            }
            else {
                resultSB.append(" "+ arr[i]);
            }
        }
        return resultSB.toString();
    }
    public static String truncateSentence(String s, int k){
        int countSpace = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==' '){
                countSpace++;
            }
            if (countSpace==k){
                return s.substring(0,i);
            }
        }
        return "";
    }
}
