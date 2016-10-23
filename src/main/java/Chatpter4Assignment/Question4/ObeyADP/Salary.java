package Chatpter4Assignment.Question4.ObeyADP;

/**
 * Created by fatimam on 2016-07-02.
 */
public class Salary
{
    public Salary(){}

    private double salary;
    private double tax=0.00;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
