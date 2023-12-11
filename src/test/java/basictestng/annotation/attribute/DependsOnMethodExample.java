package basictestng.annotation.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test(groups = "smoke")
        public void verifyLogIn(){
            System.out.println("Login Functionality");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"verifyLogIn"})
    public  void verifyHomePage(){
        System.out.println("Home Page");
    }
    @Test
    public void verifyLogOut(){
        System.out.println("Log Out");
    }
    }

