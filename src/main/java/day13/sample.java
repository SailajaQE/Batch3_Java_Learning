package day13;

import java.util.Scanner;

public class sample {
    //Declaring the int variable
    int age;

    //Declaring Scanner object
    Scanner scanner;

    public int initializeVariable()
    {
        //Initializing the Scanner Object
        scanner = new Scanner(System.in);

        System.out.println("Please enter the age: ");

        //Getting the Input value from the user (Initialing the age variable
        String ageString = scanner.nextLine();

        //Exception Handling
        try
        {
            //Converting the String to Integer
            age = Integer.parseInt(ageString);
            return age;
        }
        catch(Exception e)
        {
            System.out.println("Please enter correct age:");
        }

        return 0;
    }

    public static void main(String[] args) {

        sample obj = new sample();
        System.out.println("Your Age is :"+obj.initializeVariable());
    }

}
