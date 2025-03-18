package sriza.solidPrinciples.classActivity9;

public class UserService {

    private MysqlDataBase database = new MysqlDataBase();
    private PostgreSQL database2 = new PostgreSQL();


    public void getUser(){
      database.connect();
      database2.connect();

        System.out.println("Fetching user data....");
    }


}
