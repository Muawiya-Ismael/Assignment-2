package Code.BudgetFactory;

import Code.Salary.CalculateSalary;
import Code.Salary.Salaried;
import Code.Salary.SalaryType;

public class BudgetFactory {
    public Salaried salaryType(SalaryType type){
        Salaried salaried = null;
        if(SalaryType.NORMAL.equals(type)){
            salaried =  new CalculateSalary();
        }
        return salaried;
    }
}
