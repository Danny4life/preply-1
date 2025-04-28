package designPattern.singletonDesignPattern.classActivity1;

public class Singleton {

    //Step 1 -- static instance of the class
    private static Singleton instance;

    // Step 2 -- private constructor to prevent instantiation
    private Singleton(){
        System.out.println("Singleton Instance Created!");
    }

    // Step 3 -- public method to provide access to the instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton!");
    }
}
