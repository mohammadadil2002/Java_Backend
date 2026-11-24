import java.util.TreeSet;

class Employeee implements Comparable<Employeee> {

    String name;
    int salary;

    public Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employeee e2) {

        // Sorting by name in descending order
        return e2.name.compareTo(this.name);
    }

    @Override
    public String toString() {
        return name + " and " + salary;
    }
}

public class ComparableExp {

    public static void main(String[] args) {

        Employeee e1 = new Employeee("Adil", 34000);
        Employeee e2 = new Employeee("Sachin", 22000);
        Employeee e3 = new Employeee("Sadique", 45000);
        Employeee e4 = new Employeee("Haris", 15000);

        TreeSet<Employeee> ts = new TreeSet<>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);

        System.out.println(ts);

        for (Employeee e : ts) {
            System.out.println(e.name + " and " + e.salary);
        }
    }
}