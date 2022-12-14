package day01_JavaIntro;
import utilities.String_Utility;
import day24_CustomMethods_Return.ReturnMethodPractise_4;
import day24_CustomMethods_Return.ReturnMethod_Intro;

public class Test {
    public static void main(String[] args) {

        String str = "zzzbbbhhhgggffftttrrr";
        str = ReturnMethodPractise_4.removeDuplicates(str);
        System.out.println(str);

        System.out.println("--------------------------------");

        String name = "Java Programming";
        String reversedName = ReturnMethod_Intro.reverseWords(name);
        System.out.println(reversedName);

        System.out.println("------------------------------------------------");

        String eachchr = "Woden Spoon";
        String_Utility.printEachChar(eachchr);

    }

}

