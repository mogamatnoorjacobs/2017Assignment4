package Chatpter4Assignment.Question3.DependencyInversionPrinciple.Obey;

/**
 *
 */
public class Person implements checkingStatuses,StatusCheck
{

    private checkingStatuses person;
    private boolean check;

    public Person(){}

    public Person(boolean check) {
           this.check = check;
    }

    public void setCheck(boolean check) {
        this.check = check;

    }
    public boolean isChecked() {
        return this.check;
    }
    public void statusCheck(){
        boolean checking = isChecked();
        if (checking) {
            this.check = false;
            person.checkStatusFalse();

        }
        else {
            this.check = true;
            person.checkStatusTrue();

        }

    }

    @Override
    public void checkStatusTrue() {
        System.out.println("Employee: Employed");
    }

    @Override
    public void checkStatusFalse() {
        System.out.println("Employee: Unemployed");
    }


}
