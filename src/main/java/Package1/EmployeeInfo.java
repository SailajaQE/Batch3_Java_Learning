package Package1;

import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo {
    class EmployDetail
    {
        int emp_id;
        String first_name;
        String last_name;
        Date dob;
        String gender;
        String marital_status;
        Date date_of_joining;
        String designation;
        String reporting_manager;
        String project_name;
        String job_status;
        double base_salary;
        double emp_benefits;
        double net_salary;
        double bonus;
        String address;
        String city;
        String state;
        String email;
        String phone;

        public void getInfo()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Employee's ID ----------: ");
            emp_id = Integer.parseInt( sc.nextLine());
            System.out.print("Enter Employee's First Name --------: ");
            first_name=sc.nextLine();
            System.out.print("Enter Employee's Last Name --------: ");
            last_name=sc.nextLine();
            System.out.print("Enter Employee's Data of birth----------: ");
            //dob =sc.nextLine();
            System.out.print("Enter Employee's gender --------: ");
            gender=sc.nextLine();
            System.out.print("Enter Employee's marital status --------: ");
            marital_status=sc.nextLine();
            System.out.print("Enter Employee's date of joining --------: ");
            //date_of_joining=sc.nextLine();
            System.out.print("Enter Employee's designation --------: ");
            designation=sc.nextLine();
            System.out.print("Enter Employee's reporting manager --------: ");
            reporting_manager=sc.nextLine();
            System.out.print("Enter Employee's Project name--------: ");
            project_name=sc.nextLine();
            System.out.print("Enter Employee's job status --------: ");
            job_status=sc.nextLine();
            System.out.print("Enter Employee's base_salary  --------: ");
            //base_salary
            System.out.println("Enter Employee's address.........:" );
            address = sc.nextLine();
            System.out.println("Enter Employee's city.........:" );
            city = sc.nextLine();
            System.out.println("Enter Employee's state.........:" );
            state = sc.nextLine();
            System.out.println("Enter Employee's email.........:" );
            email = sc.nextLine();
            System.out.println("Enter Employee's phone.........:" );
            phone = sc.nextLine();

        }
    }

}
