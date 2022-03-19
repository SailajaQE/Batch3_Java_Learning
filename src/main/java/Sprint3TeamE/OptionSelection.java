package Sprint3TeamE;

import java.util.Scanner;

public class OptionSelection {
    int choice;
    Scanner scanner;

    public int getChoice() {
        while (choice<=0||choice>6)
        {
            System.out.println(" Enter your option: ");
            scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" please check menu options ! ");
            }
        }
        return choice;
    }
}
