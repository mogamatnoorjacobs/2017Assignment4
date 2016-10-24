package Chatpter4Assignment.Question3.LiskovSubstitutionPrinciple.Obey;

/**
 * Created by fatimam on 2016-06-26.
 */
public class ObeyingLSPEmp
{
    ObeyingLSP obey=new ObeyingLSP();

    public void setDetails(String name,String surname,int employeeNumber)
    {
        obey.setDetails(name,surname);
        System.out.println("VoilateLSP in VoilateLSPEmp");
    }
}
