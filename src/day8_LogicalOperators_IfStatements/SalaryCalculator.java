package day8_LogicalOperators_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTexRate = 26.2;


        int salaryBeforeTax = hourlyRate*weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax*federalTexRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTex = salaryBeforeTax - totalTax;


        System.out.println("salaryBeforeTax = $" + salaryBeforeTax);
        System.out.println("stateTax =  $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTex = $" + salaryAfterTex);
        System.out.println("The Net Salary is = $" + salaryAfterTex);









    }
}
