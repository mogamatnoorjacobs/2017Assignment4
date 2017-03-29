package Chatpter4Assignment.Question4.ObeyADP;

import junit.framework.TestCase;

/**
 *
 */
public class CalculateSalaryTest extends TestCase {
    public void testGetTotalSalary() throws Exception
    {
        CalculateSalary calc=new CalculateSalary();
        calc.calculateSalary(1.0,1.0);
        double expected=2.0;

        assertEquals(expected,calc.getTotalSalary());

    }
}