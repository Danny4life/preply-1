package sriza.solidPrinciples.designPattern.singletonPattern.lazyInitialization;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton Instance Created!");
    }

    private static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("My message");
    }

    public static void main(String[] args) {
        System.out.println("Main method started...");

        LazySingleton singleton = LazySingleton.getInstance();
    }
}
