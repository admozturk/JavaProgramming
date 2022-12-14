package day21_Arrays_For_Each_Loop;

public class Items {
    public static void main(String[] args) {
        String [] items =  {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
//                  index=     0         1           2        3         4              5
        double [] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50,  39.99};
//                  index=   0         1      2        3         4       5
        int    []  itemIDs =   {12345 ,  12346,  12347,  12348,  12349,   12350};
//                  index=       0         1       2      3        4        5

//          output: Item  -  price

//         it is not possible to do with for each loop because we use for each loop only for one array


        for (int i = 0; i < items.length; i++) {// while the index numbers are same length possible to do with one for loop
            String item = items[i];
            double price = prices[i];
            int   itemID = itemIDs[i];


            System.out.println(item+" - "+itemID+" - $"+price);

        }



    }
}
