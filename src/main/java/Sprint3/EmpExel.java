package Sprint3;


import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.Scanner;

public class EmpExel {

    public static void main(String[] args) throws FilloException {

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/EmpTest.xlsx");

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 6) {
            System.out.println("\nPress 1 : Viewing the Test Case Details");
            System.out.println("Press 2 : Inserting the Test Cases ");
            System.out.println("Press 3 : Updating the Test Cases");
            System.out.println("Press 4 : Exit");

            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());

            switch (i) {
                case 1: {
                    System.out.println("Viewing the Test Case Details");
                    String strQuery = "Select * from Sheet1 where TestCase ='TC032'";
                    Recordset recordset = connection.executeQuery(strQuery);
                    //Recordset recordset = connection.executeQuery("Select * from Sheet1);
                    System.out.println(recordset.getCount());

                    while (recordset.next()) {
                        //System.out.println(recordset.getField("TestCase"));
                        System.out.println(recordset.getField("Description"));
                        System.out.println(recordset.getField("Result"));
                    }

                    recordset.close();
                    connection.close();
                }
                break;
                case 2: {
                    System.out.println("Inserting the Test Cases");
                    String strQuery = "INSERT INTO sheet1(TestCase,Description,Result) VALUES('TC031','Sample test data','Pass')";

                    connection.executeUpdate(strQuery);
                     }

                    connection.close();

                break;

                case 3: {
                    System.out.println("Updating the Test Cases");
                    String strQuery = "Update Sheet1 Set TestCase ='TC031' where Result = 'Pass'";

                    connection.executeUpdate(strQuery);
                }
                    connection.close();

                break;
                case 4:
                {
                    System.out.println("Exit");
                    System.exit(0);
                }
                default:
                    System.out.println("Enter the Correct Key");
                    break;
            }
        }


    }
}