package sriza.solidPrinciples.designPattern.singletonPattern;

public class SingletonClass {

    //Step 1. Private static instance of the class
    private static SingletonClass instance;

    // Step 2. Private constructor to prevent class instantiation
    private SingletonClass() {
        System.out.println("Singleton instance created");
    }


    //Step 3. public method to provide a point of access to the singleton class
    public static  SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();

        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton class");
    }
}
