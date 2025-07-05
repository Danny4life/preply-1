package marayamFundamentals;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        System.out.println("---------------------");

        for (int celsius = 0; celsius <= 100; celsius += 2) {
            double fahrenheit = celsius * 9.0 / 5 + 32;
            System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
        }
    }
}
