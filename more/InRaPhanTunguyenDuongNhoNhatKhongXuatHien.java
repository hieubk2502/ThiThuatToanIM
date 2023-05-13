package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2
//        5
//        1 2 3 4 5
//        5
//        4 -10 1 3 -20
public class InRaPhanTunguyenDuongNhoNhatKhongXuatHien {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int T= scanner.nextInt();
        for (int t = 1; t <=T ; t++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            boolean[] b  =new boolean[1000000];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
                if (a[i]>=0){
                    b[a[i]]=true;
                }
            }
            for (int i = 1; i < b.length; i++) {
                if (b[i] !=true){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
