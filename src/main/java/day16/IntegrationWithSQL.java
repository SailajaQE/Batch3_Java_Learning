package day16;

//import com.codoid.products.fillo.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class IntegrationWithSQL {

           public void insertRecord ( int stuId, String stuName, String grade,int age)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student", "root", "TeamE01!");

                Statement stmt = ((java.sql.Connection) con).createStatement();
               // String query1 = "Select * from student.new_table";
                String query1 = "INSERT INTO student.new_table " + "VALUES (" + stuId + ", '" + stuName + "', '" + grade + "', " + age + ")";
                stmt.executeUpdate(query1);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
