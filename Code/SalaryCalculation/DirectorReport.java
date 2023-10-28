package Code.SalaryCalculation;

import Code.Reports.ManagersReport;
import Code.Reports.Reportable;
import Code.Reports.StaffsReport;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class DirectorReport {
    public void directorReport(ArrayList<Manager>managers, ArrayList<Staff>staffs){
        Reportable managersReport = new ManagersReport();
        Reportable staffsReport = new StaffsReport();
        managersReport.report(managers);
        staffsReport.report(staffs);
    }
}
