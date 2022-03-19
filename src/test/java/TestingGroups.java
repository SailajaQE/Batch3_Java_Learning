import com.codoid.products.exception.FilloException;
import org.testng.annotations.Test;

public class TestingGroups {
   /* @Test(groups = "Sanity")
    public void TC001()
    {
        System.out.println("TC001");
    }

    @Test (groups = "Smoke")
    public void TC002()
    {
        System.out.println("TC002");
    }
    @Test(groups = "Sanity")
    public void TC003()
    {
        System.out.println("TC003");
    }
    @Test(groups = "Smoke")
    public void TC004()
    {
        System.out.println("TC004");
    }*/

    @Test(priority = 2)
    public void updateRecord ()
    {
        System.out.println("Employee Updation is Passed");
    }
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
