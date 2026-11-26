import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class CopyOnWriteExp {

    public static void main(String args[]) {

        List<String> products = new CopyOnWriteArrayList<String>();

        products.add("Samsung");
        products.add("Apple");
        products.add("LG");
        products.add("Nokia");

        Iterator<String> itr = products.iterator();

        while(itr.hasNext()){
            String element = (String) itr.next();

            products.remove("Samsung");

            System.out.println("Remove the junk element");

        }

        System.out.println(products);

    }

}
