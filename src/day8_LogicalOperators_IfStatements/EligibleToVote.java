package day8_LogicalOperators_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";



        // eligible
        if(isEligible){
            System.out.println("Eligible");
        }

        // not eligible
        if(!isEligible){
            System.out.println("Not eligible");
        }



    }
}
