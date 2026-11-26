import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenetHashMapExp {
    public static void main(String args[]) {
        ConcurrentHashMap<String, String> products = new ConcurrentHashMap<>();
        products.put("Samsung", "S24 Ultra");
        products.put("Apple", "Iphone 17pro");
        for (String key : products.keySet()) {
            products.put("Nokia", "Nokia 3310");
            System.out.println(key);

        }

        System.out.println(products);
    }
}
