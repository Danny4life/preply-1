package mustaphaDesignPatternClass.creationalDesignPattern.singletonDesign.lazySingletonInstantiaion;

public class LazyLoadingSingleton {

    // Step 1 : Declare the instance, but do not initialize it
    private static LazyLoadingSingleton instance;

    // Step 2 : private constructor
    private LazyLoadingSingleton(){
        System.out.println("LazySingleton instance created");
    }

    // Step 3: create the instance only when first accessed
    public static LazyLoadingSingleton getInstance(){
        if(instance == null){
            instance = new LazyLoadingSingleton();

        }

        return instance;
    }

    public void showMessage(){
        System.out.println("My message");
    }


    public static void main(String[] args) {
        System.out.println("Main method started....");

        LazyLoadingSingleton singleton = LazyLoadingSingleton.getInstance();


        LazyLoadingSingleton singleton1 = new LazyLoadingSingleton();
    }
}
