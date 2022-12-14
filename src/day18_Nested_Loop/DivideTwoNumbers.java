package day18_Nested_Loop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
    // division using Subtraction method
        int a = 100;// first execution; 20-7:23 if the condition is true again then 23-7: 14
        int b = 8;
        int count =0;// count = 1+1=2+1=3+1=4 her sonucu 1 arttitiyor
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count + " with a remainder of: "+a);





    }
}
