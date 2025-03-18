package sriza.solidPrinciples.classActivity10;

public class MysqlDb implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to MYSQL DB....");
    }
}
