package selahattin.oop.classActivity3A;

public class AdditionOperations {


    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a,double b, double c){
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d){
        return a + b + c+ d;
    }


    public static void main(String[] args) {

        System.out.println(AdditionOperations.add(2, 2));
        System.out.println(AdditionOperations.add(2, 2, 2));
        System.out.println(AdditionOperations.add(2, 2, 3, 5));
    }
}
