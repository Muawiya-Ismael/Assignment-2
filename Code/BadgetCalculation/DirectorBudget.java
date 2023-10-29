package Code.BadgetCalculation;

import Code.Budget.Budgetary;
import Code.Budget.ManagersBudget;
import Code.Budget.StaffsBudget;
import Code.Salary.SalaryType;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public  class DirectorBudget {
    public double directorBudget(SalaryType type , double directorSalary , ArrayList<Manager> managers, ArrayList<Staff>staffs){

        Budgetary<ArrayList<Staff>> staffsBudget=new StaffsBudget();
        Budgetary<ArrayList<Manager>>mangersBudget=new ManagersBudget();

        double SB = staffsBudget.budget(type,staffs);
        double MB = mangersBudget.budget(type,managers);
        double TB = SB + MB + directorSalary;

        return TB;
    }


}
