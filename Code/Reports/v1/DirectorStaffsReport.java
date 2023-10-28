package Code.Reports.v1;

import Code.Staffs.Director;
import Code.Staffs.Staff;

public class DirectorStaffsReport implements ListOfStaff<Director> {

    @Override
    public void staffsReport(Director director) {
        for (Staff staff : director.getStaffs()){
            System.out.println("Name:" + staff.getName()+" Age:" + staff.getAge()+" ID:"+staff.getId()+" Hourly Rate:"+staff.getHourlyRate()+" Completed Hours:"+staff.getCompletedHours());
        }
    }
}