package Sprint3E;

import java.util.Scanner;

public class EmployeeHomeScreen {

        public  void menu() {
                System.out.println("==============================================================================================");
                System.out.println("\t\t              */ Welcome to Employee Register Maintenance Utility /*                      ");
                System.out.println("===============================================================================================\n");
                System.out.println("\tPlease Choose option ! ");
                System.out.println("-------------------------------");
                System.out.println(" 1  : Select Employee Details ");
                System.out.println(" 2  : Add an Employee Details ");
                System.out.println(" 3  : Update an Employee Details ");
                System.out.println(" 4  : Delete an Employee Details ");
                System.out.println(" 5  : Applying the Leaves");
                System.out.println(" 6  : Employee Leaves List: ");
                System.out.println(" 7  : Exit");
        }
        public int repeat(int max) {

                System.out.print("\nDo you want to continue to the Home Screen(Y or N) ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                int choice = 0;
                OptionSelection optionSelection=new OptionSelection();
                if (input.equalsIgnoreCase("y")) {
                        menu();
                        choice = optionSelection.getChoice(max);
                } else{
                        ExitCode.out();
                        }
                return choice;
        }
}
