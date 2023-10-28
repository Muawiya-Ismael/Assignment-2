package Code.BadgetCalculation;

import Code.Budget.Budgetary;
import Code.Budget.ManagersBudget;
import Code.Budget.StaffsBudget;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public  class DirectorBudget {
    public double directorBudget(double directorSalary , ArrayList<Manager> managers, ArrayList<Staff>staffs){

        Budgetary<ArrayList<Staff>> staffsBudget=new StaffsBudget();
        Budgetary<ArrayList<Manager>>mangersBudget=new ManagersBudget();

        double SB = staffsBudget.budget(staffs);
        double MB = mangersBudget.budget(managers);
        double TB = SB + MB + directorSalary;

        return TB;
    }


}
