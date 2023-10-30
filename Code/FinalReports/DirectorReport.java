package Code.FinalReports;

import Code.ReportsFactory.*;
import Code.Reports.Reportable;

import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class DirectorReport {
    public void directorReport(ReportType reportType, ArrayList<Manager>managers, ArrayList<Staff>staffs){
        ReportsFactory reportT = new ReportsFactory();
        Reportable managersReport = reportT.managersReportType(reportType);
        Reportable staffsReport = reportT.staffsReportType(reportType);
        managersReport.report(managers);
        staffsReport.report(staffs);
    }
}
