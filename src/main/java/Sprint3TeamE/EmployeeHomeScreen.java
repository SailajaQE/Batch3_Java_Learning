package Sprint3TeamE;

import java.util.Scanner;

public class EmployeeHomeScreen {

        public  void menu() {
                System.out.println("==============================================================================================");
                System.out.println("\t\t              */ Welcome to Employee Register Maintenance Utility /*                      ");
                System.out.println("===============================================================================================\n");
                System.out.println("\tPlease Choose option ! ");
                System.out.println("-------------------------------");
                System.out.println(" 1  : All Employee List");
                System.out.println(" 2  : Add an Employee");
                System.out.println(" 3  : Update an Employee");
                System.out.println(" 4  : Delete an Employee");
                System.out.println(" 5  : Applying the Leaves");
                System.out.println(" 6  : Exit");
        }
        public int repeat() {

                System.out.print("\nDo you want to continue (Y or N) ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                int choice = 0;
                OptionSelection optionSelection=new OptionSelection();
                if (input.equalsIgnoreCase("y")) {
                        menu();
                        choice = optionSelection.getChoice();
                } else{
                        ExitCode.out();
                        }
                return choice;
        }
}
