package Chatpter4Assignment.Question3.LiskovSubstitutionPrinciple;

/**
 *
 */
public class ViolateLSPEmp extends ViolateLSP
{
    public void setDetails(String name,String surname,int employeeNumber)
    {
        System.out.println("VoilateLSP in VoilateLSPEmp");
    }

}
