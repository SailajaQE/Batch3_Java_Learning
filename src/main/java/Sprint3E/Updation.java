package Sprint3E;

import java.sql.SQLException;
import java.util.Scanner;

public class Updation extends Logger implements BaseMethods
{
    UpdationHandling obj=new UpdationHandling();
    OptionSelection optionSelection=new OptionSelection();
    int max=13;
    int choice= optionSelection.getChoice(max);//getting option from user;

    String name;
    @Override
    public void updateRecord () throws SQLException {
        do {
            switch (choice) {
                case 1:
                    name = "last_name";
                    System.out.println("Enter new last_name to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 2:
                    name = "marital_status";
                    System.out.println("Enter new marital_status to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 3:
                    name = "designation";
                    System.out.println("Enter new designation to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 4:
                    name = "reporting_manager";
                    System.out.println("Enter new reporting_manager to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 5:
                    name = "project_name";
                    System.out.println("Enter new project_name to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 6:
                    name = "job_status";
                    System.out.println("Enter new job_status to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 7:
                    name = "base_salary";
                    obj.updateBaseSalary();
                    choice = optionSelection.updateAgain(max);
                    break;
                case 8:
                    name = "bonus";
                    obj.updateBonus();
                    choice = optionSelection.updateAgain(max);
                    break;
                case 9:
                    name = "address";
                    System.out.println("Enter new address to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 10:
                    name = "city";
                    System.out.println("Enter new city to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 11:
                    name = "state";
                    System.out.println("Enter new state to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                case 12:
                    name = "email";
                    System.out.println("Enter new email to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
                default:
                    name = "phone";
                    System.out.println("Enter new phone to update: ");
                    obj.updateMenu(name);
                    choice = optionSelection.updateAgain(max);
                    break;
            }
        }while(choice>0&&choice <= max);
    }
    @Override
    public void selectRecord(){}
    @Override
    public void insertRecord(){}
    @Override
    public void deleteRecord(){}
}
