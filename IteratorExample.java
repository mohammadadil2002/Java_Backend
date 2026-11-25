import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String args[]) {
        Map<String, String> product = new HashMap<String, String>();

        product.put("Samsung", "Galaxy Book4");
        product.put("Samsung", "S26 Ultra");
        product.put("Apple", "Macbook M4");
        product.put("Apple", "Iphone 17pro");
        product.put("Redme", "Note 10s");
        product.put("Nokia", "e32");

        Set<Entry<String, String>> entrySet = product.entrySet();

        // Create an Iterator
        Iterator<Entry<String, String>> itr = entrySet.iterator();

        // Iterate the Map
        while (itr.hasNext()) {

            Entry<String, String> entry = itr.next();
            if (entry.getKey().startsWith("S")) {

                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }

    }
}
