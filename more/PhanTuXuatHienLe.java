package more;

public class PhanTuXuatHienLe {
    public static void main(String[] args) {
        int[] a ={1,1,2,2,3,3,3,4,4};
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res^=a[i];
        }
        System.out.println(res);
    }
}
