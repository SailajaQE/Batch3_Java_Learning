package Sprint3TeamE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
    public static Statement getDatabase() {
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://Localhost:3306/team_e_sprint3", "root", "TeamE01!");
            stmt = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stmt;
    }
}
