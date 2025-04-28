package designPattern.singletonDesignPattern.classActivity1;

public class Main {

    public static void main(String[] args) {


        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();


        // Test if both objects are the same
        System.out.println(obj1 == obj2);


        obj1.showMessage();
    }
}
