package day13;

import java.util.Scanner;

public class GettingInputFromUser {
    //Declaring the int variable
    int age;
    //Declaring Scanner object
    Scanner scanner;

    public int initializeVariable() {
        //Initializing the Scanner Object
        scanner = new Scanner(System.in);
            try {
                do {
                    System.out.println("Please enter the age between 1 to 100");
                    //Getting the Input value from the user (Initialing the age variable
                     String ageString = scanner.nextLine();
                     age = Integer.parseInt(ageString);
                    if (age >= 1 && age <= 100) {
                        System.out.println(age);
                        System.out.println("Age is valid");
                    } else {
                        System.out.println(age);
                        System.out.println("Age is NOT valid");
                    }
                } while (age <=0 || age > 100);
                return age;
            }
            catch(Exception e)
            {
                System.out.println("Please enter the age in Integer between 1 to 110:");
            }
            return 0;
        }
            public static void main (String[]args){

                GettingInputFromUser obj = new GettingInputFromUser();
                System.out.println("Your Age is :" + obj.initializeVariable());
            }

    }




