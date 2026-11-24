
import java.util.Comparator;
import java.util.TreeSet;

// Employee class
class Employee {

    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

// Comparator class
class FirstNameComperator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.firstName.compareTo(e2.firstName);
    }
}

// Main class
public class ComparatorExp {

    public static void main(String[] args) {

        Employee e1 = new Employee("Mohammad", "Adil");
        Employee e2 = new Employee("Haris", "Qamar");
        Employee e3 = new Employee("Sachin", "Gautam");

        TreeSet<Employee> ts =
                new TreeSet<Employee>(new FirstNameComperator());

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);

        for (Employee e : ts) {
            System.out.println(e.firstName + " and " + e.lastName);
        }
    }
}