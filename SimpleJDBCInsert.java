import java.sql.*;
import java.util.Scanner;

public class SimpleJDBCInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String url = "jdbc:mysql://localhost:3306/mydb";
        String dbUser = "root";
        String dbPass = "Jayraj@9687"; // 🔁 Replace this with your actual password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, dbUser, dbPass);

            // Prepare SQL insert statement
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Execute update
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ User inserted successfully.");
            }

            // Close connections
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
