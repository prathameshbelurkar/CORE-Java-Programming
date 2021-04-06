import java.lang.*;

class Product {
    //    Properties
    private String name;
    private double price;
    private int quantity;
    private String itemno;


    //    Getters And Setters
    public String getItemno() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }


//    Constructors

    public Product(String itno) {
        itemno = itno;
    }

    public Product(String itno, String n) {
        itemno = itno;
        name = n;
    }

    public Product(String itno, String n, int qty, double prc) {
        itemno = itno;
        name = n;
        quantity = qty;
        price = prc;
    }

}

class Customer {
    //    Properties
    private String customerId;
    private String name;
    private String address;
    private String phoneno;

    //    Getters And Setters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneno() {
        return phoneno;
    }



    public void setAddress(String addr) {
        address = addr;
    }

    public void setPhoneno(String no) {
        phoneno = no;
    }

//    Constructors
    public Customer(String n, String addr, String ph){
            setAddress(addr);
            setPhoneno(ph);
    }

}

public class Product_Customer {
    public static void main(String[] args) {

    }
}