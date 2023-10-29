package Code.Database;

import Code.Staffs.Director;
import Code.Staffs.Manager;
import Code.Staffs.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FakeDatabase {
    private static FakeDatabase database = null;
    private String url;
    private Boolean status;

    /*Staff s1 = 	new Staff(1,"s1(staff)",20,20,100);
    Staff s2 =	new Staff(2,"s2(staff)",21,10,150);
    Staff s3 = 	new Staff(3,"s3(staff)",22,30,50);
    Staff s4 = 	new Staff(4,"s4(staff)",23,40,20);
    Staff s5 = 	new Staff(5,"s5(staff)",24,50,200);
    Manager s6 = 	new Manager(6,"s6(manager)",25,60,400,new ArrayList<Staff>());
    Manager s7 = 	new Manager(7,"s7(manager)",26,70,500,new ArrayList<Staff>());
    Staff s8 = 	new Staff(8,"s8(staff)",27,80,600);
    Director s9 = 	new Director(9,"s9(director)",28,90,300,new ArrayList<Manager>(),new ArrayList<Staff>());
    Director s0 = 	new Director(0,"s0(director)",29,15,75,new ArrayList<Manager>(),new ArrayList<Staff>());

    ArrayList<Staff> staffs =null;
    staffs.add(s1);*/



    public  static  FakeDatabase getConnection(String url){
        System.out.println("getConnection .. ");

        if(database != null){
            System.out.println("Database Object Reused.");
        }

        if (database == null) {
            System.out.println("New Database Object Created.");
            database = new FakeDatabase(url);
        }

        return database;

    }


    private FakeDatabase(String url) {
        status = false;
        this.url = url;
        connect(this.url);
    }
    public void connect(String url) {
        System.out.println("Connected!");
    }

    public Boolean getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object object){
        if(object !=null && this == object){
            return true;
        }
        if(object instanceof FakeDatabase){
            return false;
        }
        FakeDatabase database =(FakeDatabase) object;
        if(this.url.equals(database.url)){
            return true;
        }

        return false;

    }

}
