package dailyLeetCode;

public class _852_PeakIndexInAMoutainArray {
    public static int findMax(int[] a,int L, int R){
        // kiem tra dk co so
        int n =a.length;
        if (R-L>=2){// or n>=3
            int i  =(L+R)/2;
            if (a[i]>a[i-1]&&a[i]>a[i+1]){
                return i;
            } else if (a[i-1]<a[i]) {
                // di chuyen ve ben phai
                findMax(a,i,R);
            }
            else {
                // di chuyen sang ben trai
                findMax(a,L,i);
            }
            return i;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,1};
        System.out.println(findMax(a,0,a.length));
    }
}
