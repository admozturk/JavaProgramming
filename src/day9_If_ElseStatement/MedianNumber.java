package day9_If_ElseStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 5,
                b= 30,
                c = 40;
        boolean aIsMedian = a > b && a < c || a > c && a > b;
        // in order for 'a' to be median number
        // if 'c' is the max. number && 'b' is the min. number than 'a' is the median number

        boolean bIsMedian = b > c && b < a || b > a && b < c;

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a+" a is a median number");
        }
        if (bIsMedian){
            System.out.println(b+" b is a median number");
        }
        if (cIsMedian){
            System.out.println(c+" c is a median number");
        }
        // a b or c for each of them consider that 'a' is the median than find
        // other 2 values by yourself and compare them
        // find a medium number
        // a: 5 is my median number than I declare 'b' as 3 and 'c' as 7
        // b: 30 is my median number than I declare 'a' as 25 and 'c' as 35
        // c: 40 is my median number than I declare 'a' as 30 and 'c' as 50




    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */