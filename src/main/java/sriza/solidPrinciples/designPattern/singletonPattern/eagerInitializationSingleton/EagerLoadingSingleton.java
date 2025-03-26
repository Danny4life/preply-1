package sriza.solidPrinciples.designPattern.singletonPattern.eagerInitializationSingleton;

public class EagerLoadingSingleton {


    // Create the instance immediately at class loading
    private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

    private EagerLoadingSingleton() {
        System.out.println("EagerSingleton Instance Created!");
    }

    public static EagerLoadingSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("My Message");
    }

    public static void main(String[] args) {

        System.out.println("Main method started...");

        //EagerLoadingSingleton singleton = EagerLoadingSingleton.getInstance();
    }
}
