package Chatpter4Assignment.Question3.LiskovSubstitutionPrinciple.Obey;

/**
 *
 */
public class ObeyingLSPEmp
{
    ObeyingLSP obey;

    public String setDetails(String name,String surname,int employeeNumber)
    {
        new ObeyingLSP(name,surname);
        return obey.getName()+" "+obey.getSurname()+employeeNumber;
    }
}
