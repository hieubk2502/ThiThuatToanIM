package array;

//852
public class PeakIndexinAMountainArray {
    public static int find(int[] a, int L, int R){
        // kiem tra tinh hop le
        if(R-L>=2){
            int i=(L+R)/2;
            if (a[i]>a[i-1] &&a[i]>a[i+1]){
                return i;
            }
            else if(a[i-1]<a[i]) {
                // di chuyen ve ben phai
                return find(a,i,R);
            }
            else {
                return find(a,L,i);// di chuyen sang ben trai
            }
        }
        else {
            return -1;
        }
    }

    public static int peadkIndexinMountainArray(int[] a){
        int index = find(a,0,a.length);
        return index;
    }
    public static void main(String[] args){
        int[] a ={1,2,4,5,7,8,9,4,3,2,1};
        System.out.println(peadkIndexinMountainArray(a));
    }
}
