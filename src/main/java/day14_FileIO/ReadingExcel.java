package day14_FileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadingExcel {
    public static void main(String[] args) throws FilloException
    {

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Book1.xlsx");
        //String strQuery = "Select * from Sheet1 where TestCase ='TC001'";
        //Recordset recordset = connection.executeQuery(strQuery);
        Recordset recordset=connection.executeQuery("Select * from Sheet1 where Result like 'Pa%'");
        System.out.println(recordset.getCount());

        while (recordset.next()) {
            System.out.println(recordset.getField("TestCase"));
            System.out.println(recordset.getField("Result"));
        }

        recordset.close();
        connection.close();
    }
}
