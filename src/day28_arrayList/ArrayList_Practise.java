package day28_arrayList;

import java.util.ArrayList;

public class ArrayList_Practise {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);

        }

        System.out.println(list);

    }
    // multiply all the numbers by itself {1,2,3,4,5,6,}
}
