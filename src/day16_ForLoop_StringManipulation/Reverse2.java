package day16_ForLoop_StringManipulation;

public class Reverse2 {
    public static void main(String[] args) {
        String name = "Omer Umut Yalcin\nZeliha Yalcin\n" +
                       "Guldem Yalcin\nHacer Gul Yalcin\nMuhammet Ercan Yalcin";
        String result = "";

        for (int i =name.length()-1; i >=0 ; i--) {
            result+=name.charAt(i);

        }
        System.out.println(result);



    }
}
