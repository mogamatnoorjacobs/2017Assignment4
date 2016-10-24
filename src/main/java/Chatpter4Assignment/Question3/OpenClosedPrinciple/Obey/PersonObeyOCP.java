package Chatpter4Assignment.Question3;

/**
 * Created by fatimam on 2016-06-25.
 */
public class PersonObeyOCP
{
    private String name;
    public PersonObeyOCP(){}



    public String createPersonName(String name)
    {
        this.name=name;

        return this.name;
    }
}
