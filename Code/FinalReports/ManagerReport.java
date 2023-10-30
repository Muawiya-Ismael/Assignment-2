package Code.FinalReports;

import Code.Reports.Reportable;
import Code.Reports.StaffsReport;
import Code.ReportsFactory.ReportType;
import Code.ReportsFactory.ReportsFactory;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class ManagerReport {
    public void managerReport(ReportType reportType, ArrayList<Staff>staffs){
        ReportsFactory reportT = new ReportsFactory();
        Reportable staffsReport = reportT.staffsReportType(reportType);
        staffsReport.report(staffs);
    }
}
