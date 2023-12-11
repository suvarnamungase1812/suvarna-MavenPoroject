package basictestng.annotation.attribute;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount =5)
    public void loginTest(){
        System.out.println("login");
    }
}
