package verlaClasses.oop.SolidPrinciples.classActivity1;

public class Employee {

    String name;

    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Business logic
    public double calculateSalary(String name, double salary){
        return salary * 1.1;
    }


    // Persistence Logic
    public void saveToDatabase(){
        System.out.println("Saving " + name + " to the database.");
    }
}
