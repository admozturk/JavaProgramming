package day19_LoopsPractises;

public class Task {
    public static void main(String[] args) {
        String str = "aaaabbbbcddf";
        int a = 0,
                b = 0,
                c = 0,
                d = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a'){
                a++;
            }if (ch=='b'){
                b++;
            }if (ch=='c'){
                c++;
            }if (ch=='d') {
                d++;

            }
        }

        System.out.println("a"+a +"b"+b+"c"+c+"d"+d);
    }
}
