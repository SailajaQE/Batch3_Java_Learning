package Sprint3TeamE;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import java.sql.Statement;
import java.util.Scanner;

public class Insertion extends Logger implements BaseMethods {
    Statement stmt = DatabaseConnection.getDatabase();

    @Override
    public void insertRecord() throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");

        Employee e = new Employee();

        System.out.println("Do u want to INSERTION by manual : ( Y / N ) ");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();

        if(str.equalsIgnoreCase("y")){
            e.getInfo();
        }else {
            System.out.println(" enetr job_status : ");
            e = new Employee();
            e.job_status = scanner.nextLine();//faker.job().position();
        }
        try {
            String sql_query1="Insert Into team_e_sprint3.emp_data values("+e.emp_id+",'"+e.first_name + "','" + e.last_name + "','" + e.dob + "','" +
                    e.gender + "','" + e.marital_status + "','" + e.date_of_joining + "','" +
                    e.designation + "','" + e.reporting_manager + "','" + e.project_name + "','" +
                    e.job_status + "'," + e.base_salary + "," + e.emp_benefits + "," + e.net_salary + "," +
                    e.bonus + ",'" + e.address + "','" + e.city + "','" + e.state + "','" + e.email + "','" + e.phone + "')";

            String excel_query1= "Insert Into sheet1(emp_id,first_name,paternity_leaves,maternity_leaves,personal_leaves,sick_leaves,floating_holidays,usa_holidays)"+ "values(" +
                    e.emp_id+",'"+e.first_name+"',"+0+","+0+","+0+","+0+","+0+","+0+")";
            connection.executeUpdate(excel_query1);
            connection.close();

            stmt.executeUpdate(sql_query1);
            System.out.println("---------------------------");
            System.out.println("INSERT is Done: Check DB !");

        } catch (Exception exception) {
            String s1 = String.valueOf(getClass());
            String s2 = String.valueOf(exception.getClass());
            logger(s1, s2, exception.getMessage());
            System.out.println(exception);
        }
    }
    @Override
    public void selectRecord() {}
    @Override
    public void updateRecord() {}
    @Override
    public void deleteRecord() {}
}

