

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<String>(); 

		cities.add("Bangalore");
		cities.add("Chennai");
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Vizag");
		cities.add("Lucknow");
		cities.add("Heryana");
		cities.add("Wrangle");
		cities.add("varansi");
		cities.add("Aligarh");
		cities.add("Bhopal");
		
		System.out.println(cities);
		
		cities.add("Kolkata");
		
		System.out.println(cities);
	}

}
