package Code.SalaryCalculation;

import Code.Reports.ManagersReport;
import Code.Reports.Reportable;
import Code.Reports.StaffsReport;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class ManagerReport {
    public void managerReport(ArrayList<Staff>staffs){
        Reportable staffsReport = new StaffsReport();
        staffsReport.report(staffs);
    }
}
