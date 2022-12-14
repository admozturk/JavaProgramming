package day17_While_do_WhileLoops;

public class FrequencyOfWordWhile2 {
    public static void main(String[] args) {

        String str = "java java java python python python";
               str = str.toLowerCase();

        int countJava = 0;
        int countPython= 0;

        while (str.contains("java")||str.contains("python")){

            if (str.contains("java")){
               str = str.replaceFirst("java","");
                countJava++;
            }

            if (str.contains("python")){
                str = str.replaceFirst("python","");
                countPython++;
            }
        }

        System.out.println("count java = " + countJava);
        System.out.println("count python = " + countPython);


    }
}
