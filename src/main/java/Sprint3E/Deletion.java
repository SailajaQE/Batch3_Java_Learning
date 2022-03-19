package Sprint3E;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deletion extends Logger implements BaseMethods{
    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner=new Scanner(System.in);
    DeletionHandling obj=new DeletionHandling();
    OptionSelection optionSelection=new OptionSelection();

    public Deletion() throws FilloException {
    }

    @Override
    public void deleteRecord() throws FilloException, SQLException {
         int id,max=2;
        int choice= optionSelection.getChoice(max);//getting option from user;
        String query1,query2;

        do {
            switch (choice) {
                case 1:
                    System.out.println(" Enter Employee ID ? ");
                    id = Integer.parseInt(scanner.nextLine());
                    obj.deleteMenu(id);
                    choice = optionSelection.deleteAgain(max);
                    break;
                default:
                    System.out.println(" Enter Employee ID ? ");
                    id = Integer.parseInt(scanner.nextLine());
                    obj.retired(id);
                    choice = optionSelection.deleteAgain(max);
                    break;
            }
        }while(choice>0 && choice <=max);

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
