import java.sql.*;
import java.util.Scanner;

public class jdbcTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        String url = "jdbc:mysql://localhost:3306/testdb";
        String dbUser = "root";  // change if different
        String dbPassword = "your_mysql_password";  // replace with your password

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);

            // Prepare SQL insert
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user);
            stmt.setString(2, pass);

            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ User inserted successfully!");
            } else {
                System.out.println("❌ Insert failed.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
