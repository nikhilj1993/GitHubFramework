package testclasses;

import baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass extends BaseClass {

    @Test
    public void failedTest(){
        driver.get("https://www.google.com");
        System.out.println("*****************Dummy Failed Test*****************");
        Assert.fail();
    }

    @Test
    public void passedTest(){
        driver.get("https://www.facebook.com");
        System.out.println("******************Dummy Passed Test**********");
        Assert.assertTrue(true);
    }
}
