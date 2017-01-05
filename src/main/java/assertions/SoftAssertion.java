package main.java.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by neeraj.bhatnagar on 12/16/2016.
 * https://www.youtube.com/watch?v=JJygt4XCLBo
 * https://www.youtube.com/watch?v=hmgS055VBpQ
 */
public class SoftAssertion {

    @Test
    public void softAssertionTest(){
        SoftAssert assertion = new SoftAssert();
        try {
            assertion.assertEquals("Test", "Test1", "Expected & Actual Values do not match");
            //Assert.fail("Test Case failed");
        } catch (Exception e)
        {
            e.getMessage();
        }

        Assert.assertEquals("Test2", "Test2", "Exspected & Actual Not matching");
        assertion.assertAll(); // Will print failed assertion


    }


}
