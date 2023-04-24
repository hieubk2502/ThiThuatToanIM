package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KiemtraSudoku {
    // check row k
    public static boolean checkRow(char[][] a,int k){
        boolean[] appeared = new boolean[a.length+1];// da xuat hien
        for (int i = 0; i < a.length; i++) {
            char c =a[k][i];
            if (c!='.'){
                int c_int = (int)c-(int)('0');
                if (appeared[c_int]==true){
                    return false;
                }
                appeared[c_int]=true;
            }
        }

        return true;
    }
    public static boolean checkCol(char[][] a, int k){
        boolean[] appeared = new boolean[a.length+1];
        for (int i = 0; i < 9; i++) {
            char c =a[i][k];// check cot
            if (c!='.'){
                int c_int = (int)c-(int)'0';
                if (appeared[c_int]==true){
                    return false;
                }
                appeared[c_int] = true;
            }
        }
        return true;
    }
    // ktra block 3x3 from(i,j)
    public static boolean checkBlock3x3(char[][] a, int i0,int j0){
        int i_end = i0+3;
        int j_end = j0+3;
        boolean[] appeared  = new boolean[a.length+1];
        for (int i=i0; i < i_end; i++) {
            for (int j=j0; j < j_end; j++) {
                char c  = a[i][j];
                if (c!='.'){
                    int c_int  = (int)c-(int)'0';
                    if (appeared[c_int]==true){
                        return false;
                    }
                    appeared[c_int]=true;
                }
            }
        }
        return true;
    }

    public static int isValidSudoku(char[][] a){
        // kiem tra row
        for (int i = 0; i < a.length; i++) {
            boolean[] appeared1 = new boolean[a.length+1];
            for (int i1 = 0; i1 < 9; i1++) {
                char c =a[i1][i];// check cot
                if (c!='.'){
                    int c_int = (int)c-(int)'0';
                    if (appeared1[c_int]==true){
                        return -1;
                    }
                    appeared1[c_int] = true;
                }
            }
            // kiem tra row
            boolean[] appeared2 = new boolean[a.length+1];
            for (int i2 = 0; i2 < 9; i2++) {
                char c =a[i2][i];// check cot
                if (c!='.'){
                    int c_int = (int)c-(int)'0';
                    if (appeared2[c_int]==true){
                        return -1;
                    }
                    appeared2[c_int] = true;
                }
            }
        }
        // ktra block 3x3
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                if (checkBlock3x3(a,i,j)==false){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        char[][] board = new char[9][9];
        for (int t = 1; t <= T; t++) {
            for (int i = 0; i < 9; i++) {
                String line =sc.next();
                for (int j = 0; j < 9; j++) {
                    board[i][j]=line.charAt(j);
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("#" +t+" "+isValidSudoku(board));
        }
    }
}
