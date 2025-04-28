package designPattern.abstractFactoryPattern;
// Concrete Product
public class ModernSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
    }
}
