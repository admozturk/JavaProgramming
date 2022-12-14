package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Ahmed Kalay", 123456789);
        System.out.println(bankAccount1);

        bankAccount1.deposit(1000);
        bankAccount1.checkBalance();

        bankAccount1.withDraw(900);
        bankAccount1.checkBalance();

        System.out.println("--------------------------------------");

        BankAccount bankAccount2 = new BankAccount();
        bankAccount1.setInfo("Aygun kantarci", 324565789);

        bankAccount2.deposit(10000);
        bankAccount2.withDraw(3000);
        bankAccount2.checkBalance();





    }
}
