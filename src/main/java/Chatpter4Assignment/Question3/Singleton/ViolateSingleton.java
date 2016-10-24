package Chatpter4Assignment.Question3.Singleton.Obey;

/**
 * Created by fatimam on 2016-06-21.
 */
public class ViolateSingleton
{
    private String name;
    private double salary;
    private static double tax=0.14;


    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public double calculateSalary(double amount)
    {

        salary=amount-(amount*tax);
        return salary;
    }

}
