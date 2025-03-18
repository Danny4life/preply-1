package sriza.solidPrinciples.classActivity10;

public class UserService {

    // this is call dependency injection via constructor
    private Database database; // there is no direct instantiation

    public UserService(Database database) {
        this.database = database;
    }

    public void getUser(){
        database.connect();
        System.out.println("Fetching user data...");
    }
}
