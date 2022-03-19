package Sprint3;

//import day17.Student;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseMethods extends Logger implements DbInterface {
    Statement stmt = DatabaseConnection.getDatabase();
    Date date = new Date();


    @Override
    public void selectRecord () {
        String query1 = "select * from team_e_sprint3.emp_data";
        try {
            ResultSet rs = stmt.executeQuery(query1);
            System.out.println("Here are the Employee Details !");
            System.out.println("EmpId  FirstName   Designation");
            while (rs.next())
                System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "  "  + "  " + rs.getString(8));
            //con.close();
        } catch (SQLException exception) {

            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception);
            System.out.println(exception);
        }
    }
    @Override
    public void insertRecord () throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");
        Employee e = new Employee();
        System.out.println("Do u want to INSERTION by manual : ( Y / N ) ");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        if(str.equalsIgnoreCase("y")) {
            e.getInfo();
        }else {
            System.out.println(" Enter job_status : ");
            e = new Employee();
            e.job_status = scanner.nextLine();//faker.job().position();*/
        }

        try {
            String query1= "Insert Into team_e_sprint3.emp_data"+" values("+
                    e.emp_id+",'"+e.first_name+"','"+e.last_name+"','"+e.dob+"','"+
                    e.gender+"','"+ e.marital_status+"','"+e.date_of_joining+"','"+
                    e.designation+"','"+e.reporting_manager+"','"+e.project_name+"','"+
                    e.job_status+"',"+e.base_salary+","+e.emp_benefits+","+e.net_salary+","+
                    e.bonus+",'"+e.address+"','"+e.city+"','"+e.state+"','"+ e.email+"','"+e.phone+"')";

            String excel_query1= "Insert Into sheet1(emp_id,first_name,pater,paternity_leaves,maternity_leaves,personal_leaves,sick_leaves,floating_holidays,us_holidays)"+ "values(" +
                    e.emp_id+",'"+e.first_name+"',"+0+","+0+","+0+","+0+","+0+","+0+","+0+")";
            connection.executeUpdate(excel_query1);
            connection.close();

            stmt.executeUpdate(query1);
            System.out.println("INSERTION Done: Check DB !");

        }catch(Exception exception)
        {
            String s1=String.valueOf(getClass());
            String s2= String.valueOf(e.getClass());
            logger(s1,s2,exception);
            System.out.println(exception);
        }
    }
    @Override
    public void updateRecord () {

        Scanner scanner=new Scanner(System.in);
        String query1,query2,query3;
        System.out.println("Enter Employee id to update base salary and netsalary");
        int  employee_id = Integer.parseInt(scanner.nextLine());
        //String str= scanner.nextLine();
         query1 = "select * from team_e_sprint3.emp_data";
        query2 = "update team_e_sprint3.emp_data set base_salary = base_salary+base_salary*0.3" + "where emp_id="+employee_id;;
        query3 = "update team_e_sprint3.emp_data set net_salary = base_salary+bonus " + "where emp_id="+ employee_id;;

        try {
            ResultSet rs = stmt.executeQuery(query1);
            //stmt.executeUpdate(query1);
            while (rs.next())
            {
                if (rs.getInt(1) == employee_id)
                {
                    stmt.executeUpdate(query2);
                    stmt.executeUpdate(query3);
                    System.out.println("Employee updated Successfully : Check DB");
                }
            }
            System.out.println("Employee ID doesn't exist");
            //stmt.executeUpdate(query2);
            //System.out.println("Update is Done: Check DB !");
        } catch (SQLException exception) {

            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception);
            //System.out.println(exception);
        }

        //employee.emp_benefits=employee.base_salary * 0.3; //if designation is senior manager then base_salary+30% hike
        //employee.net_salary=employee.base_salary+employee.emp_benefits+ employee.bonus;
       }

    @Override
    public void deleteRecord () throws FilloException {
        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");

        Scanner scanner=new Scanner(System.in);
        String query2;
        System.out.println("Enter emp_id you would like to delete ");
        int  employee_id = Integer.parseInt(scanner.nextLine());
        String query1 = "select * from team_e_sprint3.emp_data";
        query2 = "delete from team_e_sprint3.emp_data" + " where emp_id="+employee_id;
        String excel_query1=" delete from sheet1 where emp_id="+employee_id;

        try {
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next())
            {
                if (rs.getInt(1) == employee_id)
                {
                    stmt.executeUpdate(query2);
                    connection.executeUpdate(excel_query1);
                    connection.close();
                    System.out.println("Employee deleted Successfully : Check DB");
                }
            }
            System.out.println("Employee ID doesn't exist");
            //ResultSet rs = stmt.executeUpdate(query1);
            //System.out.println("Deletion Done: Check DB !");
        } catch (SQLException exception) {
            String s1=String.valueOf(getClass());
            String s2= String.valueOf(exception.getClass());
            logger(s1,s2,exception);
            //System.out.println(exception);
        }




    }

}

