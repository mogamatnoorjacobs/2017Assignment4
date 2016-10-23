package Chatpter4Assignment.Question1;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by fatimam on 2016-06-18.
 */
public class ManTest extends TestCase {

    public void testNamePass() throws Exception
    {
        String result;
        Person manObject = new Man();
        manObject.setName("Noor");

        result=manObject.getName();
        Assert.assertEquals("Noor",result);

    }

    public void testNameFail() throws Exception
    {
        String result;
        Person manObject = new Man();
        manObject.setName("Noor");

        result=manObject.getName();
        Assert.assertEquals("Mogamat",result);

    }
}