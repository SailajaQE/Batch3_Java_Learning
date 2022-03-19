package day18;
import java.util.Scanner;
public class EnumUSAHolidays {
        USAEnum day;

        public EnumUSAHolidays(USAEnum day) { this.day = day; }

        public void checkHoliday()
        {
            int count =0;
            switch (day) {
                case NEW_YEARS_DAY:
                    System.out.println("NEW_YEARS_DAY is a USA Holiday");
                    break;
                case BIRTHDAY_OF_MARTIN_LUTHER_KING_JR:
                    System.out.println("BIRTHDAY_OF_MARTIN_LUTHER_KING_JR is a USA Holiday");
                    break;
                case MEMORIAL_DAY:
                    System.out.println(" MEMORIAL_DAY is a USA Holiday");
                    break;
                case INDEPENDENCE_DAY:
                    System.out.println("INDEPENDENCE_DAY is a USA Holiday");
                    break;
                case COLUMBUS_DAY:
                    System.out.println("COLUMBUS_DAY is a USA Holiday");
                    break;
                case VETERANS_DAY:
                    System.out.println("VETERANS_DAY is a USA Holiday");
                    break;
                case THANKSGIVING_DAY:
                    System.out.println("THANKSGIVING_DAY is a USA Holiday");
                    break;
                case CHRISTMAS_DAY:
                    System.out.println("CHRISTMAS_DAY is a USA Holiday");
                    break;
                default:
                    System.out.println("Try once again. It is not a USA Holiday");

            }
        }
 public static void main(String[] args)
        {
            USAEnum arr[] = USAEnum.values();
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.print("\nPlease Enter the Holiday :");
            str = sc.nextLine();
            //System.out.println(str);
            //str = "THANKSGIVING_DAY" ;
            EnumUSAHolidays H = new EnumUSAHolidays(USAEnum.valueOf(str));
            H.checkHoliday();
        }
    }

