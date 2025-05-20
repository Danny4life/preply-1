package verlaClasses.week3.classActivity8;

public class ExceptionHandling {

    public static void main(String[] args) {


        try{
            int result = 10 / 0;


        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
            throw new RuntimeException(e);
        }finally {
            System.out.println("This block always run");
        }

        System.out.println("Please print me");
    }
}
