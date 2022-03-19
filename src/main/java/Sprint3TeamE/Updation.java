package Sprint3TeamE;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Updation extends Logger implements BaseMethods
{
    @Override
    public void updateRecord () throws SQLException {
        UpdationHandaling obj=new UpdationHandaling();
        System.out.println("Enter Choice: ");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.parseInt(scanner.nextLine());
        String name,value;

            switch (choice) {
                case 1:
                    name="last_name";
                    System.out.println("Enter new last_name to update: ");
                    obj.updateMenu(name);
                    break;
                    case 2:
                        name="marital_status";
                        System.out.println("Enter new marital_status to update: ");
                        obj.updateMenu(name);
                        break;
                case 3:
                    name="designation";
                    System.out.println("Enter new designation to update: ");
                    obj.updateMenu(name);
                    break;
                case 4:
                    name="reporting_manager";
                    System.out.println("Enter new reporting_manager to update: ");
                    obj.updateMenu(name);
                    break;
                case 5:
                    name="project_name";
                    System.out.println("Enter new project_name to update: ");
                    obj.updateMenu(name);
                    break;
                case 6:
                    name="job_status";
                    System.out.println("Enter new job_status to update: ");
                    obj.updateMenu(name);
                    break;
                case 7:
                    name="base_salary";
                    System.out.println("your base salary is increased by 30%");
                    obj.updateBaseSalary();
                    break;
                case 8:
                    name="address";
                    System.out.println("Enter new address to update: ");
                    obj.updateMenu(name);
                    break;
                case 9:
                    name="city";
                    System.out.println("Enter new city to update: ");
                    obj.updateMenu(name);
                    break;
                case 10:
                    name="state";
                    System.out.println("Enter new state to update: ");
                    obj.updateMenu(name);
                    break;
                case 11:
                    name="email";
                    System.out.println("Enter new email to update: ");
                    obj.updateMenu(name);
                    break;
                case 12:
                    name="phone";
                    System.out.println("Enter new phone to update: ");
                    obj.updateMenu(name);
                    break;
                default:
                    System.out.println("enter correct number: ");
            }
        //}while (choice == 1);// || choice <= 1);

    }
    @Override
    public void selectRecord(){}
    @Override
    public void insertRecord(){}
    @Override
    public void deleteRecord(){}
}
