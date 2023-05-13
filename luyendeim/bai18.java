//package luyendeim;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class bai18 {
//    public static int[] dx = {-1,-1,0,1,1,1,0,-1};
//    public static int[] dy= {0,1,1,1,0,-1,-1,-1};
//    public static boolean check(int[][] a, int i, int j){
//        for (int k = 0; k < 8; k++) {
//            for (int l = 0;; l++) {
//                int count1=0;
//                int count2=0;
//                int nx =i+l*dx[k];
//                int ny =j+l*dy[k];
//                if (nx<0||nx>=a.length||ny<0||ny>=a[0].length){
//                    break;
//                }
//                if (a[nx][ny]==1){
//                    count2=0;
//                    count1++;
//                    if (count1==5){
//                        if (a[nx+1][ny+1]!=a[nx-5][ny-5]){
//                            return true;
//                        }
//                    }
//                }
//                else if (a[nx][ny]==2){
//                    count1=0;
//                    count2++;
//                }else {
//                    count1=0;
//                    count2=0;
//                }
//            }
//        }
//
//
//        int[][] b = new int[5][5];
//        int[] tmp =new int[25];
//        int ai=0;
//        for (int k = i; k < i+5 ; k++) {
//            for (int l = j; l <j+5 ; l++) {
//                tmp[ai]=a[k][l];
//                ai++;
//            }
//        }
//        ai=0;
//        for (int k = 0; k < 5; k++) {
//            for (int l = 0; l < 5; l++) {
//                b[k][l]=tmp[ai];
//                ai++;
//            }
//        }
//        boolean is =true;
//        for (int k = 0; k < 5; k++) {
//            for (int l = 0; l < 5; l++) {
//                int tmp =b[k][l];
//                int count=1;
//                if (k==0||l==0){
//                    for (int m = 0; m < 8; m++) {
//                        for (int n = 1;; n++) {
//                            int nx =i+n*dx[m];
//                            int ny =j+dy[m];
//                            if (nx<0||nx>=5||ny<0||ny>=5){
//                                break;
//                            }
//                            if (b[nx][ny]==tmp){
//                                count++;
//                                if (count==5){
//                                    return true;
//                                }
//                            }
//                            else {
//                                count=1;
//                                break;
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public static void main(String[] args) throws FileNotFoundException {
//        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt";
//        FileInputStream fileInputStream = new FileInputStream(url);
//        Scanner sc = new Scanner(fileInputStream);
//        int T =sc.nextInt();
//        for (int t = 1; t <= T; t++) {
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int[][] a = new int[m][n];
//            // duyet
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    a[i][j]=sc.nextInt();
//                }
//            }
//            //
//            for (int i = 0; i <=m-5; i++) {
//                for (int j = 0; j <=n-5; j++) {
//                    if (a[i][j]==1||a[i][j]==2){
//                        if (i==0||i==m-1||j==0||j==n-1){
//                            if (check(a,i,j)){
//                                System.out.println("YES");
//                                break;
//                            }else {
//                                System.out.println("NO");
//                            }
//                        }
//                        else {
//                            if (check(a,i,j)){
//                                if (a[i-1][j-1]==a[i+5][j+5]||
//                                        a[i][j-1]==a[i][j+5]||
//                                        a[i-1][j]==a[i+5][j]||
//                                        a[i+5][j-1]==a[i-1][j+5]){
//                                    System.out.println("No");
//                                }
//                                else {
//                                    System.out.println("YES");
//                                }
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//    }
//}
