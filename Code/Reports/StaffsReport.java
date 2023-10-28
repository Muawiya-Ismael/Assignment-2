package Code.Reports;

import Code.Staffs.Staff;

import java.util.ArrayList;

public class StaffsReport implements Reportable <ArrayList<Staff>>{
    @Override
    public void report(ArrayList<Staff> staffs) {
        for (Staff staff : staffs){
            System.out.println("Name:" + staff.getName()+" Age:" + staff.getAge()+" ID:"+staff.getId()+" Hourly Rate:"+staff.getHourlyRate()+" Completed Hours:"+staff.getCompletedHours());
        }
    }
}
