package Chatpter4Assignment.Question1;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by fatimam on 2016-06-18.
 */
public class WomanTest extends TestCase {

    public void testNamePass() throws Exception
    {

        String result;
        Person womanObject = new Woman();
        womanObject.setName("Fatima");

        result=womanObject.getName();
        Assert.assertEquals("Fatima",result);
    }

    public void testNameFail() throws Exception
    {

        String result;
        Person womanObject = new Woman();
        womanObject.setName("Fatima");

        result=womanObject.getName();
        Assert.assertEquals("Noor",result);
    }
}