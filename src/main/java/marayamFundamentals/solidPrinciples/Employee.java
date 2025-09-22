package marayamFundamentals.solidPrinciples;


// BAD - BAD CODE
public class Employee {

    String name;

    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary(){ // This is a business logic
        return salary * 1.1;
    }

    public void saveToDatabase(){ // This is a persistence logic
        System.out.println("saving " + name + " to the database.");
    }
}
