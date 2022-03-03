package day14_FileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UpdatingExcel {
    public static void main(String[] args)  throws FilloException
    {

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Book1.xlsx");
        String strQuery = "Update Sheet1 Set TestCase ='TC009' where Result = 'Pass'";

        connection.executeUpdate(strQuery);

        connection.close();
    }
}
