package sriza.solidPrinciples.classActivity10;

public class PostgresDB implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to Postgre DB....");
    }
}
