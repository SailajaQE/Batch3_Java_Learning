package day18;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*for (DAYS d: DAYS.values())
        {
            System.out.println(d);
        }*/
    DAYS day = DAYS.Monday;


        switch (day) {
            case Sunday:
                System.out.println("Sunday");
                break;
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            case Wednesday:
                System.out.println("Wednesday");
                break;
            case Thursday:
                System.out.println("Thursday");
                break;
            case Friday:
                System.out.println("Fri");
                break;
            default:
                System.out.println("Its wrong");

        }
        }
    }

