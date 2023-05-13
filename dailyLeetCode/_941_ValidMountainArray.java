package dailyLeetCode;

public class _941_ValidMountainArray {
    public static boolean validMountainArray(int[] a){
        int n =a.length;
        if (n<3){
            return false;
        }
        boolean bIsIcreasing = true;
        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            if (a[i]>a[j]){// day giam
                if (bIsIcreasing=false){
                    // ddang giam thi bo qua
                }else {
                    if (i==0){// neu tu dau no da giam thi k phai moutain
                        return false;
                    }
                    // neu k phai i=0, thi ta se doi chieu gia tri bIsIcreasing
                    bIsIcreasing=false;
                }
            }else if (a[i]<a[j]){// day tang
                if (bIsIcreasing==true){// dang tang dan
                    // bo qua, duyet tiep
                }
                else {// day tang ma gia tri bIsIcreasing == false
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if (bIsIcreasing==false){// neu khi duyet het day, gia tri bIscreasing==false(thuc day giam)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,5,4,3,5,1};
        System.out.println(validMountainArray(a));
    }
}
