# Assignment-2
In general I will describe each package.<br>

### Main
Main class has small application<br>

### Staffs Package
This package has three class in it parent class ```Staff``` and two child classes ```Director``` and ```Manager```. <br>
- ```Staff``` class has general attributes mentioned in assignment PDF file. <br>
- ```Manager``` class is a child from Staff and it has one more attribute ```private ArrayList<Staff> staffs = new ArrayList<Staff>();```.<br>
- ```Director``` class is a child from Staff and it has two more attributes ```private ArrayList<Staff> staffs = new ArrayList<Staff>();``` ```private ArrayList<Staff> staffs = new ArrayList<Staff>();```.
  <br><br> ![image](https://github.com/Muawiya-Ismael/Assignment-2/assets/116707240/7e43fe92-deaf-405d-a53d-e95a636c6b49) <br><br>



### Salary Package
It has one interface ```Salaried``` , Enum ```SalaryType``` that contans salary calculation way nams and has class ```CalculateSalary``` that implements Salaried interface <br>
- ```Salaried``` interface has on fanction ```double salary(double hourlyRate, double completedHours);```.<br>
- ```CalculateSalary``` class override the salary function and simply calculate salary by multiply two parameters.<br>
  I declared Salaried as a interface not as a class in short way to make it simple in future to add more ways to calculate salary by giving an example if you want to calculate salary with 5% more mony bar hour Enum will help with calculating salary for budget.
  <br><br> ![image](https://github.com/Muawiya-Ismael/Assignment-2/assets/116707240/de821088-35f6-46ed-b9dd-6e0cf842ecd0) <br><br>


### Budget Package
```Budgetary``` interface has one function ```double budget(SalaryType salaryType, Type type);``` this function get overridden by two classes ```ManagersBudget``` ```StaffsBudget``` those classes work is to calculate budget __Staffs__ or __Managers__ get supervised by __Director__ or __Manager__ , keep in mind ability to specify salary calculation type in ```salaryType``` using __Enum__ and __BudgetFactory__ class using function ```BudgetFactory()``` and ability to add more __Staffes__ types get supervised. <br><br>

### BudgetCalculation Package
This packeg contains two classes ```DirectorBudget``` and ```ManagerBudget``` in general those classes work is to calculate total budget for the __Director__ or __Manager__  including there __salary__ and __sum__ of staffs supervised by them, keep in mind ability to specify salary calculation type and more supervisor's budget calculation types. <br><br>

### BudgetFactory Package
Has ```BudgetFactory``` class this class mission is to reduce dependency for __BudgetCalculation__ and __BudgetPackage__ on concrete with __Enum__ help.
<br><br> ![image](https://github.com/Muawiya-Ismael/Assignment-2/assets/116707240/601149e5-f0e7-47fc-8944-56dcb99795fc) <br><br>

### Reports Package
This package contains ```Reportable``` interface has ```public void report(ArrayList<Manager> managers)``` function that get overridden by two classes ```ManagersReport``` and ```StaffsReport``` <br>
Those classes work is to display report and ```Reportable``` interface allows you to add new rports for new __staffs__ types<br><br>

### FinalReports Package
In this package classes that usese each staff report class to creat a full report for each supervisor <br><br>

### ReportsFactory Package
This package is responsible reduce dependency for __ReportsPackage__ __FinalReportsPackage__ on concrete with __Enum__ help.
<br><br> ![image](https://github.com/Muawiya-Ismael/Assignment-2/assets/116707240/e4bfff30-b26d-411c-b168-889efebf57cd) <br><br>

### Database Package
This package contains ```FakeDatabase``` class that simulate real database environment in which each data created should be send and get stored in database in most efficient way.
<br><br> ![image](https://github.com/Muawiya-Ismael/Assignment-2/assets/116707240/7310a324-8573-4d6b-b9a9-90dbdd1e1bc9) <br><br>
