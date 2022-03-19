package Sprint3E;

import com.codoid.products.exception.FilloException;

import java.util.Scanner;

public class OptionSelection {

    String option;
    Scanner scanner;

    public int getChoice(int max) {
        int choice1 = 0;
        while (choice1 <= 0 || choice1 > max) {
            System.out.println(" Enter your option: ");
            scanner = new Scanner(System.in);
            try {
                choice1 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" please check menu options ! ");
            }
        }
        return choice1;
    }

    public int selectAgain(int max) {
        int choice2=0;
        System.out.println("Select Again: ( Y / N ) ");
        scanner = new Scanner(System.in);
        option = scanner.nextLine();
        if (option.equalsIgnoreCase("y")) {
            SelectionHandling selectionHandling = new SelectionHandling();
            //OptionSelection optionSelection=new OptionSelection();
            choice2 = getChoice(max);
        }
        return choice2;
    }
    public int updateAgain(int max) {
        int choice2=0;
        System.out.println("Do You want to Update Again: ( Y / N ) ");
        scanner = new Scanner(System.in);
        option = scanner.nextLine();
        if (option.equalsIgnoreCase("y")) {
            UpdationHandling updationHandling = new UpdationHandling();
            choice2 = getChoice(max);
        }
        return choice2;
    }
    public int deleteAgain(int max) throws FilloException {
        int choice2=0;
        System.out.println("Do You want to Delete Again: ( Y / N ) ");
        scanner = new Scanner(System.in);
        option = scanner.nextLine();
        if (option.equalsIgnoreCase("y")) {
            DeletionHandling obj = new DeletionHandling();
            choice2 = getChoice(max);
        }
        return choice2;
    }
}