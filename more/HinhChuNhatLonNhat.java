package more;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class HinhChuNhatLonNhat {

    public static int max_area(int[] x){
        int res =0;
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while (i<x.length){
            if (stack.empty()||x[i]>=stack.peek()){
                stack.push(i);
                System.out.println("push: "+i);
                i++;
            }else {
                int top = stack.peek();
                System.out.println("lay: "+ top);
                stack.pop();
                int xtop=x[top];
                System.out.println("gia tri x[top]: "+ xtop);

                if (stack.empty()){
                    System.out.println("i="+ i+" "+"1: so sanh: "+res+"-"+i*x[top]);
                    res = Math.max(res,i*x[top]);
                    System.out.println("cap nhat res= "+res);
                }
                else {
                    System.out.println("gia tri tren cung: "+stack.peek());
                    int c = x[top]*(i-stack.peek()-1);
                    System.out.println("i="+ i+" "+"1: so sanh: "+res+"-"+c);
                    res = Math.max(res,x[top]*(i-stack.peek()-1));
                    System.out.println("cap nhat res= "+res);
                }
            }
        }
        while (!stack.empty()){
            int top = stack.peek();
            System.out.println("gia tri tren cung: "+stack.peek());
            stack.pop();
            if (stack.empty()){
                System.out.println("i="+ i+" "+ "2: so sanh: "+res+"-"+i*x[top]);
                res = Math.max(res,i*x[top]);
                System.out.println("cap nhat res= "+res);
            }
            else {
                System.out.println("gia tri tren cung: "+stack.peek());
                int c = x[top]*(i-stack.peek()-1);
                System.out.println("i="+ i+" "+"2: so sanh: "+res+"-"+c);
                res = Math.max(res,x[top]*(i-stack.peek()-1));
                System.out.println("cap nhat res= "+res);
            }
        }

        return res;
    }
    public static int caculator_area(int[] a){
        int res =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
                continue;
            }
            for (int j = i; j <a.length ; j++) {
                int count = 0;
                int max=0;
                int res1=0;
                for (int k = i; k <=j ; k++) {
                    boolean is= true;
                    if (a[k] !=0&&is==true) {
                        count++;
                        max=(count>max)? count:max;
                    }
                    else {
                        is=false;
                        count=0;
                    }
                }
                res1 = max*Math.min(a[i],a[j]);
                res=(res1>res)?res1:res;
            }

        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\more\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            // nhap
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            // xu ly
            int[][] tmp = new int[n][n];
            for (int i = 0; i < n; i++) {
                tmp[0][i]= a[0][i];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                   if (a[i][j]==1){
                       tmp[i][j]=a[i-1][j]+1;
                   }
                }
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(tmp[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            int ans= 0;
            for (int i = 0; i <n ; i++) {
                ans = Math.max(ans,caculator_area(tmp[i]));
            }
            System.out.println(ans);
        }
    }
}
