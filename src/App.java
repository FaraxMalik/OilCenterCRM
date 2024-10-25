import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String testQuery = "select * from Customer";

        try (Connection con = DBConnection.getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(testQuery)){

            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                int id = res.getInt("customerID");
                String name = res.getString("CustomerName");
                String phone = res.getString("PhoneNumber");
                String address= res.getString("Address");

                System.out.println(id+","+name+","+phone+","+address);
            }

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
