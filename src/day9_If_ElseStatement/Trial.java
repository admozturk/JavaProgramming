package day9_If_ElseStatement;

public class Trial {
    public static void main(String[] args) {

        // write a program to find the middle number
       int a =15, // b 12 c 17
               b = 20,
               c = 10;

       boolean aIsMyGoal = a > b && a < c || a > c && a < b;
       boolean bIsMyGoal = b > a && a < c || b >c &&  b < a;
       boolean cIsMyGoal = !aIsMyGoal && !bIsMyGoal;

       if (aIsMyGoal){
           System.out.println(a+" is my goal");
       }
        if (bIsMyGoal){
            System.out.println(b+" is my goal");
        }
        if (cIsMyGoal){
            System.out.println(c+" is my goal");
        }



    }
}
