package Chatpter4Assignment.Question3.OpenClosedPrinciple.Obey;

/**
 * Created by fatimam on 2016-06-26.
 */
public class StudentViolateOCP
{
    private String name;
    public StudentViolateOCP(){}



    public String createPersonName(String name)
    {
        this.name=name;

        return this.name;
    }
}

