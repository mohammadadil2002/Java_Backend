import java.util.HashSet;
import java.util.Set;

class Employee{
	
	String name;

	public Employee(String name) {
		
		super();
		this.name = name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
		
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
	
}

public class SetExample4 {

	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<String>();
		
		cities.add("Bangalore");
		cities.add("Chennai");
		cities.add("Bangalore");
		
		System.out.println(cities);
		System.out.println(cities.size());

		Set<Employee> emps = new HashSet<Employee>();
		Employee e1 = new Employee("Rajesh");
		Employee e2 = new Employee("Suresh");
		Employee e3 = new Employee("Nitish");
		Employee e4 = new Employee("Rajesh");
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4); 
	
		System.out.println(emps.size());
		System.out.println(e1.hashCode() + " and " + e4.hashCode() + " and e1 and e4 are same ? " + e1.equals(e4) );
		
	}
	
	

}
