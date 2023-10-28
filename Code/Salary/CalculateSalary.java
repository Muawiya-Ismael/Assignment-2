package Code.Salary;

public class CalculateSalary implements Salaired{
    @Override
    public double salary(double hourlyRate, double completedHours) {
        return hourlyRate * completedHours;
    }
}
