package ThiLapTrinhSRV.session1;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[][] inputs = {
                {1, 2, 2, 4, 4, 4, 16},
                {2, 2, 2, 2, 4, 4, 4, 4, 1024, 2048, 2048},
                {512, 512, 512, 512, 1024, 1024, 2048, 2048}
        };

        for (int i = 0; i < inputs.length; i++) {
            int[] arr = inputs[i];
            String products = calculateProducts(arr);
            System.out.println(products);
        }
    }

    public static String calculateProducts(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num)+1);
            } else {
                counts.put(num, 1);
            }
        }

        List<Integer> products = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            products.add(num * count);
        }

        Collections.sort(products);
        return products.get(0) + " " + products.get(products.size() - 1);
    }
}