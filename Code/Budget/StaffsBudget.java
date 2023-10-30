package Code.Budget;


import Code.BudgetFactory.BudgetFactory;
import Code.Salary.Salaried;
import Code.Salary.SalaryType;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class StaffsBudget implements Budgetary <ArrayList<Staff>>{
    @Override
    public double budget(SalaryType type, ArrayList<Staff>staffs) {
        double budget = 0;
        BudgetFactory salaryT = new BudgetFactory();
        for (Staff staff : staffs) {
            Salaried calculateSalary = salaryT.salaryType(type);
            budget += calculateSalary.salary(staff.getHourlyRate(),staff.getCompletedHours());
        }
       return budget;
    }
}
