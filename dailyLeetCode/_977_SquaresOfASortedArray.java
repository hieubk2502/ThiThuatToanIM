package dailyLeetCode;

public class _977_SquaresOfASortedArray {

    public static int[] squaresArray(int[] a){
        int n =a.length;
        // tim index: i j
        // i la index so am phair cung trong day
        int i=-1;
        while (i+1<n &&a[i+1]<0){
            i++;
        }
        // j la index so >=0 trai cung trong day
        // j=i+1
        int j=n;
        while (j-1>=0 &&a[j-1]>=0){
            j--;
        }
        int[] v =new int[n];
        int k=0; // index k=v
        while (i>=0 ||j<n){
            if (i>=0&&j<n){// truong hop ca 2 deu hop le
                if (Math.abs(a[i])<Math.abs(a[j])){
                    v[k] =a[i]*a[i];
                    i--;k++;
                }
                else {
                    v[k] =a[j]*a[j];
                    k++;j++;
                }

            } else if (i>=0) {// truong hop chi con i hop le, j k hop le j>n
                v[k] = a[i] * a[i];
                i--;k++;
            }else {//ruong hop chi con j hop le, i k hop le i<0
                v[k]=a[j]*a[j];
                j++;k++;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int[] a ={-4,-2,0,1,6};
         squaresArray(a);
    }
}
