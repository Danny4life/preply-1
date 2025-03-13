package billy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/myTestDB";
        String username = "root";
        String password = "PASSword1234!#";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully");

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
