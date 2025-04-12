package verlaClasses.oop.SolidPrinciples.classActivity2;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 5000);

        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Salary: $" + calculator.calculateSalary(emp));

        EmployeeDatabase db = new EmployeeDatabase();
        db.saveToDatabase(emp);
    }
}
