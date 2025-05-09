package week3Curriculum.classActivity9;

public class CustomExceptionExample {

    public static void checkAge(int age) throws AgeTooLowException{

        if(age < 18){
            throw new AgeTooLowException("Age must be at least 18.");
        }
        System.out.println("You are eligible!");
    }


    public static void main(String[] args) {
        try{
            checkAge(15);
        } catch (AgeTooLowException e) {
            System.out.println("Custom Exception: " + e.getMessage());        }
    }
}
