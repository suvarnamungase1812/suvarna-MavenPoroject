package failetestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptsExecution {
    @Test(retryAnalyzer = ExecuteFailTestScripts.class)
    public void verifyTestCase1() {
        System.out.println("verify test case 1 ");
    }

    @Test
    public void verifyTestCase2() {
        Assert.assertTrue(false);
        System.out.println("verify test case 2 ");
    }

    @Test
    public void verifyTestCase3() {
        Assert.assertTrue(false);
        System.out.println("verify test case 3 ");
    }

    @Test
    public void verifyTestCase4() {
        System.out.println("verify test case 4 ");
    }

    @Test
    public void verifyTestCase5() {
        System.out.println("verify test case 5 ");
    }

    @Test
    public void verifyTestCase6() {
        System.out.println("verify test case 6 ");}
    }