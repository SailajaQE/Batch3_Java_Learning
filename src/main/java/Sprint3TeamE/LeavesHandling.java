package Sprint3TeamE;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LeavesHandling {
    String query1, query2;
    int leaves, count, hcount,hleaves;
    Recordset rs;
    Fillo fillo;
    Connection connection;

    LeavesHandling() {
    try
    {
        fillo = new Fillo();
        connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");
    } catch(FilloException e)
    {
        e.printStackTrace();
    }
}
    public void getLeaves(String name,int emp_id,int max) throws FilloException {

        System.out.println("How many leaves do you want?");
        Scanner scanner=new Scanner(System.in);
        count = Integer.parseInt(scanner.nextLine());

        query1 = "select "+name+" from Sheet1 where emp_id="+emp_id;
        rs = connection.executeQuery(query1);

        while (rs.next()) {
           leaves = Integer.parseInt(rs.getField(name));
        }
        if (leaves < max) {
            count = leaves + count;
            if (count <= max) {
                query2 = "Update Sheet1 Set "+name+"="+count+" where emp_id="+emp_id;
                connection.executeUpdate(query2);
                System.out.println("------------------------------");
                System.out.println(" LEAVE is Confirmed: ");
            } else System.out.println("You have limited leaves Check it");
        } else System.out.println("You used all "+name);
    }

    public void getUsaHoliday(String name,int emp_id,int max) throws FilloException {
        System.out.println("Which USA Holiday?");
        Scanner scanner=new Scanner(System.in);
        String str1 = scanner.nextLine();

        for (Holidays h:Holidays.values()) {
            if (h.toString().equalsIgnoreCase(str1)) {
                hcount++;
            }
            query1 = "select "+name+" from Sheet1 where emp_id =" + emp_id;
            rs = connection.executeQuery(query1);
            while (rs.next()) {
                hleaves = Integer.parseInt(rs.getField(name));
            }
        }
        if (hleaves < max) {
            hcount = hleaves + hcount;
            if (hcount <= max) {
                query2= "Update Sheet1 Set "+name+"="+hcount+" where emp_id="+emp_id;
                connection.executeUpdate(query2);
                System.out.println("-------------------------------");
                System.out.println(" LEAVE is Confirmed: ");
            } else System.out.println("You have limited holidays Check it");
        } else System.out.println("Reached Max count of USA holidays");
    }

}
