package dailyLeetCode;

import java.util.Arrays;

public class _1051_HeightChecker {

    // sap xep
    public static int[] merge(int[] a1, int[] a2){
        int n1 =a1.length;
        int n2 = a2.length;
        int[] results = new int[n1+n2];
        int n =n1+n2;
        int i=0,i1=0,i2=0;
        while (i<n){
            if (i1<n1&&i2<n2){
                if (a1[i1]<=a2[i2]){
                    results[i] =a1[i1];
                    i++;i1++;
                }
                else {
                    results[i]=a2[i2];
                    i++;i2++;
                }
            }
            else {
                if (i1<n1){
                    results[i] =a1[i1];
                    i++;i1++;
                }
                else
                {
                    results[i] =a2[i2];
                    i++;i2++;
                }
            }
        }
        return results;
    }

    // tach ra
    public static int[] mergeSort(int[] a, int L, int R){
        // truong hop dung
        if (L>R){
            return new int[0];
        }
        if (L==R){
            int[] singleElement = {a[L]};
            return singleElement;
        }
        // truong hop tong quan
        // chia ra
        System.out.println("chia " +L +"-"+R);
        int k =(L+R)/2;
        int[] a1 =mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1,R);
        // tron vao nhau
        int[] results = merge(a1,a2);
        System.out.println("ket quar: "+ Arrays.toString(results));
        return results;
    }
    public static int[] sortArray(int[] a){
        return mergeSort(a,0,a.length-1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,1,1,4,2};
        int[] k = sortArray(a);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]+" ");
        }
        System.out.println();
        // dem su khac nhau
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=k[i]){
                count++;
            }
        }
        System.out.println("count: "+count);

    }

}
