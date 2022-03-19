package Sprint3E;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectionHandling extends Logger{

    Statement stmt = DatabaseConnection.getDatabase();
    Scanner scanner=new Scanner(System.in);
    String query1,query2;
    SelectionHandling()
    {
        System.out.println("1. Employee salary data? ");
        System.out.println("2. Maximum Salary Employee");
        System.out.println("3. Age>30 Employees");
        System.out.println("4. All Employees Details ");
        System.out.println("--------------------------");
    }
    public void selectAge() throws SQLException {
        query1="select first_name from team_e_sprint3.emp_data where age>"+30;
        ResultSet rs=stmt.executeQuery(query1);
        while(rs.next())
            System.out.println(rs.getString(1)+",  ");
        System.out.println("------------------------------------------");
        System.out.println(" SELECT is Done: ");
        //query="update team_e_sprint3.emp_data set bonus="+value+" where service > "+5";
    }

    public void getSelect(String first_name,int id) throws SQLException {
         query1 = "select base_salary from team_e_sprint3.emp_data where emp_id="+id+" and "+"first_name='"+first_name+"'";
        ResultSet rs=stmt.executeQuery(query1);
        while(rs.next()) System.out.println(" Salary: "+rs.getDouble("base_salary"));
        System.out.println("------------------------------------------");
        System.out.println(" SELECT is Done: ");
    }
    public void selectSalary() throws SQLException {
        query1 = "select first_name,base_salary  from team_e_sprint3.emp_data where base_salary=(select max(base_salary) from team_e_sprint3.emp_data)";
        ResultSet rs1=stmt.executeQuery(query1);
        while(rs1.next()) {
            System.out.println(" Maximum Salary Employee :: " + rs1.getString(1) + " - " + rs1.getDouble(2));
        }rs1.close();
        /*query2 = "select first_name,base_salary  from team_e_sprint3.emp_data where base_salary=(select min(base_salary) from team_e_sprint3.emp_data)";
        ResultSet rs2=stmt.executeQuery(query1);
        while(rs2.next()) {
            System.out.println(" Minimum Salary Employee :: " + rs2.getString(1) + " - " + rs2.getDouble(2));
        }rs2.close();*/
        System.out.println("--------------------------------------------");
        System.out.println(" SELECT is Done: ");
    }
    public void selectAll() {
        System.out.println("Here are the Employee's List !");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        String query1 = "select * from team_e_sprint3.emp_data";
        try {
            ResultSet rs = stmt.executeQuery(query1);
            System.out.println("Emp_Id\t" + "First_Name\t\t" + "Last_Name\t\t" + "Date_Of_Birth\t" + "Gender\t" + "Marital_Status\t" +
                            "Date_Of_Joining\t\t" + "Designation\t\t\t" + "ReportingManager\t" + "ProjectName\t\t" + "Job_Status\t"
                         /*+"Base_salary\t"+"Emp_Benifits\t"+"Net_salary\t"+"Bonus\t"+
                         "Address\t"+"City\t"+"State\t"+"Email\t"+"Phone\t"*/);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            while (rs.next())
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t\t" +
                                rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getString(5) +
                                "\t\t" + rs.getString(6) + "\t\t\t" + rs.getString(7) + "\t\t\t" +
                                rs.getString(8) + "\t\t\t" + rs.getString(9) + "\t\t" + rs.getString(10) +
                                "\t" + rs.getString(11) + "\t\t\t"
                             /*+rs.getDouble(12)+"\t"+rs.getDouble(13)+"\t"+rs.getDouble(14)+"\t"+
                             rs.getDouble(15)+"\t"+rs.getString(16)+"\t"+rs.getString(17)+"\t"+
                             rs.getString(18)+"\t"+rs.getString(19)+"\t"+rs.getString(20)*/);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" SELECT is Done: ");
        } catch (SQLException exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
            System.out.println(exception);
        }
    }
}
