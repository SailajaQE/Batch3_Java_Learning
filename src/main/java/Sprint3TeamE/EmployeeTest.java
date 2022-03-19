package Sprint3TeamE;

import Sprint3TeamE.OptionHandling;
import com.codoid.products.exception.FilloException;

import java.sql.SQLException;

public class EmployeeTest {

    public static void main(String[] args) throws FilloException, SQLException {
        EmployeeHomeScreen employeeHomeScreen=new EmployeeHomeScreen();
        employeeHomeScreen.menu();
        OptionHandling option=new OptionHandling();
        option.getOption();
    }
}
