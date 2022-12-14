package day28_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();

        list.add("java");  //0
        list.add("java");  //1
        list.add("java");  //2
        list.add("Python"); //3
        list.add("C#");  //4
        list.add("C#");  //5
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");// 9

        System.out.println(list);

        ArrayList<String > unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each)== list.lastIndexOf(each)){
                unique.add(each);
            }

        }

        System.out.println(unique);



    }
}
