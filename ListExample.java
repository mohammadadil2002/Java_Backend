import java.util.ArrayList;
import java.util.List;


public class ListExample {
    public static void main(String args[]){

        List<String> products = new ArrayList<String>();

        products.add("Samsung");
        products.add("Apple");
        products.add("Redme");
        products.add("Nokia");
        products.add("Realme");

        System.out.println(products);

        for(String product : products){
            if(product.startsWith("S")){
                products.remove(product);

                System.out.println(products);
            }
        }

    }
    
}
