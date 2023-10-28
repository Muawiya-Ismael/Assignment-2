package Code.Staffs;

import java.util.*;

public class Director extends Staff {
    private ArrayList<Manager> managers = new ArrayList<Manager>();
    private ArrayList<Staff> staffs = new ArrayList<Staff>();

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public Director(double id, String name, int age, double hourlyRate, double completedHours, ArrayList<Manager> managers, ArrayList<Staff> staffs) {
        super(id, name, age, hourlyRate, completedHours);
        managers = managers;
        staffs = staffs;
    }

}
