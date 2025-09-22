package marayamFundamentals.solidPrinciples.activity2;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 50000);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Salary: $" + salaryCalculator.calculateSalary(employee));


        EmployeeDatabase db = new EmployeeDatabase();
        db.saveToDatabase(employee);
    }
}
