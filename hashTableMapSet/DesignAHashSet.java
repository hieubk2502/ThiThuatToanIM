package hashTableMapSet;

import java.util.ArrayList;

// 705 Design Hash Set
public class DesignAHashSet {
    private final int SIZE =1000;
    private ArrayList<Integer> myBuckets[];
    DesignAHashSet(){
        myBuckets =new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] =new ArrayList<>();
        }
    }
    // return hashValue
    private int hashFunction(int key){
        return key %SIZE;
    }

    private void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex<0){
            bucket.add(key);
        }
    }

    public void remove(int key){
        int hasValueIndex = hashFunction(key);
        var bucket = myBuckets[hasValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex>=0){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key){
        int hasValueIndex = hashFunction(key);
        var bucket = myBuckets[hasValueIndex];
        int keyIndex = bucket.indexOf(key);
        return key>=0;
    }

    public static void main(String[] args) {
        DesignAHashSet designAHashSet = new DesignAHashSet();
        designAHashSet.add(5);
        designAHashSet.add(1005);
    }
}
