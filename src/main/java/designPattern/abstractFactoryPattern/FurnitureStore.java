package designPattern.abstractFactoryPattern;

public class FurnitureStore {
    private Chair chair;

    private Sofa sofa;

    public FurnitureStore(FurnitureFactory factory) {
       chair = factory.createChair();
       sofa = factory.createSofa();
    }

    public void describeFurniture(){
        chair.sitOn();
        sofa.lieOn();
    }


    public static void main(String[] args) {

        FurnitureFactory factory = new MordernFurnitureFactory();
        FurnitureStore store = new FurnitureStore(factory);
        store.describeFurniture();

        System.out.println("Switching to Victorian style...");

        factory = new VictorianFurnitureFactory();
        store = new FurnitureStore(factory);
        store.describeFurniture();
    }
}
