package Chatpter4Assignment.Question3.DependencyInversionPrinciple.Obey;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 */
public class PersonTest extends TestCase {

    public void testStatusCheck() throws Exception
    {
         boolean person=true;

        Person checkingPersonStatus=new Person(true);

        boolean check=checkingPersonStatus.isChecked();
        Assert.assertTrue(check);

    }
}