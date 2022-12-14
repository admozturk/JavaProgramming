package day31_Constructors.Tasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate,federalTaxRate;
    public int  weeklyHours;

    public SalaryCalculator(double hourlyRate, int weeklyHours,double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate =federalTaxRate;

    }

    public double salary(){
      return hourlyRate*weeklyHours*2;

    }
    public double stateTax(){
     return salary() * stateTaxRate / 100;
    }

    public double federalTax(){
        return salary() * federalTaxRate /100;
    }

    public double salaryAfterTax() {
        return salary() - stateTax() - federalTax();

    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", State Tax= $" + stateTax() +
                ", Federal Tax= $" + federalTax() +
                ", Salary After Tax= $" + salaryAfterTax() +
                '}';
    }
}
