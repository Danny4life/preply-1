package mustaphaDesignPatternClass.creationalDesignPattern.singletonDesign;

public class SingletonEx {

    private static SingletonEx instance;

    private SingletonEx(){
        System.out.println("Singleton instance created");
    }

    public static SingletonEx getInstance(){
        if(instance == null){
            instance = new SingletonEx();
        }

        return instance;
    }
}
