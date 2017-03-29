package Chatpter4Assignment.Question3.OpenClosedPrinciple;

/**
 *
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

