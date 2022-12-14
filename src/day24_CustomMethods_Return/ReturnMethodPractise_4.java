package day24_CustomMethods_Return;

public class ReturnMethodPractise_4 {
    public static void main(String[] args) {

        String duplicates = removeDuplicates("aaabbbccckklllmmmnnnhhhgggfffddd");
        System.out.println(duplicates);


    }
    // create a method that can remove the duplicated characters from a string
    // and returns the new value
    // "aaabbccc"

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;

    }


}
