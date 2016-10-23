package Chatpter4Assignment.Question4;

/**
 * Created by fatimam on 2016-07-02.
 */
public class CalculateSalary
{
    public CalculateSalary(){}

    ViolateADP adp=new ViolateADP();
    Salary salaryAmount=new Salary();

    private double totalSalary;
    private double tax=0.14;

    public double calculateSalary(double salary)
    {
        adp.setTax(tax);
        return totalSalary=(salaryAmount.getSalary()*adp.getTax())+salaryAmount.getSalary();

    }
}
