package Chatpter4Assignment.Question4.ObeyADP;

/**
 * Created by fatimam on 2016-07-02.
 */
public class CalculateSalary
{
    private double totalSalary;

    Salary salaryAmount=new Salary();


    public CalculateSalary(){}


    public void calculateSalary(double tax,double salary)
    {
        salaryAmount.setTax(tax);
        salaryAmount.setSalary(salary);
        totalSalary=(salaryAmount.getSalary()*salaryAmount.getTax())+salaryAmount.getSalary();

    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
