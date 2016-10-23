package Chatpter4Assignment.Question3.DependencyInversionPrinciple.Obey;

/**
 * Created by fatimam on 2016-06-26.
 */
public class Person implements checkingStatuses,StatusCheck
{
    public Person(){}
    private checkingStatuses person;
    private boolean check;

    public Person(checkingStatuses persons) {
        this.person = persons;
        this.check = false;
    }


    public boolean isChecked() {
        return this.check;
    }
    public void statusCheck(){
        boolean checking = isChecked();
        if (checking) {
            person.checkStatusFalse();
            this.check = false;
        }
        else {
            person.checkStatusTrue();
            this.check = true;
        }

    }

    @Override
    public void checkStatusTrue() {

    }

    @Override
    public void checkStatusFalse() {

    }

    /*
    @Override
    public void checkStatusTrue() {
        System.out.println("Employee: Employed");
    }

    @Override
    public void checkStatusFalse() {
        System.out.println("Employee: Unemployed");
    }*/
}
