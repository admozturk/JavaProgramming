package day42_Exception_Continue;

public class Morning_Work_Out {
    public static void main(String[] args) {

        System.out.println("-----------------Push up started---------------------");

        for (int i = 1; i <=30; i++) {
            System.out.print("\rpush up "+i);
            sleep(1.5);
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
        System.out.println("-----------------Push up completed---------------------");

        System.out.println("-----------------Pull up started---------------------");
        for (int i = 1; i <=30; i++) {
            System.out.print("\rpull up " + i);
            sleep(1.5);
           /* try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }

        System.out.println("-----------------Pull up completed---------------------");


    }
    // Instead of always create try catch method for each Thread sleep exception we can create
    // our own sleep method so it will be easy to use always
    public static void sleep(double seconds ){
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
