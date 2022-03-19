import io.cucumber.java.BeforeStep;
import org.testng.annotations.*;

public class MoreAnnatations {
    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("Before suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @Test
    public void test()
    {
        System.out.println("Test");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After suit");
    }

}
