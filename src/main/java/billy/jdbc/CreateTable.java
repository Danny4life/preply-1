package billy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myTestDB";
        String username = "root";
        String password = "PASSword1234!#";


        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement()){

            String sql = "CREATE TABLE users_tbl (ID INT PRIMARY KEY, Name VARCHAR(50), Balance Double)";

            stm.executeUpdate(sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
