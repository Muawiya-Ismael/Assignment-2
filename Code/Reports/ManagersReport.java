package Code.Reports;

import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;

public class ManagersReport implements Reportable <ArrayList<Manager>>{
    @Override
    public void report(ArrayList<Manager> managers) {
        for (Staff staff : managers){
            System.out.println("Name:" + staff.getName()+" Age:" + staff.getAge()+" ID:"+staff.getId()+" Hourly Rate:"+staff.getHourlyRate()+" Completed Hours:"+staff.getCompletedHours());
        }
    }
}
