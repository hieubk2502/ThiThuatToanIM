package dailyLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static class Node implements Comparable{
        int value;
        int frequency;
        Node( int value, int frequency){
            this.value =value;
            this.frequency =frequency;
        }

        @Override
        public int compareTo(Object o) {
            Node other = (Node) o;
            if (this.frequency ==((Node) o).frequency){
                return -Integer.compare(this.value,other.value);
            }
            return Integer.compare(this.frequency,other.frequency);
        }
    }
    public static int[] sortFrequence(int[] a){
        int[] count = new int[10];
        int c =0;
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        List<Node> mList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (count[i]!=0){
                Node newNode =new Node(i,count[i]);
                mList.add(newNode);
            }
        }
        Collections.sort(mList);
        int[] results = new int[a.length];
        int id =0;
        for (Node node:mList) {
            int freq = node.frequency;
            int val= node.value;
            for (int i = 0; i < freq; i++) {
                results[id] =val;
                id++;
            }
        }
        return results;
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,2,2,3,3,4};
        sortFrequence(a);
    }
}
