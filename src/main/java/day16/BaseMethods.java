package day16;

//import com.codoid.products.fillo.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseMethods {
    public void insertRecord(int stuId, String stuName, String stuGrade, int stuAge) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root", "TeamE01!");

            Statement stmt = ((java.sql.Connection) con).createStatement();
            //String query1 = "Select * from student.new_table";
            String query1 = "INSERT INTO student.new_table " + "VALUES (" + stuId + ", '" + stuName + "', '" + stuGrade + "', " + stuAge + ")";
            stmt.executeUpdate(query1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void selectRecord(int stuId, String stuName, String stuGrade, int stuAge)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student", "root", "TeamE01!");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from student.new_table");
                while (rs.next())
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    public void deleteRecord(int sId, String sName, String sGrade, int sAge)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root", "TeamE01!");
            Statement stmt = con.createStatement();
            String query1 = "delete from student.new_table" + " where stuId=113";

            stmt.executeUpdate(query1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void updateRecord(int stuId, String stuName, String stuGrade, int stuAge)
            {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root", "TeamE01!");
            Statement stmt = con.createStatement();
            String query1 = " update student.new_table set stuName='sailajaQE'" + " where stuId=161";
           // ResultSet rs = stmt.executeQuery(" update student.new_table set stuName='sailaja'" + " where stuId=103");
            stmt.executeUpdate(query1);
           // while (rs.next())
             //   System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            //con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }

