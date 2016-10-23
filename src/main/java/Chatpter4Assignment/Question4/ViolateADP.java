package Chatpter4Assignment.Question4;

/**
 * Created by fatimam on 2016-07-02.
 */
public class ViolateADP
{
    private String name;
    private String surname;
    private double salaryAmount;
    private double totalSalary;
    private double tax;

    Salary salaryInstance=new Salary();
    CalculateSalary calcSalary=new CalculateSalary();

    public ViolateADP(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setSalaryAmount(double salaryAmount) {
        salaryInstance.setSalary(salaryAmount);
        this.salaryAmount = getSalaryAmount();
    }

    public double getSalaryAmount()
    {
        return salaryAmount;
    }

    public double calcTotalSalary()
    {
        totalSalary=calcSalary.calculateSalary(salaryAmount);

        return totalSalary;
    }
}
