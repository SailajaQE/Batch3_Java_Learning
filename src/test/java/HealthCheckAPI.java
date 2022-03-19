import com.codoid.products.exception.FilloException;
import org.testng.annotations.Test;
public class HealthCheckAPI {
    @Test(priority = 4)
    public void selectRecord ()
    {
        System.out.println("Employee Selection Details is Passed");
    }
    @Test(priority = 1)
    public void insertRecord () throws FilloException
    {
        System.out.println("Adding Employee is passed");
    }
    @Test(priority = 2)
    public void updateRecord ()
    {
        System.out.println("Employee Updation is Passed");
    }
    @Test(priority = 3)
    public void deleteRecord () throws FilloException
    {
        System.out.println("Employee deletion is passed");
    }
    @Test(priority = 5)
    public void applyLeave() throws FilloException
    {
        System.out.println("Apply Employee Leave is passed");
    }

}
