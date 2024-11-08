package DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   private static final String URL = "jdbc:mysql://srv1553.hstgr.io:3306/u628307016_CRM";
    private static final String USER = "u628307016_admin";
    private static final String PASSWORD = "Afhcrmscd12*";
    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("DB connection successful!");
        } catch (SQLException e) {
            System.out.println("DB connection failed: " + e.getMessage());
        }
        return conn;
    }
}
