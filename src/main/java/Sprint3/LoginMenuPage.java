package Sprint3;

import java.util.Scanner;

public class LoginMenuPage {
    String ch = " ";
    Scanner sc = new Scanner(System.in);
    ExitCode exitCode = new ExitCode();
        public static void menu()
        {
            System.out.println("***********************************************");
            System.out.println("Team E - Employee Register Maintenance Utility");
            System.out.println("***********************************************");
            System.out.println("\nPress 1 : Add an Employee Details");
            System.out.println("Press 2 : Update an Employee Details ");
            System.out.println("Press 3 : Delete an Employee Details");
            System.out.println("Press 4 : View an Employee Details");
            System.out.println("Press 5 : View Employee's Leave Details");
            System.out.println("Press 6 : Exit");
        }
        public int repeat()
        {
            int i=0 ;
            System.out.print("\nDo you want to continue (Y or N) ");
            ch = sc.nextLine();
            if(ch.equalsIgnoreCase("n")){
                exitCode.out();
            }
            else
            {
                menu();
                System.out.print("\nPlease Enter choice :");
                Scanner sc = new Scanner(System.in);
                i = Integer.parseInt(sc.nextLine());

            }
            return i;
        }

    }

