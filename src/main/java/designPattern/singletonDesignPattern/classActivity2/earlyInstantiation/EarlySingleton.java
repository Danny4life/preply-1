package designPattern.singletonDesignPattern.classActivity2.earlyInstantiation;

public class EarlySingleton {

    private static final EarlySingleton instance = new EarlySingleton();

    private EarlySingleton(){
        System.out.println("Early Singleton Instance Created!");
    }

    public static EarlySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("My Message");
    }


    public static void main(String[] args) {
        System.out.println("Main method started...");


    }
}
