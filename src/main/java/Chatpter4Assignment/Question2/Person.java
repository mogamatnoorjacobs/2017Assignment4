package Chatpter4Assignment.Question2;

/**
 * Created by fatimam on 2016-06-18.
 */
public class Person implements PersonInterface
{
    private String name;
    public Person(){}

    public String createPerson(String name)
    {
        this.name=name;

        return this.name;
    }

}
