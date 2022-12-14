package day21_Arrays_For_Each_Loop;

public class Practise1 {
    public static void main(String[] args) {
        String [] words = {"Java programming","Wooden Spoon","Early birds","Angry birds"};

        for(String each:words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        }




    }
}
