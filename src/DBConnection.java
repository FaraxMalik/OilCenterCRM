import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://crm.cj8wgw6c6hal.ap-south-1.rds.amazonaws.com:3306/CRM?zeroDateTimeBehavior=CONVERT_TO_NULL&encrypt=true&trustServerCertificate=true";
    private static final String USER = "####";
    private static final String PASSWORD = "####";

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
