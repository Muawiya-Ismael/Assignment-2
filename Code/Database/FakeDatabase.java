package Code.Database;

import Code.Staffs.Director;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FakeDatabase {
    private static FakeDatabase database = null;

    private Map<String,Staff>staffs = new HashMap<>();

    public  static  FakeDatabase getConnection(){
        System.out.println("getConnection .. ");

        if(database != null){
            System.out.println("Database Object Reused.");
        }

        if (database == null) {
            System.out.println("New Database Object Created.");
            database = new FakeDatabase();
        }

        return database;

    }


    private FakeDatabase() {
        connect();
    }

    public void connect() {
        System.out.println("Connected!");
    }

    public Staff getStaff(String staffID){
        return staffs.get(staffID);
    }
    public void addStaff(Staff staff){
        staffs.put(staff.getId(),staff);
        getConnection();
    }

}
