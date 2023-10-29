package Code.Budget;

import Code.Salary.SalaryType;

public interface Budgetary <Type>{
    double budget(SalaryType salaryType, Type type);
}
