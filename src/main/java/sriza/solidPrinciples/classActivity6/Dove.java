package sriza.solidPrinciples.classActivity6;

public class Dove extends Bird implements Flyable{
    public Dove(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is a flying bird");
    }
}
