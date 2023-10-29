package Code.Budget;


import Code.BudgetFactory.BudgetFactory;
import Code.Salary.SalaryType;
import Code.Staffs.Manager;
import Code.Salary.Salaried;

import java.util.ArrayList;

public class ManagersBudget implements Budgetary<ArrayList<Manager>>{
    @Override
    public double budget(SalaryType type, ArrayList<Manager>managers) {
        double budget = 0;
        BudgetFactory salaryT = new BudgetFactory();
        for (Manager manager : managers) {
            Salaried calculateSalary = salaryT.salaryType(type);
            budget += calculateSalary.salary(manager.getHourlyRate(),manager.getCompletedHours());
        }
        return budget;
    }
}
