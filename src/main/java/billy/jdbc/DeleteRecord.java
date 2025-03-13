package billy.jdbc;

import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/myTestDB";
        String username = "root";
        String password = "PASSword1234!#";

        String deleteQuery = "DELETE FROM users_tbl WHERE ID = ?";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stm = conn.prepareStatement(deleteQuery)){

           stm.setInt(1, 1);
           stm.executeUpdate();
            System.out.println("Record Deleted Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
