package Chatpter4Assignment.Question2;

/**
 *
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
