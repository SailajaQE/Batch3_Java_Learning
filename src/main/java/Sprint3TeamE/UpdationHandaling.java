package Sprint3TeamE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Scanner;

public class UpdationHandaling extends Logger{

    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner=new Scanner(System.in);
    String query,query1,query2;

    UpdationHandaling() {
        System.out.println("****** Which Field you want to update: ? ******* ");
        System.out.println(" 1: Last_Name");
        System.out.println(" 2: Marital_Status");
        System.out.println(" 3: Designation");
        System.out.println(" 4: Reporting Manager");
        System.out.println(" 5: Project Name");
        System.out.println(" 6:Job_Status");
        System.out.println(" 7: Base_Salary");
        System.out.println(" 8: Address");
        System.out.println(" 9: City");
        System.out.println("10: State");
        System.out.println("11:Email");
        System.out.println("12:Phone");
        System.out.println("----------------");
    }
        public void updateMenu(String name) {
            String value = scanner.nextLine();
            System.out.println(" Enter emp_id ? ");
            int id = Integer.parseInt(scanner.nextLine());
            String query1 = "update team_e_sprint3.emp_data set "+name+"='"+value+"' where emp_id="+id;
            try {
                stmt.executeUpdate(query1);
                System.out.println("UPDATE is Done: Check DB !");
            } catch (Exception exception) {
                String s1 = String.valueOf(getClass());
                String s2 = String.valueOf(exception.getClass());
                logger(s1, s2, exception.getMessage());
                //System.out.println(exception);
            }
        }
            public void updateBaseSalary() throws SQLException {
                //Double value= Double.valueOf(scanner.nextLine());
                System.out.println(" Enter emp_id ? ");
                int id = Integer.parseInt(scanner.nextLine());
                query ="select * from team_e_sprint3.emp_data";
                query1 ="update team_e_sprint3.emp_data set base_salary = base_salary+base_salary*0.3"+" where emp_id="+id;
                query2= "update team_e_sprint3.emp_data set net_salary = base_salary+bonus"+" where emp_id="+id;
                try {
                    ResultSet rs=stmt.executeQuery(query);
                    while (rs.next()) {
                        if (rs.getInt(1) == id) {
                            stmt.executeUpdate(query1);
                            stmt.executeUpdate(query2);
                            System.out.println("-----------------------------");
                            System.out.println("UPDATE is Done: Check DB !");
                        }
                    }System.out.println("Employee ID doesn't exit");
                } catch (Exception exception) {
                    String s1 = String.valueOf(getClass());
                    String s2 = String.valueOf(exception.getClass());
                    logger(s1, s2, exception.getMessage());
                    //System.out.println(exception);
                }
            }
}

