package day4;

public class Pattern4 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
