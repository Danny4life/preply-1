package billy.jdbc;

import java.sql.*;

public class FetchData {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/myTestDB";
        String username = "root";
        String password = "PASSword1234!#";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement()){

            String sql = "SELECT * FROM users_tbl";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                double balance = rs.getDouble("Balance");

                System.out.println("ID: " + id + ", Name: " + name + ", Balance: " + balance);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
