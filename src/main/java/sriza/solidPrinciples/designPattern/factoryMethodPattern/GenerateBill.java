package sriza.solidPrinciples.designPattern.factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {


        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan which the bill will be generated");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.print("Enter the number of units for Bill that will be calculated: ");


        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.println("Bill amount for " + planName + " of " + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
