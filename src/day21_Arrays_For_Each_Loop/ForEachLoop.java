package day21_Arrays_For_Each_Loop;

public class ForEachLoop {
    public static void main(String[] args) {
// first condition is there has to be a data structure
// for each loop is the loop that's already iterated. Iteration starts from index 0
// when iteration does it is not important beginning or the ending point
// iteration times and orders are fixed
// as the iteration order is fixed you don't have to access  index numbers
//             for   int      each          array
            /*for(dataType VariableName : dataStructure) {
                Statement
            }
*/

int [] numbers = {10,20,30,40,50,60,70};
        for (int i = 0; i < numbers.length; i++) {
            int eachElements = numbers[i];
            System.out.println(eachElements); // this is for loop

        }

        System.out.println("------------------------------------------");

        for (int each : numbers ) {//each element of array
            System.out.println(each);
        }



    }
}
