package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhanTuKhongXuatHien {
//    2
//            10
//            -1 -1 6 1 9 3 2 -1 4 -1
//            6
//            0 -3 1 -2 3 4

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        Map<Integer, Boolean> map = new HashMap<>();
        int T= scanner.nextInt();
        for (int t = 1; t <=T ; t++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
                map.put(a[i],true);
            }
           int[] b  =new int[n];
            for (int i = 0; i < b.length; i++) {
                if (map.containsKey(i)==true){
                    b[i]=i;
                }else {
                    b[i]=-1;
                }
            }
        }
    }
}
