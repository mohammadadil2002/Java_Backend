import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample{

    public static void main(String args[]){

        Set<String> set = new HashSet<String>();

        set.add("Apple");
        set.add("Samsung");

        System.out.println(set);

        Iterator<String> itr =  set.iterator();

        while(itr.hasNext()){

            String element = itr.next();
            System.out.println("Element are : " + element);

        }

        Map<String, String> stateAndCity = new HashMap<String, String>();

        stateAndCity.put("Kernatka", "Bangalore");
        stateAndCity.put("Telangana", "Hyderabad");
        stateAndCity.put("Maharastra", "Mumbai");
        stateAndCity.put("Tamilnadu", "Chennai");
        stateAndCity.put("Gujrat", "Ahmadabad");
        stateAndCity.put("Gujrat", "Ahmadabad"); // Duplicate Keys are not allowed.

        System.out.println(stateAndCity);
        System.out.println(stateAndCity.get("Maharastra")); // O(1).

        // How does HashMAp works Internally OR how put method works / how get works.

        // Covert the Map into SetEntry.
        Set<Entry<String, String>> entrySet = stateAndCity.entrySet();

        // Convert the EntrySet into the Iterator.
        Iterator<Entry<String,String>> itr1 = entrySet.iterator();

        //Iterate it.
        while(itr1.hasNext()){
            Entry<String, String> entry = itr1.next();
            System.out.println(entry.getKey() + " and " + entry.getValue());
        }
    }
}