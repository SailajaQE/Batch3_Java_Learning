package Sprint3;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Scanner;

@Getter
@Setter

public class Employee {

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

    public Employee() {
        Faker faker=new Faker();
        emp_id=faker.number().numberBetween(1,2000);
        emp_id=faker.random().nextInt(1,100);
        first_name = faker.name().firstName();
        last_name = faker.name().lastName();
        gender = faker.demographic().sex();
        marital_status=faker.demographic().maritalStatus();
        dob = String.valueOf(new Date(faker.date().birthday().getTime()));
        date_of_joining = String.valueOf(new Date(faker.date().birthday(30,60).getTime()));

        //dob = faker.date().birthday().toString();
        //date_of_joining =faker.date().birthday(30,60).toString();
        designation =faker.job().position();
        reporting_manager=faker.funnyName().name();
        project_name = String.format("%s project", faker.app().name());
        job_status =faker.job().title();

        base_salary = faker.number().randomDouble(4,2000,5000);

        emp_benefits=base_salary * 0.3; //if designation is senior manager then base_salary+30% hike
        net_salary= base_salary+emp_benefits+ bonus;
        bonus =faker.number().randomDouble(3,500,1000);//if works >5 years

        address =faker.address().fullAddress().trim().trim().trim();
        city =faker.address().city();
        state =faker.address().state();
        email =faker.internet().emailAddress();
        phone =faker.phoneNumber().cellPhone();

    }

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
        dob =sc.nextLine();
        System.out.print("Enter Employee's gender --------: ");
        gender=sc.nextLine();
        System.out.print("Enter Employee's marital status --------: ");
        marital_status=sc.nextLine();
        System.out.print("Enter Employee's date of joining --------: ");
        date_of_joining=sc.nextLine();
        System.out.print("Enter Employee's designation --------: ");
        designation=sc.nextLine();
        System.out.print("Enter Employee's reporting manager --------: ");
        reporting_manager=sc.nextLine();
        System.out.print("Enter Employee's Project name--------: ");
        project_name=sc.nextLine();
        System.out.print("Enter Employee's job status (Full Time /Contract)--------: ");
        job_status=sc.nextLine();
        System.out.print("Enter Employee's base_salary  --------: ");
        base_salary = Double.parseDouble(sc.nextLine());
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

    public Employee(int emp_id, String first_name, String last_name, String dob, String gender, String marital_status, String date_of_joining, String designation, String reporting_manager, String project_name, String job_status, double base_salary, double emp_benefits, double net_salary, double bonus, String address, String city, String state, String email, String phone) {
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.gender = gender;
        this.marital_status = marital_status;
        this.date_of_joining = date_of_joining;
        this.designation = designation;
        this.reporting_manager = reporting_manager;
        this.project_name = project_name;
        this.job_status = job_status;
        this.base_salary = base_salary;
        this.emp_benefits = emp_benefits;
        this.net_salary = net_salary;
        this.bonus = bonus;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
    }

}
