package Code;

import java.util.ArrayList;

import Code.BadgetCalculation.DirectorBudget;
import Code.BadgetCalculation.ManagerBudget;
import Code.Database.FakeDatabase;
import Code.ReportsFactory.ReportType;
import Code.Salary.CalculateSalary;
import Code.FinalReports.DirectorReport;
import Code.FinalReports.ManagerReport;
import Code.Salary.SalaryType;
import Code.Staffs.Director;
import Code.Staffs.Manager;
import Code.Staffs.Staff;


public class Main {
    public static void main(String[] args) {
        //final String DATABASE_URL = "127.0.0:44433/myDB";

        System.out.println("Initialization Section----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        FakeDatabase database = FakeDatabase.getConnection() ;


        Staff s1 = new Staff("1","s1(staff)",20,20,100);
        Staff s2 = new Staff("2","s2(staff)",21,10,150);
        Staff s3 = new Staff("3","s3(staff)",22,30,50);
        Staff s4 = new Staff("4","s4(staff)",23,40,20);
        Staff s5 = new Staff("5","s5(staff)",24,50,200);
        Manager s6 = new Manager("6","s6(manager)",25,60,400,new ArrayList<Staff>());
        Manager s7 = new Manager("7","s7(manager)",26,70,500,new ArrayList<Staff>());
        Staff s8 = new Staff("8","s8(staff)",27,80,600);
        Director s9 = new Director("9","s9(director)",28,90,300,new ArrayList<Manager>(),new ArrayList<Staff>());
        Director s0 = new Director("0","s0(director)",29,15,75,new ArrayList<Manager>(),new ArrayList<Staff>());


        database.addStaff(s1);
        database.addStaff(s2);
        database.addStaff(s3);
        database.addStaff(s4);
        database.addStaff(s5);
        database.addStaff(s6);
        database.addStaff(s7);
        database.addStaff(s8);
        database.addStaff(s9);
        database.addStaff(s0);



        s6.getStaffs().add(s1);
        s6.getStaffs().add(s2);

        s7.getStaffs().add(s3);
        s7.getStaffs().add(s4);

        s9.getManagers().add(s6);
        s9.getStaffs().add(s5);

        s0.getManagers().add(s7);
        s0.getStaffs().add(s8);

        System.out.println(" ");
        System.out.println("Operation Section----------------------------------------------------------------------------------------------------------------------------------------");

        //FakeDatabase database2 = FakeDatabase.getConnection(DATABASE_URL);

        System.out.println("\n"+"s9 director");
        DirectorReport directorReport=new DirectorReport();
        directorReport.directorReport(ReportType.NORMAL,s9.getManagers(),s9.getStaffs());

        System.out.println("\n"+"s6 manager");
        ManagerReport managerReport = new ManagerReport();
        managerReport.managerReport(ReportType.NORMAL,s6.getStaffs());

        System.out.print("\n"+"s9 director budget: ");
        DirectorBudget s9DirectorBudget = new DirectorBudget();
        System.out.println(s9DirectorBudget.directorBudget(SalaryType.NORMAL,new CalculateSalary().salary(s9.getHourlyRate(),s9.getCompletedHours()),s9.getManagers(),s9.getStaffs()));

        System.out.print("\n"+"s6 manager budget: ");
        ManagerBudget s6ManagerBudget = new ManagerBudget();
        System.out.println(s6ManagerBudget.managerBudget(SalaryType.NORMAL,new CalculateSalary().salary(s6.getHourlyRate(),s6.getCompletedHours()),s6.getStaffs()));

    }

}
