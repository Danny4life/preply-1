package designPattern.singletonDesignPattern.classActivity2.lateInstantiation;

public class LazySingleton {

    // We are declaring the instance, but we do not initialize it
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("Lazy Singleton Instance Created!");
    }

    public static LazySingleton getInstance(){

        if (instance == null){
            instance = new LazySingleton();

        }

        return instance;
    }

    public void showMessage(){
        System.out.println("My Message");
    }

    public static void main(String[] args) {

        System.out.println("Main method started...");

        LazySingleton singleton = LazySingleton.getInstance();
    }



}
