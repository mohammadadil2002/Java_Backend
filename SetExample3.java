class Person{
	
	String firstName;
	String lastName;
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	
	public boolean equals(Object obj2) {
		Person p2 = (Person) obj2;
		return this.firstName.equals(p2.firstName) && this.lastName.equals(p2.lastName);
		
	}
	
	@Override
	public int hashCode() {
		
		return this.firstName.hashCode() + this.lastName.hashCode();
	}
}

public class SetExample3{
	
	public static void main(String[] args) {
	
		// Object are same hashCode are same;
		Person p1 = new Person("Ajay", "Kumar");
		Person p2 = new Person("Ajay", "Kumar");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() + " and " + p2.hashCode());

	}
    
}