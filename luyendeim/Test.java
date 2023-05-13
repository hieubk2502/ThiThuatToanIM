package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T =scanner.nextInt();
        for (int t = 1; t <=T ; t++) {
            int n= scanner.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            int res =0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int xi=i;
                    int yj=j;
                    for (int k = i; k < n; k++) {
                        for (int l = j; l < n; l++) {
                            int count=0;
                            int xk=k;
                            int yl=l;
                            while (true){
                                if (a[xi][yj]==1){
                                    xi=xi+1;
                                } else if (a[xi][yj]==2) {
                                    xi=xi-1;
                                }else if (a[xi][yj]==3) {
                                    yj=yj+1;
                                }else if (a[xi][yj]==4) {
                                    yj=yj-1;
                                }
                                if (a[xk][yl]==1){
                                    xk=xk+1;
                                } else if (a[xk][yl]==2) {
                                   xk=xk-1;
                                }else if (a[xk][yl]==3) {
                                    yl=yl+1;
                                }else if (a[xk][yl]==4) {
                                    yl=yl-1;
                                }
                                count++;
                                if (xi==xk&&yj==yl){
                                    if (count>10){
                                        res++;
                                        break;
                                    }else {
                                        break;
                                    }
                                }
                                if (count>2){
                                    res++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
