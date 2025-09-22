package marayamFundamentals.oop.methodOverloading;

public class MethodOverloadingEx {

    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    void add(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }

    public static int multiplyNumbers(int a, int b){
        return a * b;
    }

    public static double multiplyNumbers(double a, double b){
        return a * b;
    }
}
