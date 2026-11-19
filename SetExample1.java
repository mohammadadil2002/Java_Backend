import java.util.HashSet;
import java.util.Set;

class Employee{

    String name;
    
    public Employee(String name) {
        this.name = name;
    }

    @Override 

    public int hashCode() {
        return 12344321;

    }

}

public class SetExample1 {

    public static void main(String args[]) {
        
        Set<Employee> employees = new HashSet<Employee>();
        
        Employee emp1 = new Employee("john");
        Employee emp2 = new Employee("Augastya" );
        
        System.out.println(emp1.hashCode() + " and " + emp1.hashCode());
        
        employees.add(emp1);
        employees.add(emp2);

        int hash = emp1.hashCode();
        hash = hash ^ (hash >>> 16);
        int bucketIndes = (16 - 1) & hash;
        System.out.println("emp1 stored at " + bucketIndes);
        System.out.println("Size : " +employees.size());
    }
}