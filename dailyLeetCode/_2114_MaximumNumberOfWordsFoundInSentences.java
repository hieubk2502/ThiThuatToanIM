package dailyLeetCode;

public class _2114_MaximumNumberOfWordsFoundInSentences {

    public static int xuly(String[] s){
        int res =0;
        for (String si: s) {
            String[] s1 = si.split(" ");
            int count =s1.length;
            if (count>res){
                res =count;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String[] s = {"anh hai oi", "anh hai","anh ba bon oi"};

        System.out.println(xuly(s));
    }
}
