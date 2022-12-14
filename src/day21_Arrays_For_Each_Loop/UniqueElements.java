package day21_Arrays_For_Each_Loop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"java", "java", "C#", "python", "python","PHP"};

        for (String each : words) {// each= "java", "java", "C#", "python", "python","PHP"

            int count = 0;
            for (String element : words) {//element= "java", "java", "C#", "python", "python","PHP"
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }

        }


    }
}
