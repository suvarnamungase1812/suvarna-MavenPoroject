package basictestng.annotation.attribute;

import org.testng.annotations.Test;

public class InvocationTimeOutExample {
    @Test(invocationCount = 4,invocationTimeOut = 20)
    public void flipkartMethod(){
        System.out.println("This Is The Flipkart Method");
    }
}
