package Chatpter4Assignment.Question4.ObeyADP;

/**
 * Created by fatimam on 2016-07-02.
 */
public class Employee
{
    ADP personalDetails=new ADP();
    CalculateSalary calculateSalaries=new CalculateSalary();

    public void paySlip(String name,String surname,double salary,double tax)
    {
        personalDetails.setName(name);
        personalDetails.setSurname(surname);
        calculateSalaries.calculateSalary(salary,tax);

        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Salary: "+salary);
        System.out.println("Tax: "+tax);
        System.out.println("Total Salary: "+calculateSalaries.getTotalSalary());
    }
}
