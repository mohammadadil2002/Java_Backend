import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExp{

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//Adding the elements
		
		set.add("Bangalore");
		set.add("Chennai");
		set.add("Delhi");
		set.add("Ahmadabad");
		set.add("Hyderabad");
		set.add("Amritsar");
		
		System.out.println(set);
		// Task - Get city name(s) which starts with 'A'
		// How do you read / iterate the collection / set
		
		for(String element : set) {
			
			if(element.startsWith("A")) { // Processing Logic
				
				System.out.println(element);
			}
		}

		// Using Iterator
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) { // Check if next element is there re not
		
			String element = itr.next(); // read the element
            if(element.startsWith("A")) { // Processing Logic
				
				System.out.println("Cities start with A are : " + element);
			}
		}
	}

}
