package week3Curriculum.classActivity8;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } finally {
            System.out.println("This block always runs.");
        }

        System.out.println("Print me please");
    }


//    public static void main(String[] args) {
//
//            int result = 10 / 0; // ArithmeticException
//
//        System.out.println(result);
//
//        System.out.println("Print me please");
//
//    }
}
