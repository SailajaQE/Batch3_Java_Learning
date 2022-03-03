package day15;

import com.github.javafaker.Faker;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        Faker fakeData=new Faker();
        for (int i=1;i<=10;i++) {
            employeeData.setFirstName(fakeData.name().firstName());
            employeeData.setLastName(fakeData.name().lastName());
            employeeData.setPhoneNumber(fakeData.phoneNumber().cellPhone());
            employeeData.setEmail(fakeData.internet().emailAddress());
            employeeData.setDesignation(fakeData.job().position());
            //employeeData.generateData();
        }
        for (int i=1;i<=10;i++)
        {
            System.out.println(employeeData.getFirstName());
            System.out.println(employeeData.getLastName());
            System.out.println(employeeData.getPhoneNumber());
            System.out.println(employeeData.getEmail());
            System.out.println(employeeData.getDesignation());
        }


    }
}
