package dailyLeetCode;

public class _704_BinarySearch {
    public static int search(int[] a,int L, int R, int k){
        // dk dung
        if (L>R){
            return -1;
        }
        // xd phan tu giua
        int x = (L+R)/2;
        if (a[x]==k){
            return x;
        }
        if (a[x]>k){
             return  search(a,0,x,k);
        }
        return search(a,k+1,R,k);
    }
    public static int bSearch(int[] a, int k){
        return search(a,0,a.length,k);
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(bSearch(a,3));

    }
}
