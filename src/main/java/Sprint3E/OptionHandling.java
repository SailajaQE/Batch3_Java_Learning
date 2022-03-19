package Sprint3E;

import com.codoid.products.exception.FilloException;

import java.sql.SQLException;
import java.util.Scanner;

public class OptionHandling {

    EmployeeHomeScreen employeeHomeScreen=new EmployeeHomeScreen();
    OptionSelection optionSelection=new OptionSelection();
    int max=7;
    int choice= optionSelection.getChoice(max);//getting option from user;
    public void getOption() throws FilloException, SQLException {

        do{
            switch (choice) {
                case 1:
                    System.out.println("Your Option is SELECT an Employee Details :");
                    System.out.println("----------------------------");
                    BaseMethods obj1 = new Selection();
                    obj1.selectRecord();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                case 2:
                    System.out.println("Your Option is INSERT an Employee Details :");
                    System.out.println("----------------------------");
                    BaseMethods obj2 = new Insertion();
                    obj2.insertRecord();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                case 3:
                    System.out.println("Your Option is to UPDATE an Employee Details :");
                    System.out.println("----------------------------");
                    BaseMethods obj3 = new Updation();
                    obj3.updateRecord();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                case 4:
                    System.out.println("Your Option is to DELETE an Employee Details :");
                    System.out.println("----------------------------");
                    BaseMethods obj4 = new Deletion();
                    obj4.deleteRecord();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                case 5:
                    System.out.println("Your Option is applying For Leave :");
                    System.out.println("----------------------------");
                    ApplyingTheLeaves obj5=new ApplyingTheLeaves();
                    obj5.apply();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                case 6:
                    System.out.println(" Your option is to show Employee Leaves List: ");
                    System.out.println("-------------------------------------------");
                    LeavesHandling obj6=new LeavesHandling();
                    obj6.LeaveList();
                    choice = employeeHomeScreen.repeat(max);//asking agian
                    break;
                default:
                    System.out.println("Your Option is EXIT :");
                    ExitCode.out();
                    break;
            }
        }while (choice > 0 || choice <= max);
        ExitCode.out();
    }
}