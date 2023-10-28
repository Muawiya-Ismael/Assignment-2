package Code.Budget;


import Code.Staffs.Manager;
import Code.Salary.CalculateSalary;
import Code.Salary.Salaired;

import java.util.ArrayList;

public class ManagersBudget implements Budgetary<ArrayList<Manager>>{
    @Override
    public double budget(ArrayList<Manager>managers) {
        double budget = 0;
        for (Manager manager : managers) {
            Salaired calculateSalary=new CalculateSalary();
            budget += calculateSalary.salary(manager.getHourlyRate(),manager.getCompletedHours());
        }
        return budget;
    }
}
