package Code.Salary;

public class SalaryFactory {
    public Salaired calculationProcess(String calculationType){
        if(calculationType == "staff"){
            return new CalculateSalary();
        }
        else {

            return null;
        }
    }
}
