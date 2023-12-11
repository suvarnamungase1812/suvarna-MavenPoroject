package basictestng.annotation.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableExample {
    @Test
    public void verifyLogIn(){
        System.out.println("Login Functionality");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"verifyLogIn"},alwaysRun = true)
    public  void verifyHomePage(){
        System.out.println("Home Page");
    }
    @Test
    public void verifyLogOut(){
        System.out.println("Log Out");
    }
}
