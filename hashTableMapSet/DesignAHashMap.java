package hashTableMapSet;

import java.util.ArrayList;
import java.util.Objects;

//706
public class DesignAHashMap {
    private class Data{
        int key;
        int value;
        Data(int key, int value){
            this.key =key;
            this.value=value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return key == data.key && value == data.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
    private final int SIZE =1000;
    private ArrayList<Data> myBuckets[];
    public DesignAHashMap(){
        myBuckets=new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int hasFunction(int key){
        return key%1000;
    }

    public void put(int key, int value){
        int hashValueIndex = hasFunction(key);
        var bucket= myBuckets[hashValueIndex];
        Data temp = new Data(key, value);
        int keyIndex =bucket.indexOf(temp);
        if (keyIndex>=0){
            bucket.get(keyIndex).value=value;
        }
        bucket.add(temp);
    }

    public void remove(int key){
        int hashValueIndex = hasFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDeleteData = new Data(key,0);
        bucket.remove(myDeleteData);
    }

    public int get(int key){
        int hashValueIndex = hasFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key,0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex>=0){
            return bucket.get(keyIndex).value;
        }

        return -1;
    }

    public static void main(String[] args) {
        DesignAHashMap designAHashMap=new DesignAHashMap();
        designAHashMap.put(1,1);
        designAHashMap.put(1,2);
    }
}
