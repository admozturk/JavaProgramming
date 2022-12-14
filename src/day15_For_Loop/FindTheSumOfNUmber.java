package day15_For_Loop;

public class FindTheSumOfNUmber {
    public static void main(String[] args) {


        int num = 753;
        int sum = 0;
        for (int i = num; i > 0 ; i=i/10) {
            sum=sum + i%10;
        }
        System.out.println("sum = " + sum);


        }


    }

