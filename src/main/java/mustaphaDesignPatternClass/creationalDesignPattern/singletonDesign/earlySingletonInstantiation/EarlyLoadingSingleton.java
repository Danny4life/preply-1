package mustaphaDesignPatternClass.creationalDesignPattern.singletonDesign.earlySingletonInstantiation;

public class EarlyLoadingSingleton {

    // Step 1 : Create the instance immediately at class loading
    private static final EarlyLoadingSingleton instance = new EarlyLoadingSingleton();

    // Step 2: private constructor to prevent instantiation
    private EarlyLoadingSingleton(){
        System.out.println("Early Instance Created");
    }

    //Step 3 : create public method to return the instance
    public static EarlyLoadingSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("My message");
    }

    public static void main(String[] args) {

        System.out.println("Main method started...");



    }

}
