package day19_LoopsPractises;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
           if (i==3){
              // break;//terminates the loop result 0,1,2
             //  continue;// it will only skip the number =3 result 0,1,2,4
                       // terminates the current iteration of the loop
               System.exit(0);// terminates all the program
           }
            System.out.println(i);
        }

        System.out.println("wooden spoon");


    }
}
