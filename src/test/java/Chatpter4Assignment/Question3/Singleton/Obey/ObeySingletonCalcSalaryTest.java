package Chatpter4Assignment.Question3.Singleton.Obey;

import junit.framework.TestCase;

/**
 * Created by fatimam on 29/03/2017.
 */
public class ObeySingletonCalcSalaryTest extends TestCase {
    public void testCalculateSalary() throws Exception {
        ObeySingletonCalcSalary calc=new ObeySingletonCalcSalary();
        double expected=11.4;
        double result=calc.calculateSalary(10.00);
        assertEquals(expected,result);

    }

}