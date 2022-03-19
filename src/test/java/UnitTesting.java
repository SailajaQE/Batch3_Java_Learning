import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UnitTesting {
    @Test(priority = 1)
    public void Method1()
    {
        System.out.println("Welcome to TestNG");
    }

    @Test(priority = 2)
    public void Calculate()
    {
        System.out.println("Addition is 7");

    }
    @Test(enabled = false)
    public void Method2()
    {
        System.out.println("skip ");

    }

    @Test(priority = 4)
    public void Method3()
    {
        System.out.println("This output will go to the second call");
    }

    @Test(dependsOnMethods = "Method3")
    public void Method4()
    {
        System.out.println("this needs to run after the Method3");
    }

}
