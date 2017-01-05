package main.java.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by neeraj.bhatnagar on 12/15/2016.
 */
public class assertion {

    @Test
    public void assertionTest(){

        try {
            // hard Assert will fail test case & execution will stop.
            Assert.assertEquals("Test", "Test1", "Expected & Actual Values do not match");
            //Assert.fail("Test Case failed");
        } catch (Exception e)
        {
            e.getMessage();
        }

        Assert.assertEquals("Test2", "Test2", "Exspected & Actual Not matching");

    }
}
