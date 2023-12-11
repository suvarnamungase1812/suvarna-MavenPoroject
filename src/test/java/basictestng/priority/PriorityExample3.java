package basictestng.priority;

import org.testng.annotations.Test;

public class PriorityExample3 {

    @Test(priority ='A' )
    public void verifyTestCaseS(){
        System.out.println("test case S ");
    }
    @Test(priority = 'A')
    public void verifyTestCaseA(){
        System.out.println("test case A");
    }
    @Test
    public void verifyTestCaseK(){
        System.out.println("test case K");
    }
    @Test(priority = -4)
    public void verifyTestCaseL(){
        System.out.println("test case L");
    }
    @Test(priority = 'e')
    public void verifyTestCaseE(){
        System.out.println("test case E");
    }
}
