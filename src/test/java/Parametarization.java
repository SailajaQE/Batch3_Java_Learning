import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarization {
    @Test
    @Parameters({"TestCase","Status"})
    public void regression(String testcase,String status)
    {
        System.out.println("Running testcase :"+testcase);
        System.out.println("Status of the test case:"+status);
    }
}
