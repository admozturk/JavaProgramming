package day32_Conscructor_Overloading;

public class Carpet {

    // what is the Instance meaning in java?
    // Instance means; each object they have their own copy of that variables


   public double width, length;
   public double unitPrice;
   public boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
       double totalPrice = (width*length)*unitPrice;
       if (isPersian){
           totalPrice+=200;
       }
       return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unit Price= $" + unitPrice +
                ", is Persian=" + isPersian +
                ", Total Price= $" + calcCost() +
                '}';
    }
}
/*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)
				Add a constructor to set all the instances
                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitprice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */