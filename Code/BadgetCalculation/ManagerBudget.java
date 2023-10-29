package Code.BadgetCalculation;

import Code.Budget.Budgetary;
import Code.Budget.StaffsBudget;
import Code.Salary.SalaryType;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class ManagerBudget {
    public double managerBudget(SalaryType type , double  managerSalary , ArrayList<Staff>staffs){

        Budgetary<ArrayList<Staff>> staffsBudget=new StaffsBudget();

        double SB = staffsBudget.budget(type,staffs);
        double TB = SB + managerSalary;

        return TB;
    }
}
