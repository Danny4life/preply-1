package sriza.solidPrinciples.classActivity1;

public class Employee {

    String name;

    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Business logic
    public double calculateSalary(){
        return salary * 1.1;
    }

    // persistence logic
    public void saveToDatabase(){
        System.out.println("Saving " + name + " to the database");
    }
}
