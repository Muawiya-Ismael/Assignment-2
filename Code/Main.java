package Code;

import java.util.ArrayList;

import Code.BadgetCalculation.DirectorBudget;
import Code.BadgetCalculation.ManagerBudget;
import Code.Reports.Reportable;
import Code.Reports.ManagersReport;
import Code.Reports.StaffsReport;
import Code.Salary.CalculateSalary;
import Code.SalaryCalculation.DirectorReport;
import Code.SalaryCalculation.ManagerReport;
import Code.Staffs.Director;
import Code.Staffs.Manager;
import Code.Staffs.Staff;


public class Main {
    public static void main(String[] args) {
        Staff s1 = new Staff(1,"s1(staff)",20,20,100);
        Staff s2 = new Staff(2,"s2(staff)",21,10,150);
        Staff s3 = new Staff(3,"s3(staff)",22,30,50);
        Staff s4 = new Staff(4,"s4(staff)",23,40,20);
        Staff s5 = new Staff(5,"s5(staff)",24,50,200);
        Manager s6 = new Manager(6,"s6(manager)",25,60,400,new ArrayList<Staff>());
        Manager s7 = new Manager(7,"s7(manager)",26,70,500,new ArrayList<Staff>());
        Staff s8 = new Staff(8,"s8(staff)",27,80,600);
        Director s9 = new Director(9,"s9(director)",28,90,300,new ArrayList<Manager>(),new ArrayList<Staff>());
        Director s0 = new Director(0,"s0(director)",29,15,75,new ArrayList<Manager>(),new ArrayList<Staff>());

        s6.getStaffs().add(s1);
        s6.getStaffs().add(s2);

        s7.getStaffs().add(s3);
        s7.getStaffs().add(s4);

        s9.getManagers().add(s6);
        s9.getStaffs().add(s5);

        s0.getManagers().add(s7);
        s0.getStaffs().add(s8);

        System.out.println("-----------------------------------------");



        DirectorReport directorReport=new DirectorReport();
        directorReport.directorReport(s9.getManagers(),s9.getStaffs());

        ManagerReport managerReport = new ManagerReport();
        managerReport.managerReport(s6.getStaffs());

        DirectorBudget s9DirectorBudget = new DirectorBudget();
        System.out.println(s9DirectorBudget.directorBudget(new CalculateSalary().salary(s9.getHourlyRate(),s9.getCompletedHours()),s9.getManagers(),s9.getStaffs()));

        ManagerBudget s6ManagerBudget = new ManagerBudget();
        System.out.println(s6ManagerBudget.managerBudget(new CalculateSalary().salary(s6.getHourlyRate(),s6.getCompletedHours()),s6.getStaffs()));



    }
}
