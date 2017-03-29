package Chatpter4Assignment.Question3.LiskovSubstitutionPrinciple;

import Chatpter4Assignment.Question3.DependencyInversionPrinciple.ViolatingEmployeeState;

/**
 *
 */
public class ViolatingLSPCheckEmployee
{
    public ViolatingEmployeeState employeeState;
    public boolean check;

    public ViolatingLSPCheckEmployee(ViolatingEmployeeState employeeState) {
        this.employeeState = employeeState;
        this.check = false;
    }
    public boolean isEmployed() {
        return this.check;
    }
    public void statusCheck()
    {
        boolean checkStatus = isEmployed();
        if (checkStatus) {
            employeeState.empUnemployed();
            this.check = false;
        } else {
            employeeState.empEmployed();
            this.check = true;
        }

    }

}
