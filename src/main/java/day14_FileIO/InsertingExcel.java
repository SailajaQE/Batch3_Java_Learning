package day14_FileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class InsertingExcel {
    public static void main(String[] args) throws FilloException
    {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("src/main/resources/Book1.xlsx");
        String strQuery="INSERT INTO sheet1(TestCase,Result) VALUES('TC006','BUG')";

        connection.executeUpdate(strQuery);

        connection.close();
    }
}
