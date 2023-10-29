package Code.ReportsFactory;

import Code.Reports.ManagersReport;
import Code.Reports.Reportable;
import Code.Reports.StaffsReport;

public class ReportsFactory {
    public Reportable staffsReportType(ReportType reportType){
        Reportable reportable = null;
        if(ReportType.NORMAL.equals(reportType)){
            reportable = new StaffsReport();
        }
        return reportable;
    }
    public Reportable managersReportType(ReportType reportType){
        Reportable reportable= null;
        if(ReportType.NORMAL.equals(reportType)){
            reportable = new ManagersReport();
        }
        return reportable;
    }
}
