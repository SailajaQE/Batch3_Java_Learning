package Sprint3E;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.Scanner;

public class ApplyingTheLeaves extends Logger {
    OptionSelection optionSelection=new OptionSelection();

    public void apply() throws FilloException {
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");
            LeavesHandling leavesHandling=new LeavesHandling();

            System.out.println("Do you want to apply for leave Y /N ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String Query,query1;
            int count,leave;
            Recordset rs;

            if (str.equalsIgnoreCase("y")) {
                System.out.println("enter your emp_id");
                int emp_id = Integer.parseInt(scanner.nextLine());
                System.out.println(" which leave you Want ? ");
                Leaves_Menu.menu();
                int max=6;
                int leaveChoice = optionSelection.getChoice(max);//getting option from user;
                String name;
                switch (leaveChoice) {
                    case 1:
                        name = "paternity_leaves";
                        leavesHandling.getLeaves(name, emp_id, 7);
                        break;
                    case 2:
                        name = "maternity_leaves";
                        leavesHandling.getLeaves(name, emp_id, 42);
                        break;
                    case 3:
                        name = "personal_leaves";
                        leavesHandling.getLeaves(name, emp_id, 6);
                        break;
                    case 4:
                        name = "sick_leaves";
                        leavesHandling.getLeaves(name, emp_id, 6);
                        break;
                    case 5:
                        name = "floating_holidays";
                        leavesHandling.getLeaves(name, emp_id, 2);
                        break;
                    default:
                        name = "usa_holidays";
                        leavesHandling.getUsaHoliday(name, emp_id, 9);
                        break;
                }
            }
        } catch (Exception exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
        }
    }
}