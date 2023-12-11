package basictestng.priority;

import org.testng.annotations.*;

public class PriorityExample {

    @Test//we can not define priority as a float and boolean.
    public void verifyTestCaseS(){
        System.out.println("test case S ");
    }
    @Test
    public void verifyTestCaseA(){
        System.out.println("test case A");
    }

    @Test
    public void verifyTestCaseK(){
        System.out.println("test case K");
    }
    @Test
    public void verifyTestCaseL(){
        System.out.println("test case L");
    }
    @Test
    public void verifyTestCaseE(){
        System.out.println("test case E");
    }
    @Test
    public void verifyTestCaseD(){
        System.out.println("test case D");
    }
}
