package Chatpter4Assignment.Question3.OpenClosedPrinciple.Obey;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class PersonObeyOCPTest extends TestCase {
    public void testCreatePersonName() throws Exception
    {
        PersonObeyOCP obey=new PersonObeyOCP();

        String expected = "Noor";
        String results=obey.createPersonName("Noor");
        Assert.assertEquals(expected,results);
    }


}