package Sprint3TeamE;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deletion extends Logger implements BaseMethods{
    Statement stmt = DatabaseConnection.getDatabase();
    @Override
    public void deleteRecord() throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");

        Scanner scanner=new Scanner(System.in);
        String query1,query2;
        System.out.println("Enter emp_id you would like to delete ");
        int id = Integer.parseInt(scanner.nextLine());

        query1 ="select * from team_e_sprint3.emp_data";
        query2 = "delete from team_e_sprint3.emp_data" + " where emp_id="+id;
        String excel_query1=" delete from sheet1 where emp_id="+id;

        try {
             ResultSet rs=stmt.executeQuery(query1);
            while (rs.next())
            {
                if (rs.getInt(1) == id)
                {
                    stmt.executeUpdate(query2);
                    connection.executeUpdate(excel_query1);
                    connection.close();
                    System.out.println("--------------------------------");
                    System.out.println("Deletion Done : Check DB");
                }
            }
            System.out.println("Employee ID doesn't exit");
        } catch (SQLException exception) {
            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception.getMessage());
            //System.out.println(exception);
        }
        //resigned
        //Employee will be terminated
        //Retired -60 years -Final settlement(401K)

    }
    @Override
    public void selectRecord() {}
    @Override
    public void updateRecord() {}
    @Override
    public void insertRecord() {}
}
