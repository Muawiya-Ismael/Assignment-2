package Code.Budget;


import Code.Salary.CalculateSalary;
import Code.Salary.Salaired;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class StaffsBudget implements Budgetary <ArrayList<Staff>>{
    @Override
    public double budget(ArrayList<Staff>staffs) {
        double budget = 0;
        for (Staff staff : staffs) {
            Salaired calculateSalary=new CalculateSalary();
            budget += calculateSalary.salary(staff.getHourlyRate(),staff.getCompletedHours());
        }
       return budget;
    }
}
