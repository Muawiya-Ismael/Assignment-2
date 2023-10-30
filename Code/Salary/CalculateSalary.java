package Code.Salary;

public class CalculateSalary implements Salaried {
    @Override
    public double salary(double hourlyRate, double completedHours) {
        return hourlyRate * completedHours;
    }
}
