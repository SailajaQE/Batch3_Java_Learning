package Sprint3E;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletionHandling extends Logger {
    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner = new Scanner(System.in);
    String query, query1, query2;
    Fillo fillo = new Fillo();
    Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");

    DeletionHandling() throws FilloException {

        System.out.println("*** Select Option *** ");
        System.out.println("1: Delete Record/Terminated ");
        System.out.println("2: Retired Employee Record ");
        System.out.println("---------------------------------");
    }

    public void deleteMenu(int id) {
        String query1 = "delete from team_e_sprint3.emp_data" + " where emp_id=" + id;
        String excel_query1 = "delete from sheet1 where emp_id=" + id;
        try {
            stmt.executeUpdate(query1);
            connection.executeUpdate(excel_query1);
            System.out.println("--------------------------------");
            System.out.println("DELETE is Done: Check DB !");
        } catch (Exception exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
        }
    }

    public void retired(int id) throws SQLException {

        String query1 = "select age from team_e_sprint3.emp_data" + " where emp_id=" + id;
        try {
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                if (rs.getInt(1) >= 60) {
                    deleteMenu(id);
                } else {
                    System.out.println("Employee age is < 60 years....");
                    System.out.println("we cant delete..choose other option....");
                }
            }
        } catch (Exception exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
        }
    }
}



