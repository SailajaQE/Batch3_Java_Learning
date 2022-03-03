package day15;

public class LoginMenu {

        public void menu()
        {
            System.out.println("***********************************************");
            System.out.println("Team E - Employee Register Maintenance Utility");
            System.out.println("***********************************************");
            System.out.println("\nPress 1 : Add an Employee Details");
            System.out.println("Press 2 : Update an Employee Details ");
            System.out.println("Press 3 : Delete an Employee Details");
            System.out.println("Press 4 : View Employee's Leave Details");
            System.out.println("Press 5 : Exit");

        }

    public static void main(String[] args) {
        LoginMenu obj = new LoginMenu();
        obj.menu();
    }
    }

