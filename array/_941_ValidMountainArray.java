package array;

public class _941_ValidMountainArray {
    public static boolean validMountainArray(int[] a){
    int n =a.length;
    boolean bIsIncrease =true;// thiet lap dau vao tang
    for (int i=0;i<n-1; i++){
        int j =i+1;
        if (a[i]>a[j]){
            if (bIsIncrease==false){
                // normal
            }else {
                if (i==0){
                    return false;
                }
                bIsIncrease=false;
            }
        }
        else if (a[i] <a[j]) {
            if (bIsIncrease==true){
                // normal
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    if (bIsIncrease==false){
        return true;
    }
    return false;
    }

    public static void main(String[] args) {
        int[] a ={1,2,4,2,1};
        System.out.println(validMountainArray(a));


    }
}
