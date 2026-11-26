import java.util.HashMap;

public class HashMapExp {
    public static void main(String args[]) {
        HashMap<Integer, String> products = new HashMap<>();

        products.put(1, "Samsung");
        products.put(2, "Apple");
        for (Integer key : products.keySet()) {
            products.put(3, "Nokia");

            System.out.println(key);
        }
    }
}
