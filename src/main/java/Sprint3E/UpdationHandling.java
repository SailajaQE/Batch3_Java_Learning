package Sprint3E;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Scanner;

public class UpdationHandling extends Logger {

    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner = new Scanner(System.in);
    String query, query1, query2;

    UpdationHandling() {
        System.out.println("****** Which Field you want to update: ? ******* ");
        System.out.println(" 1: Last_Name");
        System.out.println(" 2: Marital_Status");
        System.out.println(" 3: Designation");
        System.out.println(" 4: Reporting Manager");
        System.out.println(" 5: Project Name");
        System.out.println(" 6:Job_Status");
        System.out.println(" 7: Base_Salary");
        System.out.println(" 8: Bonus");
        System.out.println(" 9: Address");
        System.out.println("10: City");
        System.out.println("11: State");
        System.out.println("12: Email");
        System.out.println("13: Phone");
        System.out.println("----------------");
    }

    public void updateMenu(String name) throws SQLException {
        String value = scanner.nextLine();
        System.out.println(" Enter emp_id ? ");
        int id = Integer.parseInt(scanner.nextLine());
        query = "select emp_id from team_e_sprint3.emp_data where emp_id=" + id;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getInt(1) == id) {
                    String query1 = "update team_e_sprint3.emp_data set " + name + "='" + value + "' where emp_id=" + id;
                    stmt.executeUpdate(query1);
                    System.out.println("-----------------------------");
                    System.out.println("UPDATE is Done: Check DB !");
                }
                else{
                    System.out.println("Employee ID Doesn't Exit");
                }

            }

        }catch (Exception exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
            //System.out.println(exception);
        }
    }

    public void updateBaseSalary()  {
        System.out.println(" Enter emp_id ? ");
        int id = Integer.parseInt(scanner.nextLine());
        try {
            query = "select designation from team_e_sprint3.emp_data where emp_id=" + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase("senior manager")) {
                    query1 = "update team_e_sprint3.emp_data set base_salary = base_salary+base_salary*0.3" + " where emp_id=" + id;
                    stmt.executeUpdate(query1);
                    query2 = "update team_e_sprint3.emp_data set net_salary = base_salary+bonus" + " where emp_id=" + id;
                    stmt.executeUpdate(query2);
                    System.out.println("your base salary is increased by 30%");
                    System.out.println("-----------------------------");
                    System.out.println("UPDATE is Done: Check DB !");
                } else {
                    System.out.println("Your designation is: " + rs.getString(1));
                    System.out.println("Sorry base_salary can't be update");
                }
                System.out.println(" Employee id not exist: ");
            }

        } catch (SQLException exception) {
            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception.getMessage());
            //System.out.println(exception);
        }
    }
    public void updateBonus(){
        System.out.println(" Enter emp_id ? ");
        int id = Integer.parseInt(scanner.nextLine());
        try {
            query = "select service from team_e_sprint3.emp_data where emp_id=" + id;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getInt(1)>5) {
                    query1 = "update team_e_sprint3.emp_data set bonus = "+500+" where emp_id=" + id;
                    stmt.executeUpdate(query1);
                    query2 = "update team_e_sprint3.emp_data set net_salary=base_salary+bonus" + " where emp_id=" + id;
                    stmt.executeUpdate(query2);
                    System.out.println("Your BONUS is updated: ");
                    System.out.println("-----------------------------");
                    System.out.println("UPDATE is Done: Check DB !");
                } else {
                    System.out.println("Your service is not >5 years-- " + rs.getString(1));
                    System.out.println("Sorry BONUS can't be UPDATE");
                }
                System.out.println("Employee ID doesn't exit");
            }
        } catch (SQLException exception) {
            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception.getMessage());
            //System.out.println(exception);
        }

    }
}

