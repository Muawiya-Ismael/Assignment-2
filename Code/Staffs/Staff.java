package Code.Staffs;

import Code.Database.FakeDatabase;

public class Staff {
    private String id;
    private String name;
    private int age;
    private double hourlyRate;
    private double completedHours;

    public Staff(String id, String name, int age, double hourlyRate, double completedHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getCompletedHours() {
        return completedHours;
    }

}
