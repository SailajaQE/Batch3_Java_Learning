package Sprint3E;

import com.sun.javafx.collections.MappingChange;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Selection extends Logger implements BaseMethods {

    SelectionHandling selectionHandling = new SelectionHandling();
    OptionSelection optionSelection = new OptionSelection();
    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();

    int id,max = 4;
    int choice = optionSelection.getChoice(max);//getting option from user;
    String name;
    @Override
    public void selectRecord() throws SQLException {
        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID: ");
                    id= Integer.parseInt(scanner.nextLine());
                    System.out.println(" Enter Employee First_Name: ");
                    name = scanner.nextLine();
                    selectionHandling.getSelect(name,id);
                    choice = optionSelection.selectAgain(max);
                    break;
                case 2:
                    selectionHandling.selectSalary();
                    choice = optionSelection.selectAgain(max);
                    break;
                case 3:
                    selectionHandling.selectAge();
                    choice = optionSelection.selectAgain(max);
                    break;
                default:
                    selectionHandling.selectAll();
                    choice = optionSelection.selectAgain(max);
                    break;
            }
            System.out.println("...........");
        }while (choice>0&&choice <= max) ;
    }
        @Override
        public void updateRecord () {
        }
        @Override
        public void insertRecord () {
        }
        @Override
        public void deleteRecord () {
        }
    }

