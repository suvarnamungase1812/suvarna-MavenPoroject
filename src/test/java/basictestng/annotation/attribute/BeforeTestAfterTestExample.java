package basictestng.annotation.attribute;

import org.testng.annotations.*;

public class BeforeTestAfterTestExample {
    @BeforeTest
    public void BeforeTestExample(){System.out.println("This Is Before Test of Before After Test");}
    @BeforeClass//this will be executed before first @test method execution.
    public void BeforeClassExample(){
        System.out.println("Before Class Example of Before After Test");
    }
    @BeforeMethod//this will be executed before every @test annotation method.
    public void BeforeMethodEx(){
        System.out.println("Before Method");
    }
    @Test
    public void verifyTestCase1(){
        System.out.println("test case 1");
    }
    @Test
    public void verifyTestCase2(){
        System.out.println("test case 2");
    }
    @AfterMethod//this will be executed after every @test annotation method.
    public void AfterMethodEx(){
        System.out.println("After Method");
    }
    @AfterClass//this will be executed after all test method in the current class have been run.
    public void AfterClassExample(){
        System.out.println("After Class Example of Before After Test");
    }
    @AfterTest
    public void AfterTestExample(){System.out.println("This Is After Test of Before After Test");}
}
