package Code.Staffs;

import java.util.ArrayList;

public class Manager extends Staff {
    private ArrayList<Staff> staffs = new ArrayList<Staff>();

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public Manager(String id, String name, int age, double hourlyRate, double completedHours, ArrayList<Staff> staffs) {
        super(id, name, age, hourlyRate, completedHours);
        staffs = staffs;
    }
}
