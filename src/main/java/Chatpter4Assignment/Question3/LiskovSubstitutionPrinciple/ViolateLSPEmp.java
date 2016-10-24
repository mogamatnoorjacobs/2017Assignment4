package Chatpter4Assignment.Question3.LiskovSubstitutionPrinciple.Obey;

/**
 * Created by fatimam on 2016-06-26.
 */
public class ViolateLSPEmp extends ViolateLSP
{
    public void setDetails(String name,String surname,int employeeNumber)
    {
        System.out.println("VoilateLSP in VoilateLSPEmp");
    }

}
