package sriza.solidPrinciples.designPattern.singletonPattern;

public class Main {

    public static void main(String[] args) {

        SingletonClass anotherSingleton = SingletonClass.getInstance();


        anotherSingleton.showMessage();

    }
}
