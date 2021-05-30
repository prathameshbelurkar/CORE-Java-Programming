import java.lang.*;
import java.util.Scanner;


class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " has Checked his/her Balance...");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name + " has withdrawn rupees." + amount + " from his/her account...");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;

    Customer(String name, int amount, ATM obj) {
        this.name = name;
        this.amount = amount;
        atm = obj;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    @Override
    public void run() {
        useATM();
    }
}

public class Demo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        ATM atm = new ATM();

        Customer c1 = new Customer("Smith", 5000, atm);
        Customer c2 = new Customer("John", 9000, atm);
        Customer c3 = new Customer("Alex", 12000, atm);

        c1.start();
        c2.start();
        c3.start();

    }
}
