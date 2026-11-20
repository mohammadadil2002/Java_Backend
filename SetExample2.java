class Person{
	
	private String name;
	
	public Person (String name) {
		
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 43245676;
		
	}
	
}


public class SetExample2 {

	public static void main(String[] args) {

		// Contract#1 : If two Objects are equal the hash code must be same;
		String s1 = "Mohammad";
		String s2 = "Mohammad";
		
		System.out.println(s1.hashCode() + " and " + s2.hashCode());

		//Contract#2 : If two Objects return same hash code, Object may or may not equal;
		Person p1 = new Person("Ajay");
		Person p2 = new Person("Vijjay");
		
		System.out.println(p1.hashCode() + " and " + p2.hashCode() + " is p1 and p2 equal?" +p1.equals(p2));
	}
	
}
