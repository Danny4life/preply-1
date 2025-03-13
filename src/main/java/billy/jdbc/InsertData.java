package billy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myTestDB";
        String username = "root";
        String password = "PASSword1234!#";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement()){

            String sql = "INSERT INTO users_tbl (ID, Name, Balance) VALUES (1, 'John', 5000.0)";

            stm.executeUpdate(sql);
            System.out.println("Record inserted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
