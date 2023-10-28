package Code.Reports.v1;

import Code.Staffs.Manager;
import Code.Staffs.Staff;

public class ManagerStaffsReport implements ListOfStaff<Manager> {

    @Override
    public void staffsReport(Manager manager) {
        for (Staff staff : manager.getStaffs()){
            System.out.println("Name:" + staff.getName()+" Age:" + staff.getAge()+" ID:"+staff.getId()+" Hourly Rate:"+staff.getHourlyRate()+" Completed Hours:"+staff.getCompletedHours());
        }
    }
}
