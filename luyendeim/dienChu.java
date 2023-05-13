package luyendeim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dienChu {
    static  int count =0;
    static int sumNgang =0;
    static int sumCot =0;
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\luyendeim\\input.txt");
        Scanner scanner = new Scanner(fileInputStream);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int k = scanner.nextInt();
            char[][] a = new char[row][col];
            String[] s = new String[k];
            for (int i = 0; i < row; i++) {
                String line = scanner.next();
                for (int j = 0; j < col; j++) {
                    a[i][j] = line.charAt(j);
                }
            }
            for (int i = 0; i < k; i++) {
                s[i]= scanner.next();
            }
            while (count<k){
                for (int cot = 0; cot < col; cot++) {
                    duyetcot(a,s,cot);
                }
                // duyet hang
                for (int hang = 0; hang < row; hang++) {
                    duyethang(a,s,hang);
                }
            }
            // duyet cot
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("sumNgang: " +sumNgang+"sumCot: " +sumCot);
        }
    }

    private static void duyetcot(char[][] a, String[] s, int cot) {
        // tim cuoi can dien co chu dai nhat
        int start = 0;
        int stop=0;
        int index =-1;
        char[] tmp = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            tmp[i]=a[i][cot];
        }
        int max =1;
        boolean is =false;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] =='*'){
                continue;
            }
            is= false;
            int indexCur=-1;
            int count=1;
            for (int j = i+1; j < tmp.length; j++) {
                if (tmp[j] !='*'){
                    count++;
                    if (tmp[j] !='-'){
                         indexCur=j;
                    }
                    if (tmp[j] =='-'){
                        is=true;
                    }
                }
                else{
                    break;
                }
            }
            if (max<count&&is ==true){
                max=count;
                start = i;
                stop = start+max-1;
                index = indexCur-start;
            }
        }
//       System.out.println("cot : "+cot +"--start: "+  start+"-> "+stop+" gia tri index: "+index);
        if (index >=0){
            for (int i = 0; i < s.length; i++) {
                if (s[i].length()==max){
                    if (s[i].charAt(index)==a[start+index][cot]){
                        for (int j = 0; j < s[i].length(); j++) {
                            a[start+j][cot] =s[i].charAt(j);
                        }
                        count++;
                        sumCot+=i;
                    } else if (s[i].charAt(s[i].length()-1-index)==a[start+index][cot]) {
                        for (int j = 0; j <s[i].length(); j++) {
                            a[stop-j][cot] =s[i].charAt(j);
                        }
                        count++;
                        sumCot+=i;
                    }

                }
            }
        }
    }
    private static void duyethang(char[][] a, String[] s, int hang) {
        // tim cuoi can dien co chu dai nhat
        int start = 0;
        int stop=0;
        int index =-1;
        char[] tmp = new char[a[0].length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=a[hang][i];
        }
        int max =1;
        boolean is =false;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] =='*'){
                continue;
            }
            //
            is= false;
            int indexCur=-1;
            int count=0;
            for (int j = i; j < tmp.length; j++) {
                if (tmp[j] !='*'){
                    count++;
                    if (tmp[j] !='-'){
                        indexCur=j;
                    }
                    if (tmp[j] =='-'){
                        is=true;
                    }
                }
                else{
                    break;
                }
            }
            if (max<count&&is ==true){
                max=count;
                start = i;
                stop = start+max-1;
                index = indexCur-start;
            }
        }
//        System.out.println("cot : "+hang +"--start: "+  start+"-> "+stop+" gia tri index: "+index);
        if (index >=0){
            for (int i = 0; i < s.length; i++) {
                if (s[i].length()==max){
                    if (s[i].charAt(index)==a[hang][start+index]){
                        for (int j = 0; j < s[i].length(); j++) {
                            a[hang][start+j] =s[i].charAt(j);
                        }
                        count++;
                        sumNgang+=i;
                    } else if (s[i].charAt(s[i].length()-1-index)==a[hang][start+index]) {
                        for (int j = 0; j <s[i].length(); j++) {
                            a[hang][stop-j] =s[i].charAt(j);
                        }
                        count++;
                        sumNgang+=i;
                    }
                }
            }
        }
    }
}
//1
//10 10 5
//**********
//***-******
//*---******
//*-*-******
//*-**------
//*-**-*****
//*LIFE*****
//*-********
//**********
//**********
//END
//DESIDE
//MAVELF
//MAP
//APA
