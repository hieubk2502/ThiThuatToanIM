package dailyLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _1636_SortArrayByIncreasingFrequency {

    public static class Node implements Comparable {
        int value;
        int freq;
        Node(int v, int f){
        this.value =v;
        this.freq=f;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Node){
                Node other =(Node) o;
                if (this.freq==other.freq){
                    return -Integer.compare(this.value,other.value);
                }
                return Integer.compare(this.freq,other.freq);
            }
            return 0;
        }
    }
    public static int[] frequencySort(int[] a){
        int ADD_VALUE=100;
        int MAX_VALUE = 100+ ADD_VALUE;
        // so lan xuat hien cua i trong mang
        int[] count=new int[MAX_VALUE+1];
        // B0: dem so lan xuat hien cua cac phan tu
        for (int i = 0; i < a.length; i++) {
            int convertedValue =a[i] +ADD_VALUE;
            count[convertedValue]++;
        }
        List<Node> mList = new ArrayList<>();
        for (int convertedValue = 100; convertedValue <=MAX_VALUE; convertedValue++) {
           if (count[convertedValue]>0){
               int orgiginValue =convertedValue -ADD_VALUE;
               Node newNode = new Node(orgiginValue,count[convertedValue]);
               mList.add(newNode);
           }
        }
        Collections.sort(mList);
        int[] results = new int[a.length];
        int indexResults =0;
        for (Node node:mList) {
            int freq =node.freq;
            int value =node.value;
            for (int i = 0; i < freq; i++) {
                results[indexResults]=value;
                indexResults++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] a={1,1,1,2,2,2,2,3,3,4};
        frequencySort(a);
    }


}
