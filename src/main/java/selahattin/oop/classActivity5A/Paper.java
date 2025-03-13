package selahattin.oop.classActivity5A;

public class Paper implements Print, Ink{
    @Override
    public void print() {
        System.out.println("Printing paper...");
    }

    @Override
    public void ink() {
        System.out.println("Inking a paper");
    }
}
