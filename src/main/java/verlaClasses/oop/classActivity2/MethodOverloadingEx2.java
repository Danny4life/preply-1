package verlaClasses.oop.classActivity2;

public class MethodOverloadingEx2 {

    public static int multiplyNumbers(int a, int b){
        return  a * b;
    }

    public static double multiplyNumbers(double a, double b){
        return a * b;
    }


    public static void main(String[] args) {

        System.out.println(multiplyNumbers(3,3));
        System.out.println(multiplyNumbers(3.0, 3.0));
    }
}
