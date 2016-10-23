package Chatpter4Assignment.Question1;

/**
 * Created by fatimam on 2016-06-18.
 */
public class Woman extends Person {
    private String name;

    public Woman() {

    }

    public Woman(String value)
    {
        super.setName(value);

        name = super.getName();
    }

    public String name(String value)
    {
        super.setName(value);

        name = super.getName();
        return name;
    }

}
