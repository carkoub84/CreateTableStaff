import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableStaff {
    public static void main(String[] args) {
        // Database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database"; // Modify the URL as needed
        String username = "your_username";
        String password = "your_password";

        // SQL CREATE TABLE statement
        String createTableSQL = "CREATE TABLE Staff ("
                + "id CHAR(9) NOT NULL,"
                + "lastName VARCHAR(15),"
                + "firstName VARCHAR(15),"
                + "mi CHAR(1),"
                + "address VARCHAR(20),"
                + "city VARCHAR(20),"
                + "state CHAR(2),"
                + "telephone CHAR(10),"
                + "email VARCHAR(40),"
                + "PRIMARY KEY (id))";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {
            // Execute the SQL statement to create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'Staff' created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
