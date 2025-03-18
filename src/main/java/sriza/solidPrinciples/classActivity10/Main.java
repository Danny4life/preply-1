package sriza.solidPrinciples.classActivity10;

public class Main {
    public static void main(String[] args) {

        Database mysql = new MysqlDb();
        Database postgres = new PostgresDB();

        UserService user1 = new UserService(mysql);
        UserService user2 = new UserService(postgres);


        System.out.println("user 1");
        user1.getUser();

        System.out.println("user 2");
        user2.getUser();
    }
}
