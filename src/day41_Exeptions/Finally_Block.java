package day41_Exeptions;

public class Finally_Block {


    public static void main(String[] args) {

        int [] arr = {1,2,3};


        try {
            System.out.println(arr [10]);
            System.out.println("Try Block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block");
        }




    }
}
