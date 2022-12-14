package day15_For_Loop;

public class ForLoopPractises {

    public static void main(String[] args) {

        for (int i = 15; i<=45; i++ ){
        System.out.print(i+"\n");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        for (int i = 100; i>49; i--){// i; 100,98,97,96......50
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        for (int i = 1; i<=55; i++){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();
        System.out.println("-------------------------------");

        for (int i = 2; i<=55;i += 2){//2,4,6,8,10,12
            System.out.print(i+ " ");
        }




    }
}
