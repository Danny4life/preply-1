package verlaClasses.oop.classActivity2;

public class MethodOverloading {

    private String name; // Encapsulation

    public static int addNumbers(int num1, int num2){
        return num1 + num2;

    }

    public static int addNumbers(int num1, int num2, int num3){
        return num1 + num2 + num3;

    }

    public static int addNumbers(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;

    }


    public static void main(String[] args) {

        addNumbers(2,3);
        addNumbers(2,3,4);
        addNumbers(2,3,4,5);
    }
}
