package day21_Arrays_For_Each_Loop;

public class Arrays_AverageNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        double sum = 0;

        for(int each : numbers){
            sum += each;
        }
        double avarage = sum/ numbers.length;
        System.out.println("Avarage: "+avarage);
    }
}
