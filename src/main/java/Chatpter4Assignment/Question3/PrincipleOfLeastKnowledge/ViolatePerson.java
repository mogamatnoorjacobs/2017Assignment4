package Chatpter4Assignment.Question3.PrincipleOfLeastKnowledge;

import java.text.SimpleDateFormat;

/**
 * Created by fatimam on 2016-06-29.
 */
public class ViolatePerson implements ViolatePersonInterface
{
    private String name;
    public ViolatePerson(){}

    SimpleDateFormat formatOfDate = new SimpleDateFormat("dd/MM/yyyy");

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
