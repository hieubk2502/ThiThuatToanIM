package dailyLeetCode;

public class _146_SingleNumber {
    public static int singleNumber(int[] a){
        // su dung toan tu XOR
        int result =0;
        for (int ai:a) {
            result^=ai;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        singleNumber(arr);
        // cong bit 2 cua tat ca so voi nhau dua ra so cuoi cung
    }
}
