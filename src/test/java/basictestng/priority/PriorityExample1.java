package basictestng.priority;

import org.testng.annotations.Test;

public class PriorityExample1 {
    @Test(priority =1 )
    public void verifyTestCaseS(){
        System.out.println("test case S ");
    }
    @Test(priority = 2)
    public void verifyTestCaseA(){
        System.out.println("test case A");
    }
    @Test(priority =3 )
    public void verifyTestCaseK(){
        System.out.println("test case K");
    }
    @Test(priority = 4)
    public void verifyTestCaseL(){
        System.out.println("test case L");
    }
    @Test(priority = 5)
    public void verifyTestCaseE(){
        System.out.println("test case E");
    }
    @Test(priority = 6)
    public void verifyTestCaseD(){
        System.out.println("test case D");
    }
}


