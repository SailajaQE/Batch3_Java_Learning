package Sprint3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Leaves_Menu {

    int maternity_leave;
    int floating_holiday;
    int sick_leave;
    int personal_leave;
    int usa_holidays;

    public  static void menu() {
        System.out.println("-------------------------------");
        System.out.println(" 1  : Paternity_leave");
        System.out.println(" 2  : Maternity_leave");
        System.out.println(" 3  : Personal_holiday");
        System.out.println(" 4  : Sick_leave");
        System.out.println(" 5  : Floating_leave");
        System.out.println(" 6  : USA Holidays (NewYears_Day,  Martin_Luther_King_Day, Memorial_Day,Independence_Day,Labor_Day," +
                                  "\n \t\t \t Columbus_Day,Veterans_Day,Thanksgiving_Day,Christmas_Day)");
    }
}
