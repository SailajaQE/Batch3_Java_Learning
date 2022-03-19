package Sprint3;

import com.codoid.products.exception.FilloException;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) throws FilloException {
        int i = 0;
        //Calling the Main menu Function
        LoginMenuPage obj = new LoginMenuPage();
        Employee emp = new Employee();
        DbInterface db = new BaseMethods();
        obj.menu();
        String ch = " ";

        System.out.print("\nPlease Enter choice :");
        Scanner sc = new Scanner(System.in);
        i = Integer.parseInt(sc.nextLine());

        // Initialising loop for Menu Choices
        do {


            switch (i) {
                case 1:
                    //System.out.println("Add an Employee Details");
                    Scanner scanner=new Scanner(System.in);
                        db.insertRecord ();
                        i = obj.repeat();

                    break;
                case 2:
                    //System.out.println("Update an Employee Details");
                    db.updateRecord();
                    i=obj.repeat();


                    break;
                case 3:
                    //System.out.println("Delete an Employee Details");
                    db.deleteRecord();

                    //obj.menu();
                    i = obj.repeat();
                    break;
                case 4:
                    //System.out.println("View Employee Details");
                    db.selectRecord();
                    i=obj.repeat();

                    //obj.menu();
                    break;
                case 5 :
                    //System.out.println("Your option is applying for Leaves");
                    EmployeeLeaves employeeLeaves = new EmployeeLeaves();
                    employeeLeaves.applyLeave();
                    i=obj.repeat();

                    //obj.menu();
                    break;
                case 6:
                    System.out.println("Exit");
                    ExitCode ex = new ExitCode();
                    ex.out();
                    break;
                default:
                    System.out.println("=============================================================");
                    System.out.print("Wrong key Pressed,please enter the correct key\n");
                    System.out.println("Try again...!!!");
                    System.out.println("=============================================================");

                    System.out.print("\nDo you want to continue (Y or N) ");
                    ch = sc.nextLine();
                   if(ch.equalsIgnoreCase("n")){
                        break;
                    }
                   else
                   {
                       obj.menu();
                   }
            }
        } while(i>0 ||  i<7); //(ch.equalsIgnoreCase("Y"));

    }
}
