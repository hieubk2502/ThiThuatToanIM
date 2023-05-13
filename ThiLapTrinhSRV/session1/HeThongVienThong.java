package ThiLapTrinhSRV.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeThongVienThong {
    public static double distance(int x1,int y1, int x2, int y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static int countUncoveredHouses(char[][] arr){
        int uncoveredHouses =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 'H') {
                    boolean covered = false;
                    int startX = Math.max(0, i - 3);
                    int endX = Math.min(arr.length - 1, i + 3);
                    int startY = Math.max(0, j - 3);
                    int endY = Math.min(arr[0].length-1, j + 3);

                    for (int x = startX; x <= endX; x++) {
                        for (int y = startY; y <= endY; y++) {
                            if (arr[x][y]=='X'||arr[x][y]=='H'){
                                continue;
                            }
                            if(arr[x][y]=='C'){
                               if (distance(x,y,i,j)==3||distance(x,y,i,j)==2||distance(x,y,i,j)==1){
                                   covered=true;
                                   break;
                               }
                           } else if (arr[x][y]=='B') {
                               if (distance(x,y,i,j)==2||distance(x,y,i,j)==1){
                                   covered=true;
                                   break;
                               }
                           } else if (arr[x][y]=='A') {
                               if (distance(x,y,i,j)==1){
                                   covered=true;
                                   break;
                               }
                           }
                        }
                        if (covered) {
                            break;
                        }
                    }
                    if (!covered) {
                        uncoveredHouses++;
                    }
                }
            }
        }
        return uncoveredHouses;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\CTDLvaTT\\FindThe3rdLargestNumber\\src\\ThiLapTrinhSRV\\session1\\docfile.txt";
        FileInputStream fileInputStream= new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int rows = sc.nextInt();
            int cols =sc.nextInt();
            char[][] arr = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                String line = sc.next();
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = line.charAt(j);
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int uncoveredHouse =countUncoveredHouses(arr);
            System.out.println("#"+t+" "+uncoveredHouse);
        }
    }
}
