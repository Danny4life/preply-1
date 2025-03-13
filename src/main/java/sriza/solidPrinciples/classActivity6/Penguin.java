package sriza.solidPrinciples.classActivity6;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    void swim(){
        System.out.println(name + " is swimming in water");
    }
}
