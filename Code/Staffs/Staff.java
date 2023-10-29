package Code.Staffs;

import Code.Database.FakeDatabase;

public class Staff {
    private double id;
    private String name;
    private int age;
    private double hourlyRate;
    private double completedHours;//completed hours for each month.

    public Staff(double id, String name, int age, double hourlyRate, double completedHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;

    }

    public double getId() {
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
