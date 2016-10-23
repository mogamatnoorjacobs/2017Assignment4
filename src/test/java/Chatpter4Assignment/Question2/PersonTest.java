package Chatpter4Assignment.Question2;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by fatimam on 2016-06-18.
 */
public class PersonTest extends TestCase {

    public void testCreatePersonPass() throws Exception
    {
        String result;
        PersonInterface person=new Person();
        result=person.createPerson("Noor");

        Assert.assertEquals("Noor",result);

    }

    public void testCreatePersonFail() throws Exception
    {
        String result;
        PersonInterface person=new Person();
        result=person.createPerson("Noor");

        Assert.assertEquals("Gamiet",result);

    }
}