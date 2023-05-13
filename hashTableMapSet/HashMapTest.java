package hashTableMapSet;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","A","C","C"};
        Map<String, Integer> myMap = new HashMap<>();
        // key: gai tri cua phan tu trong mang
        // value: so lan xuat hien cua phan tu trong mang
        for (String i: arr) {
            if (myMap.containsKey(i)==false){
                myMap.put(i,1);
            }else {
                // i da xuat hien truoc do
                int soLanXuatHien =myMap.get(i);
                soLanXuatHien++;
                myMap.put(i, soLanXuatHien);
            }
        }
        for (Map.Entry entry: myMap.entrySet()) {
            System.out.println(entry.getKey() +" xuat hien "+ entry.getValue());
        }
    }
}
