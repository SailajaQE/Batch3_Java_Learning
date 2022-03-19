package Sprint3E;

import com.github.javafaker.Faker;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;

public class Employee {
    java.util.Date date=new java.util.Date() ;
    Scanner scanner=new Scanner(System.in);
    int emp_id;
    String first_name;
    String last_name;
    String dob;
    String gender;
    String marital_status;
   String date_of_joining;
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

    Date today;
    Date dob1,doj;
    int age,service;
    Timestamp today_time;


    public Employee() {
        Faker faker=new Faker();

        emp_id=faker.number().numberBetween(1,100);
        first_name = faker.name().firstName();
        last_name = faker.name().lastName();
        gender = faker.demographic().sex();
        marital_status= faker.demographic().maritalStatus();

        //dob= String.valueOf(faker.date().birthday());
        dob= String.valueOf(new Date(faker.date().birthday().getTime()));
        dob1= new java.sql.Date(faker.date().birthday().getTime());

        today=new Date(date.getTime());
        age=today.getYear()-dob1.getYear();

        //date_of_joining= String.valueOf(faker.date().birthday(30,60));

        date_of_joining = String.valueOf(new Date(faker.date().between(dob1,today).getTime()));
        doj =new java.sql.Date(faker.date().between(dob1,today).getTime());
        service=today.getYear()-doj.getYear();

        designation = faker.job().title();
        reporting_manager= faker.funnyName().name();
        project_name = String.format("%s project", faker.app().name());
        //()->job_status = JobStatus.FullTime;
        //job_status = scanner.nextLine();//faker.job().position();

        base_salary = faker.number().randomDouble(4,2000,5000);
        emp_benefits = base_salary * 0.3; //if designation is senior manager then base_salary + 30% hike
        net_salary = base_salary + emp_benefits + bonus;
        bonus = faker.number().randomDouble(3,500,1000);//if works >5 years

        address = faker.address().fullAddress().trim().trim().trim();
        city = faker.address().city();
        state = faker.address().state();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().cellPhone();
    }
    public void getInfo()
    {
        System.out.print("Enter Employee's ID  ----------: ");
        emp_id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Employee's First Name  --------: ");
        first_name=scanner.nextLine();
        System.out.print("Enter Employee's Last Name --------: ");
        last_name=scanner.nextLine();
        System.out.print("Enter Employee's Data of birth (yyyy-mm-dd) ----------: ");
        dob=String.format(scanner.nextLine());
        dob1 =  java.sql.Date.valueOf(dob);
        today=new Date(new java.util.Date().getTime());
        age=today.getYear()-dob1.getYear();

        System.out.print("Enter Employee's gender  --------: ");
        gender=scanner.nextLine();
        System.out.print("Enter Employee's marital Status --------: ");
        marital_status=scanner.nextLine();
        System.out.print("Enter Employee's date of joining --------: ");
        date_of_joining=String.format(scanner.nextLine());
        doj= java.sql.Date.valueOf(date_of_joining);
        service=today.getYear()-doj.getYear();

        System.out.print("Enter Employee's designation --------: ");
        designation=scanner.nextLine();
        System.out.print("Enter Employee's reporting manager --------: ");
        reporting_manager=scanner.nextLine();
        System.out.print("Enter Employee's Project name--------: ");
        project_name=scanner.nextLine();
        System.out.print("Enter Employee's job status --------: ");
        job_status=scanner.nextLine();
        System.out.print("Enter Employee's address.........:" );
        address = scanner.nextLine();
        System.out.print("Enter Employee's city.........:" );
        city = scanner.nextLine();
        System.out.print("Enter Employee's state.........:" );
        state = scanner.nextLine();
        System.out.print("Enter Employee's email .........:" );
        email = scanner.nextLine();
        System.out.print("Enter Employee's phone .........:" );
        phone = scanner.nextLine();
        System.out.print("Enter Employee's base_salary  --------: ");
        base_salary= Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter Employee's emp_benifits --------: ");
        emp_benefits=0; //Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter Employee's net_salary  --------: ");
        net_salary= base_salary+emp_benefits;//Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter Employee's bonus  --------: ");
        bonus=0;//Double.parseDouble(scanner.nextLine());
    }
}